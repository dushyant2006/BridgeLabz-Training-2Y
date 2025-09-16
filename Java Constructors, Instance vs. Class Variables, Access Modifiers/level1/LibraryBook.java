class LibraryBook {
    String title, author;
    double price;
    boolean available = true;
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void borrowBook() {
        if (available) available = false;
    }
}