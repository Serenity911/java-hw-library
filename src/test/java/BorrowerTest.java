import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    public Borrower borrower;
    public Book book1;
    public Book book2;
    public Library library;


    @Before
    public void before() {
        borrower = new Borrower("Bob");
        book1 = new Book ("Lotr", "Tolkien", "High Fantasy");
        book2 = new Book("The Hobbit", "Tolkien", "High Fantasy");
        library = new Library(3);
    }

    @Test
    public void starts_with_empty_borrowed_books(){
        assertEquals(0, borrower.countBorrowedBooks());
    }

    @Test
    public void can_borrow_a_book_in_stock(){
        library.addBook(book1);
        borrower.borrowBook(library, book1);
        assertEquals(1, borrower.countBorrowedBooks());
        assertEquals(0, library.countBooks());
        assertEquals(true, borrower.hasBorrowed(book1));

    }



    @Test
    public void cannot_borrow_a_book_if_not_in_stock(){
        library.addBook(book1);
        borrower.borrowBook(library, book2);
        assertEquals(0, borrower.countBorrowedBooks());
        assertEquals(1, library.countBooks());

    }

}
