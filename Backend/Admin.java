package Backend;


import javax.swing.*;
import java.util.ArrayList;

public class Admin {
    private ArrayList<Student> listOfStudents = new ArrayList<>();

    public Admin() {
        listOfStudents = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        listOfStudent.add(student);
        System.out.Println("Student was added successfully");
    }

    public void viewStudent() {
        int size = listOfStudents.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listOfStudents.get(j).getID() > listOfStudents.get(j + 1).getID()) {
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

}




}
