package midterm.anbu_vimalan_1.task2;

public class LibraryTester {
    public static void main(String[] args) {
        // Create some Book objects
        Book book1 = new Book("The Post Office", "Rabindranath Tagore");
        Book book2 = new Book("Malgudi days", "R K Narayan");
        Book book3 = new Book("The private life of an indian prince", "Mulk Raj Anand");

        // Create an LMS object
        LMS lms = new LMS();

        // Add the books to the library
        lms.addBook(book1);
        lms.addBook(book2);
        lms.addBook(book3);

        // Print the contents of the library
        System.out.println("Library Contents:");
        lms.printStorage();

        // Remove a book from the library
        System.out.println("\nRemoving book: " + book2);
        boolean removed = lms.removeBook(book2);
        if (removed) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found in the library.");
        }

        // Print the updated contents of the library
        System.out.println("\nUpdated Library Contents:");
        lms.printStorage();
    }
}
