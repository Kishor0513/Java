import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryManagementSystem {
    private static LibraryManagementSystem instance = null;
    private JTextField userField;
    private JLabel userLabel;
    private JLabel passLabel;
    private JPasswordField passField;
    private JButton loginButton;
    private JLabel Password;
    private JButton button;

    private LibraryManagementSystem() {
        // private constructor to restrict instantiation
    }

    public static LibraryManagementSystem getInstance() {
        if (instance == null) {
            instance = new LibraryManagementSystem();
        }
        return instance;
    }

    public void displayLogin() {
        JFrame loginFrame = new JFrame("Library Management System - Login");
        loginFrame.setBounds(500,200,400, 300);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(new GridLayout(4, 2));


        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(3);
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(3);
        JButton loginButton = new JButton("Login");
        JLabel statusLabel = new JLabel();

        loginFrame.add(userLabel);
        loginFrame.add(userField);
        loginFrame.add(passLabel);
        loginFrame.add(passField);
        loginFrame.add(new JLabel()); // empty cell
        loginFrame.add(loginButton);
        loginFrame.add(statusLabel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (validateLogin(username, password)) {
                    loginFrame.dispose();
                    displayMainMenu();
                } else {
                    statusLabel.setText("Invalid credentials. Try again.");
                }
            }
        });

        loginFrame.setVisible(true);
    }

    private boolean validateLogin(String username, String password) {
        return username.equals("admin") && password.equals("password");
    }

    public void displayMainMenu() {
        JFrame mainMenuFrame = new JFrame("Library Management System - Main Menu");
        mainMenuFrame.setBounds(500,200,600, 400);
        mainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenuFrame.setLayout(new GridLayout(2, 1));

        JLabel titleLabel = new JLabel("Library Management System", SwingConstants.CENTER);
        JButton userButton = new JButton("User Management");
        JButton librarianButton = new JButton("Librarian Management");
        JButton bookButton = new JButton("Book Management");
        JButton accountButton = new JButton("Account Management");
        JButton databaseButton = new JButton("Library Database Management");
        JButton staffButton = new JButton("Staff Management");
        JButton studentButton = new JButton("Student Management");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));

        buttonPanel.add(userButton);
        buttonPanel.add(librarianButton);
        buttonPanel.add(bookButton);
        buttonPanel.add(accountButton);
        buttonPanel.add(databaseButton);
        buttonPanel.add(staffButton);
        buttonPanel.add(studentButton);

        // Action listeners for each button
        userButton.addActionListener(e -> openUserManagementWindow());
        librarianButton.addActionListener(e -> openLibrarianManagementWindow());
        bookButton.addActionListener(e -> openBookManagementWindow());
        accountButton.addActionListener(e -> openAccountManagementWindow());
        databaseButton.addActionListener(e -> openLibraryDatabaseManagementWindow());
        staffButton.addActionListener(e -> openStaffManagementWindow());
        studentButton.addActionListener(e -> openStudentManagementWindow());

        mainMenuFrame.add(titleLabel);
        mainMenuFrame.add(buttonPanel);
        mainMenuFrame.setVisible(true);
    }

    private void openUserManagementWindow() {
        JFrame userFrame = new JFrame("User Management");
        userFrame.setSize(400, 300);
        userFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        userFrame.setLayout(new FlowLayout());
        userFrame.add(new JLabel("User Management Functionality Here"));
        userFrame.setVisible(true);
    }

    private void openLibrarianManagementWindow() {
        JFrame librarianFrame = new JFrame("Librarian Management");
        librarianFrame.setSize(400, 300);
        librarianFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        librarianFrame.setLayout(new FlowLayout());
        librarianFrame.add(new JLabel("Librarian Management Functionality Here"));
        librarianFrame.setVisible(true);
    }

    private void openBookManagementWindow() {
        JFrame bookFrame = new JFrame("Book Management");
        bookFrame.setSize(400, 300);
        bookFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        bookFrame.setLayout(new FlowLayout());
        bookFrame.add(new JLabel("Book Management Functionality Here"));
        bookFrame.setVisible(true);
    }

    private void openAccountManagementWindow() {
        JFrame accountFrame = new JFrame("Account Management");
        accountFrame.setSize(400, 300);
        accountFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        accountFrame.setLayout(new FlowLayout());
        accountFrame.add(new JLabel("Account Management Functionality Here"));
        accountFrame.setVisible(true);
    }

    private void openLibraryDatabaseManagementWindow() {
        JFrame databaseFrame = new JFrame("Library Database Management");
        databaseFrame.setSize(400, 300);
        databaseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        databaseFrame.setLayout(new FlowLayout());
        databaseFrame.add(new JLabel("Library Database Management Functionality Here"));
        databaseFrame.setVisible(true);
    }

    private void openStaffManagementWindow() {
        JFrame staffFrame = new JFrame("Staff Management");
        staffFrame.setSize(400, 300);
        staffFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        staffFrame.setLayout(new FlowLayout());
        staffFrame.add(new JLabel("Staff Management Functionality Here"));
        staffFrame.setVisible(true);
    }

    private void openStudentManagementWindow() {
        JFrame studentFrame = new JFrame("Student Management");
        studentFrame.setSize(400, 300);
        studentFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        studentFrame.setLayout(new FlowLayout());
        studentFrame.add(new JLabel("Student Management Functionality Here"));
        studentFrame.setVisible(true);
    }
}
