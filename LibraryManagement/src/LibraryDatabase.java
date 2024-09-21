import java.util.ArrayList;

public class LibraryDatabase {
    private ArrayList<Book> listOfBooks;

    public LibraryDatabase() {
        listOfBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        listOfBooks.add(book);
    }

    public void deleteBook(Book book) {
        listOfBooks.remove(book);
    }

    public void updateBook(Book oldBook, Book newBook) {
        int index = listOfBooks.indexOf(oldBook);
        if (index != -1) {
            listOfBooks.set(index, newBook);
        }
    }

    public void displayBooks() {
        for (Book book : listOfBooks) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }

    public Book searchBook(String title) {
        for (Book book : listOfBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
