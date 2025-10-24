package Backend;


import javax.swing.*;
import java.util.ArrayList;

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
 public void updateStudent(ٍStudent student){
    System.out.println(student);
    student.setGpa(GPA);
    student.setStudentID(ID);
    student.setAge(age);
    student.setName(name);
    student.setDepartment(department);
    System.out.println("Information updated! ");

 }




}
