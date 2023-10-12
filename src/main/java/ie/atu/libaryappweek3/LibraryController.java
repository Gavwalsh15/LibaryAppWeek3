package ie.atu.libaryappweek3;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@RestController
public class LibraryController {
    private final LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService ls) {
        this.libraryService = ls;
    }

    @PostMapping("/addBook")
    @ResponseStatus(HttpStatus.CREATED)
    public String addBook(@RequestBody Book book){
        return libraryService.addBook(book);
    }

    @PostMapping("/getBooks")
    @ResponseStatus(HttpStatus.CREATED)
    public ArrayList<Book> getLibrary() {
        return libraryService.getBooks();
    }
}
