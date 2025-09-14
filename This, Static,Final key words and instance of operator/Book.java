class Book {
    static String lib = "Central Library";
    final String isbn;
    String title, author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void showLib() {
        System.out.println("Library: " + lib);
    }

    void show() {
        if (this instanceof Book) {
            System.out.println(title + " - " + author + " - " + isbn);
        }
    }

    public static void main(String[] args) {
        Book.showLib();
        Book b1 = new Book("Java", "Gosling", "111");
        b1.show();
    }
}