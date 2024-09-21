import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BorrowedBook {
    private String isbn;
    private String title;
    private String memberId;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private double dailyCharge = 5.0;
    private double lateFee = 10.0;

    public BorrowedBook(String isbn, String title, String memberId, LocalDate borrowDate, LocalDate dueDate) {
        this.isbn = isbn;
        this.title = title;
        this.memberId = memberId;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public String calculateCharges() {
        long daysBorrowed = ChronoUnit.DAYS.between(borrowDate, LocalDate.now());
        double totalCharge = daysBorrowed * dailyCharge;
        if (LocalDate.now().isAfter(dueDate)) {
            long lateDays = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
            totalCharge += lateDays * lateFee;
        }
        return "ISBN: " + isbn + ", Title: " + title + ", Total Charge: Rs " + totalCharge;
    }
}
