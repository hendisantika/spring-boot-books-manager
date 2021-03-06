package com.hendisantika.controller;

import com.hendisantika.model.Book;
import com.hendisantika.model.Category;
import com.hendisantika.service.BookService;
import com.hendisantika.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-books-manager
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/09/21
 * Time: 06.47
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    /**
     * Displays a single Book
     * @param id            book Id
     * @param model         book object
     * @return              template for displaying a single book
     */
    @GetMapping( path = "/book/show/{id}")
    public String showSingleBook(@PathVariable("id") long id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        return "books/showById";
    }

    /**
     * New Book Form
     * @param model     book object
     * @return          template form for new book
     */
    @GetMapping( path = "/book/create")
    public String newBookForm(Model model) {
        model.addAttribute("book", new Book());
        Set<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);
        return "books/new";
    }

    /**
     * saves the details of "book/create" to DB
     * @param book      field values
     * @return          redirection to list view of all books
     */
    @PostMapping(path = "/book")
    public String saveNewBook(Book book) {
        long id = bookService.create(book);
        return "redirect:/books";
    }

    /**
     * Edit Form
     * @param id        book Id
     * @param model     book object
     * @return          template for editing a book
     */
    @GetMapping("/book/{id}")
    public String editBookForm(@PathVariable("id") long id, Model model) {
        Book book = bookService.findById(id);
        Set<Category> categories = categoryService.getAll();
        model.addAttribute("allCategories", categories);
        model.addAttribute("book", book);
        return "books/edit";
    }

    /**
     * shows all existing books in DB as list
     * @param model     book objects
     * @return          template for list view
     */
    @GetMapping({"/books", "/"})
    public String showAllBooks(Model model) {
        model.addAttribute("books", bookService.getAll());
        model.addAttribute("categories", categoryService.getAll());
        return "index";
    }

    /**
     * Saves book details from edit template for an existing book in DB
     * @param id        book Id
     * @param book      book details (of field values)
     * @return          redirection to list view of all books
     */
    @PostMapping(path = "/book/{id}")
    public String updateBook(@PathVariable("id") long id, Book book) {
        bookService.update(id, book);
        return "redirect:/books";    }

    /**
     * deletes existing book from DB
     * @param id        book Id
     * @return          redirection to list view of all books
     */
    @GetMapping(path = "/book/delete/{id}")
    public String deleteBook(@PathVariable("id") long id) {
        bookService.delete(id);
        return "redirect:/books";
    }
}
