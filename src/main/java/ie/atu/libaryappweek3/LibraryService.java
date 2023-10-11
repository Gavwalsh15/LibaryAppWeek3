package ie.atu.libaryappweek3;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class LibraryService {
    ArrayList<Book> libraryBooks = new ArrayList<Book>();
    public String addBook(Book book) {
        String message = "Thank you for adding " + book.getTitle();
        libraryBooks.add(book);
        return message;
    }

    public ArrayList<Book> getBooks() {
        return libraryBooks;
    }
}
