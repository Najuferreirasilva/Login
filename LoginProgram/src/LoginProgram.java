import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginProgram extends JFrame implements ActionListener {
    JTextField usernameField;
    JPasswordField passwordField;

    public LoginProgram() {
        setTitle("Login Program");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        panel.add(usernameLabel);

        usernameField = new JTextField();
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(this);
        panel.add(okButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        JOptionPane.showMessageDialog(this, "Seja bem vindo(a), " + username + "! Sua senha é " + password + ".", "Login Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new LoginProgram();
    }
}
