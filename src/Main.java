import Frontend.Login.LogIn;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            LogIn loginPage = new LogIn();  
            loginPage.setVisible(true);
            loginPage.setLocationRelativeTo(null);
        });
    }
}
