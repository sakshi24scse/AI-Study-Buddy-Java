package UI;

import javax.swing.*;

public class LoginScreen extends JFrame {

    public LoginScreen() {
        setTitle("AI Study Buddy - Login");
        setSize(400, 300);

        JLabel label = new JLabel("Login Screen (Review 1 UI Prototype)");
        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
