package src;
import src.Frontend.Login.LogIn;

import java.util.ArrayList;

import src.Backend.Admin;
import src.Backend.Student;

public class Main {
    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(() -> {
            LogIn loginPage = new LogIn();
            loginPage.setVisible(true);
            loginPage.setLocationRelativeTo(null);
        });
    }
}
