package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Book {

    private BookRepository bookRepository;

    public Book(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBook(Model model)
    {
        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
}
