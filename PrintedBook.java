public class PrintedBook extends Book {
    private int pageCount;

    public PrintedBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Printed Book - Title: " + getTitle() + ", Author: " + getAuthor() + ", Pages: " + pageCount);
    }
}
