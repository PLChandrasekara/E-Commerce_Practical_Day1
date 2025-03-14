public class LibraryApp {
    public static void main(String[] args) {
        
        Book printedBook = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 180);
        Book eBook = new EBook("1984", "George Orwell", 2.5);
        Book audioBook = new AudioBook("The Hobbit", "J.R.R. Tolkien", 11.2);

        
        Library library = new Library(printedBook, eBook, audioBook);

       
        library.displayBooks();
    }
}
