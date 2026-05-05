import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.HashMap;

public class MainWindow extends JFrame {
    private final String userType;
    private final HashMap<String, BorrowedBook> borrowedBooks;
    private JButton viewBooksButton;
    private JButton borrowBookButton;
    private JButton calculateChargesButton;
    private JButton paymentButton;
    private JTextArea outputArea;

    public MainWindow(String userType) {
        this.userType = userType;
        borrowedBooks = new HashMap<>();
        initUI();
    }

    private void initUI() {
        setTitle("Library Management System - Main Window");
        setBounds(500,200,600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Buttons panel
        JPanel buttonPanel = new JPanel();


        buttonPanel.add(viewBooksButton);
        buttonPanel.add(borrowBookButton);
        buttonPanel.add(calculateChargesButton);
        buttonPanel.add(paymentButton);

        // Output area
        assert outputArea != null;
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add components to frame
        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Add ActionListeners
        assert viewBooksButton != null;
        viewBooksButton.addActionListener(_ -> showBooks());

        assert borrowBookButton != null;
        borrowBookButton.addActionListener(_ -> handleBorrowBook());

        assert calculateChargesButton != null;
        calculateChargesButton.addActionListener(_ -> calculateCharges());

        assert paymentButton != null;
        paymentButton.addActionListener(_ -> handlePayment());

        // Disable borrow and payment buttons for staff
        if (userType.equals("staff")) {
            borrowBookButton.setEnabled(false);
            paymentButton.setEnabled(false);
        }
    }

    private void showBooks() {
        // Book list
        String books = """
                ISBN: 29045, Title: C Programming, Available
                ISBN: 44714, Title: Artificial Intelligence, Available
                ISBN: 88230, Title: Big Data, Available
                ISBN: 44431, Title: Database Management System, Available
                ISBN: 60371, Title: Web Development, Available
                ISBN: 78336, Title: Object Oriented Language, Available
                ISBN: 92058, Title: Object Componet and Technology, Available
                
                """;
        outputArea.setText("Available Books:\n" + books);
    }

    private void handleBorrowBook() {
        String isbn = JOptionPane.showInputDialog("Enter ISBN of the book to borrow:");
        if (isbn != null && !isbn.isEmpty()) {
            if (!borrowedBooks.containsKey(isbn)) {
                BorrowedBook book = new BorrowedBook(isbn, "Title", "member", LocalDate.now(), LocalDate.now().plusDays(14));
                borrowedBooks.put(isbn, book);
                outputArea.setText("Book borrowed successfully: " + book.getTitle());
            } else {
                outputArea.setText("Book is already borrowed.");
            }
        } else {
            outputArea.setText("ISBN cannot be empty.");
        }
    }

    private void calculateCharges() {
        if (borrowedBooks.isEmpty()) {
            outputArea.setText("No books borrowed.");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Charges:\n");
            for (BorrowedBook book : borrowedBooks.values()) {
                sb.append(book.calculateCharges()).append("\n");
            }
            outputArea.setText(sb.toString());
        }
    }

    private void handlePayment() {
        PaymentWindow paymentWindow = new PaymentWindow(borrowedBooks);
        paymentWindow.setVisible(true);
    }
}
