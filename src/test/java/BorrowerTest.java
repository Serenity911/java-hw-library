import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    public Borrower borrower;
    public Book book1;


    @Before
    public void before() {
        borrower = new Borrower("Bob");
        book1 = new Book ("Lotr", "Tolkien", "High Fantasy");
    }

    @Test
    public void starts_with_empty_borrowed_books(){
        assertEquals(0, borrower.countBorrowedBooks());
    }

//    @Test
//    public void can_borrow_a_book(){
//        borrower.borrowBook(book1);
//        assertEquals(1, borrower.countBorrowedBooks());
//    }

}
