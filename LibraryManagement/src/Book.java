public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String publication;

    public Book(String title, String author, String ISBN, String publication) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publication = publication;
    }

    // Getters and Setters for Book attributes
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    // Book-specific methods
}
    