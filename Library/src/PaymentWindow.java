import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class PaymentWindow extends JFrame {
    private JTextArea paymentArea;
    private JButton payButton;
    private final HashMap<String, BorrowedBook> borrowedBooks;

    public PaymentWindow(HashMap<String, BorrowedBook> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
        initUI();
    }

    private void initUI() {
        setTitle("Payment - Library Management System");
        setBounds(500,200,400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Payment details area
//        paymentArea = new JTextArea();
        assert paymentArea != null;
        paymentArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(paymentArea);

        // Pay button
        JPanel buttonPanel = new JPanel();
//        payButton = new JButton("Pay");
        buttonPanel.add(payButton);

        // Add components to frame
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Button action
        assert payButton != null;
        payButton.addActionListener(_ -> handlePayment());

        loadPaymentDetails();
    }

    private void loadPaymentDetails() {
        if (borrowedBooks.isEmpty()) {
            paymentArea.setText("No books borrowed.");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Payment Details:\n");
            for (BorrowedBook book : borrowedBooks.values()) {
                sb.append(book.calculateCharges()).append("\n");
            }
            paymentArea.setText(sb.toString());
        }
    }

    private void handlePayment() {
        JOptionPane.showMessageDialog(this, "Payment successful!", "Payment", JOptionPane.INFORMATION_MESSAGE);
        borrowedBooks.clear();  // Clear borrowed books after payment
        dispose();  // Close the payment window
    }
}
