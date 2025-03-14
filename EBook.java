public class EBook extends Book {
    private double fileSize; // in MB

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("E-Book - Title: " + getTitle() + ", Author: " + getAuthor() + ", File Size: " + fileSize + "MB");
    }
}
