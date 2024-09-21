import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel statusLabel;

    public LoginPage() {
        initUI();
    }

    private void initUI() {
        setTitle("Library Management System - Login");
        setBounds(500,200,400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Username input
        JPanel usernamePanel = new JPanel();
        usernamePanel.add(new JLabel("Username:"));
        usernameField = new JTextField(20);
        usernamePanel.add(usernameField);

        // Password input
        JPanel passwordPanel = new JPanel();
        passwordPanel.add(new JLabel("Password:"));
        passwordField = new JPasswordField(20);
        passwordPanel.add(passwordField);

        // Login button
        JPanel buttonPanel = new JPanel();
        loginButton = new JButton("Login");
        buttonPanel.add(loginButton);

        // Status label
        statusLabel = new JLabel("", SwingConstants.CENTER);

        // Add components to the frame
        add(usernamePanel);
        add(passwordPanel);
        add(buttonPanel);
        add(statusLabel);

        // Add ActionListener to login button
        loginButton.addActionListener(_ -> handleLogin());
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            statusLabel.setText("Please enter both username and password.");
            return;
        }

        // Check credentials
        if ((username.equals("Kishor") && password.equals("panda123")) ||
            (username.equals("staff") && password.equals("staff123"))) {
            dispose();
            MainWindow mainWindow = new MainWindow(username);
            mainWindow.setVisible(true);
        } else {
            statusLabel.setText("Invalid credentials. Please try again.");
        }
    }
}
