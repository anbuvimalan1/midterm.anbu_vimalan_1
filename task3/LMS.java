package midterm.anbu_vimalan_1.task2;
import java.util.ArrayList;
import java.util.List;

public class LMS {
    private List<Book> storage;

    // Constructor
    public LMS() {
        this.storage = new ArrayList<>();
    }

    // Add a book to the storage
    public void addBook(Book book) {
        storage.add(book);
    }

    // Remove a book from the storage
    public boolean removeBook(Book book) {
        return storage.remove(book);
    }

    // Print the contents of the storage
    public void printStorage() {
        for (Book book : storage) {
            System.out.println(book);
        }
    }
}
