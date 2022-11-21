import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.GridLayout;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 30, 30));
        JButton jButton = new JButton("Log in");
        JLabel jLabel = new JLabel();

        // JCheckBox jCheckBox = new JCheckBox("CheckBox");
        jPanel.setLayout(new GridLayout(0, 2));

        JLabel usernameLabel = new JLabel("UserName: ");
        JLabel passLabel = new JLabel("Password: ");
        JFormattedTextField username = new JFormattedTextField();
        JPasswordField password = new JPasswordField();

        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("User " + username.getText() + " has logged in!");
            }
        });

        jPanel.add(usernameLabel);
        jPanel.add(passLabel);
        jPanel.add(username);
        jPanel.add(password);
        jPanel.add(jButton);
        jPanel.add(jLabel);

        jFrame.add(jPanel);
        jFrame.pack();
        jFrame.setVisible(true);
    }

}
