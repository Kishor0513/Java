public class Librarian extends User {
    private String password;
    private String searchString;

    public Librarian(String name, int id, String password) {
        super(name, id);
        this.password = password;
    }

    // Getters and Setters for Librarian attributes
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    // Librarian-specific methods
}
