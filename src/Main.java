package src;
import src.Frontend.Login.LogIn;
import src.Backend.Admin;
import src.Backend.Student;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Student student1 = new Student(1, "ahmed", 20, "Male", "Computer", 4.0);
        Student student2 = new Student(2, "sara", 19, "Female", "Computer", 3.0);
        Student student3 = new Student(3, "omar", 21, "Male", "Computer", 3.5);
        try {
            admin.addStudent(student1,"students.txt");
            admin.addStudent(student2,"students.txt");
            admin.addStudent(student3,"students.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        javax.swing.SwingUtilities.invokeLater(() -> {
            LogIn loginPage = new LogIn();
            loginPage.setVisible(true);
            loginPage.setLocationRelativeTo(null);
        });
    }
}
