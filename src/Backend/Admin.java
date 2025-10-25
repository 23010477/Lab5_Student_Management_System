package src.Backend;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    public static ArrayList<Student> listOfStudents = new ArrayList<>();// here I changed it from private to public
                                                                        // static so can call it in student class

    public Admin() {
        listOfStudents = new ArrayList<Student>();
    }

    public void addStudent(Student student,String fileName)throws IOException {
        int checkID=student.getStudentID();
        boolean isThere=false;
        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            String info;
            while ((info = read.readLine()) != null) {
                String[] splitInfo = info.split(",");
                int ID = Integer.parseInt(splitInfo[0]);
               if(ID==checkID) {
                   isThere = true;
               break;
               }

            }
        } catch (Exception e) {
            System.out.println("Cant load from file!");
            e.printStackTrace();
        }
        if(isThere)
        {
            System.out.println("Student already exists");
        }
        else {
            listOfStudents.add(student);
            System.out.println("Student was added successfully");
        }

    }
    public ArrayList<Student> viewStudent() {
        int size = listOfStudents.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (listOfStudents.get(j).getStudentID() > listOfStudents.get(j + 1).getStudentID()) {
                    Student temp = listOfStudents.get(j);
                    listOfStudents.set(j, listOfStudents.get(j + 1));
                    listOfStudents.set(j + 1, temp);
                }
            }
        }
        for (Student student : listOfStudents) {
            System.out.println(student);
        }
        return listOfStudents;
    }

    public void deleteStudent(Student student) {
        System.out.println(student);
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this student?");

        if (confirm == 0)

        {
            listOfStudents.remove(student);
            JOptionPane.showMessageDialog(null, "Student got deleted!");
        } else

        {
            JOptionPane.showMessageDialog(null, "It was not confirmed!");
        }

    }

    public void searchStudent(int ID) {
       boolean isFound=false;
        for (Student s : listOfStudents) {
            if (s.getStudentID() == ID) {
                System.out.println(s);
                isFound=true;
                break;
            }
        }
        if(!isFound)
        {
            System.out.println("Student was not found");
        }


    }

    public void updateStudent(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(student);
        System.out.println("Set the new GPA: ");
        student.setGpa(scanner.nextDouble());
        System.out.println("Set the new ID: ");
        student.setStudentID(scanner.nextInt());
        System.out.println("Set the new Age: ");
        student.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Set the new Name: ");
        student.setName(scanner.nextLine());
        System.out.println("Set the new Department: ");
        student.setDepartment(scanner.nextLine());
        System.out.println("Set the new Gender: ");
        student.setGender(scanner.nextLine());
        System.out.println("Information updated! ");

    }

    public void writeToFile(String fileName) throws IOException {
        try (PrintWriter studentInfo = new PrintWriter(new FileWriter(fileName))) {
            for (Student student : listOfStudents) {
                studentInfo.println(student.getStudentID() + "," +
                        student.getName() + "," + student.getAge() + "," + student.getGender() + "," +
                        student.getDepartment() + "," + student.getGpa());
            }
            studentInfo.close();
        } catch (Exception e) {
            System.out.println("Cant save data");
            e.printStackTrace();

        }

    }

    public void loadFile(String fileName) throws IOException {
        listOfStudents.clear();
        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            String info;
            while ((info = read.readLine()) != null) {
                String[] splitInfo = info.split(",");

                int ID = Integer.parseInt(splitInfo[0]);
                String name = splitInfo[1];
                int age = Integer.parseInt(splitInfo[2]);
                String gender = splitInfo[3];
                String department = splitInfo[4];
                double GPA = Double.parseDouble(splitInfo[5]);

                Student student = new Student(ID, name, age, gender, department, GPA);
                listOfStudents.add(student);
            }
        } catch (Exception e) {
            System.out.println("Cant load from file!");
            e.printStackTrace();
        }
    }
   public ArrayList<Student> sortGPA(){
       int size = listOfStudents.size();
       for (int i = 0; i < size - 1; i++) {
           for (int j = 0; j < size - i - 1; j++) {
               if (listOfStudents.get(j).getGpa() < listOfStudents.get(j + 1).getGpa()) {
                   Student temp = listOfStudents.get(j);
                   listOfStudents.set(j, listOfStudents.get(j + 1));
                   listOfStudents.set(j + 1, temp);
               }
           }
       }
       System.out.println("Sorted GPA high to low!");
       for (Student student : listOfStudents) {
           System.out.println(student);
       }
       return listOfStudents;
 }
    public ArrayList<Student> filterGPA(double min){
ArrayList<Student> filteredStudent=new ArrayList<>();
 for(Student s:listOfStudents){
     if(s.getGpa()>=min)
         filteredStudent.add(s);
 }
 System.out.println("GPA filtered to show larger than or equal "+min);
 for(Student s:filteredStudent)
 {
     System.out.println(s);
 }
 return filteredStudent;

    }
    
}
