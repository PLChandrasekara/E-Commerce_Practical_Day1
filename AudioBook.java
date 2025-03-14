public class AudioBook extends Book {
    private double duration; 

    public AudioBook(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("Audio Book - Title: " + getTitle() + ", Author: " + getAuthor() + ", Duration: " + duration + " hours");
    }
}
