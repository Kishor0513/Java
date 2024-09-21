public class Account {
    private int noBorrowedBooks;
    private int noReservedBooks;
    private int noReturnedBooks;
    private int noLostBooks;
    private double fineAmount;

    public Account() {
        // Constructor logic
    }

    // Getters and Setters for Account attributes
    public int getNoBorrowedBooks() {
        return noBorrowedBooks;
    }

    public void setNoBorrowedBooks(int noBorrowedBooks) {
        this.noBorrowedBooks = noBorrowedBooks;
    }

    public int getNoReservedBooks() {
        return noReservedBooks;
    }

    public void setNoReservedBooks(int noReservedBooks) {
        this.noReservedBooks = noReservedBooks;
    }

    public int getNoReturnedBooks() {
        return noReturnedBooks;
    }

    public void setNoReturnedBooks(int noReturnedBooks) {
        this.noReturnedBooks = noReturnedBooks;
    }

    public int getNoLostBooks() {
        return noLostBooks;
    }

    public void setNoLostBooks(int noLostBooks) {
        this.noLostBooks = noLostBooks;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public void calculateFine() {
        // Logic to calculate fine
    }
}
