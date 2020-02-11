import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(!isFull()) {
            this.books.add(book);
        }
    }

    public boolean isFull(){
        return countBooks() == this.capacity;
    }


}