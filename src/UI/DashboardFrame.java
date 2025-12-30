package UI;

import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.io.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {
        setTitle("AI Study Buddy");
        setSize(400, 200);
        setLayout(new FlowLayout());

        JButton btn = new JButton("Get Study Suggestion");
        JTextArea area = new JTextArea(5, 30);

        btn.addActionListener(e -> {
            try {
                URL url = new URL("http://localhost:8080/AIStudyBuddy/suggest?id=1");
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(url.openStream()));
                area.setText(br.readLine());
            } catch (Exception ex) {
                area.setText("Server not running");
            }
        });

        add(btn);
        add(area);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DashboardFrame();
    }
}
