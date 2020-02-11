import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    public Library library;
    public Book book1;
    public Book book2;
    public Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Lotr", "Tolkien", "High Fantasy");
        book2 = new Book("The Hobbit", "Tolkien", "High Fantasy");
        book3 = new Book("The Alchemist", "Coelho", "Novel");
    }

    @Test
    public void books_start_empty(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void add_book_to_Library(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void can_be_full(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(true, library.isFull());
    }

    @Test
    public void cannot_add_to_library_if_full(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.countBooks());
    }
}
