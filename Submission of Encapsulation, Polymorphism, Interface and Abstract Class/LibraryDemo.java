abstract class LibraryItem {
    private String id;
    private String title;

    LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }

    abstract int loanDays();
}

interface Reservable {
    void reserve();
    boolean available();
}

class Book extends LibraryItem implements Reservable {
    Book(String id, String title) { super(id, title); }

    @Override
    int loanDays() { return 14; }

    @Override
    public void reserve() { System.out.println(getTitle() + " reserved"); }

    @Override
    public boolean available() { return true; }
}

class Magazine extends LibraryItem implements Reservable {
    Magazine(String id, String title) { super(id, title); }

    @Override
    int loanDays() { return 7; }

    @Override
    public void reserve() { System.out.println(getTitle() + " reserved"); }

    @Override
    public boolean available() { return true; }
}

class DVD extends LibraryItem implements Reservable {
    DVD(String id, String title) { super(id, title); }

    @Override
    int loanDays() { return 3; }

    @Override
    public void reserve() { System.out.println(getTitle() + " reserved"); }

    @Override
    public boolean available() { return true; }
}

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B101", "Java Basics"),
            new Magazine("M102", "Tech Monthly"),
            new DVD("D103", "Inception")
        };

        for(LibraryItem i : items) {
            System.out.println(i.getTitle() + " Loan Days: " + i.loanDays());
        }
    }
}
