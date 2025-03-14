public class Library {
    private Book book1;
    private Book book2;
    private Book book3;

    public Library(Book book1, Book book2, Book book3) {
        this.book1 = book1;
        this.book2 = book2;
        this.book3 = book3;
    }

    public void displayBooks() {
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}

