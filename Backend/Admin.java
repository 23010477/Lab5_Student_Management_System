package Backend;


import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private ArrayList<Student> listOfStudents = new ArrayList<>();

    public Admin() {
        listOfStudents = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        listOfStudents.add(student);
        System.out.println("Student was added successfully");
    }

    public void viewStudent() {
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
    }

    public void deleteStudent(Student student) {
        System.out.println(student);
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this student?");

if(confirm==0)

    {
        listOfStudents.remove(student);
        JOptionPane.showMessageDialog(null, "Student got deleted!");
    }
else

    {
        JOptionPane.showMessageDialog(null, "It was not confirmed!");
    }

}
public void searchStudent(int ID){
        for(Student s:listOfStudents){
            if(s.getStudentID()==ID)
            {
                System.out.println(s);
            }
        }
}
 public void updateStudent(Student student){
        Scanner scanner=new Scanner(System.in);
    System.out.println(student);
    System.out.println("Set the new GPA: ");
    student.setGpa(scanner.nextDouble());
     System.out.println("Set the new ID: ");
    student.setStudentID(scanner.nextInt());
     System.out.println("Set the new Age: ");
    student.setAge(scanner.nextInt());
     System.out.println("Set the new Name: ");
    student.setName(scanner.nextLine());
     System.out.println("Set the new Department: ");
    student.setDepartment(scanner.nextLine());
     System.out.println("Set the new Gender: ");
     student.setGender(scanner.nextLine());
    System.out.println("Information updated! ");

 }
 public void writeToFile(String fileName) throws IOException {
try(PrintWriter studentInfo=new PrintWriter(new FileWriter(fileName))) {
    for (Student student : listOfStudents) {
        studentInfo.println(student.getStudentID() + "," +
                student.getName() + "," + student.getAge() + "," + student.getGender() + "," +
                student.getDepartment() + "," + student.getGpa());
    }
    studentInfo.close();
}catch(Exception e){
    System.out.println("Cant save data");
    e.printStackTrace();

}


 }

public void loadFile(String fileName){

}


}
