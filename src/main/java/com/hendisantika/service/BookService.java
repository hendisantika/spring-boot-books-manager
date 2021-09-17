package com.hendisantika.service;

import com.hendisantika.model.Book;
import com.hendisantika.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-books-manager
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/09/21
 * Time: 05.59
 */
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    /**
     * gets all Books from Database
     *
     * @return a Set containing Books
     */
    public Set<Book> getAll() {
        Set<Book> bookSet = new HashSet<>();
        bookRepository.findAll().iterator().forEachRemaining(bookSet::add);
        return bookSet;
    }

    /**
     * finds a Book in DB by its ID
     *
     * @param bookId Database ID of Book
     * @return Book with ID = bookId
     */
    public Book findById(Long bookId) {
        Optional<Book> bookOptional = bookRepository.findById(bookId);

        if (!bookOptional.isPresent()) {
            throw new RuntimeException("Book Not Found!");
        }
        return bookOptional.get();
    }

    /**
     * Updates a Book with
     *
     * @param bookId      ID of Book
     * @param bookDetails Book details from EDIT FORM
     */
    public void update(Long bookId, Book bookDetails) {
        Book currentBook = findById(bookId);
        currentBook.setTitle(bookDetails.getTitle());
        currentBook.setAuthor(bookDetails.getAuthor());
        currentBook.setCategories(bookDetails.getCategories());
        currentBook.setDescription(bookDetails.getDescription());
        currentBook.setDateField(bookDetails.getDateField());

        bookRepository.save(currentBook);
    }

    /**
     * delete a Book from DB
     *
     * @param bookId ID of Book
     */
    public void delete(Long bookId) {
        bookRepository.deleteById(bookId);
    }

    /**
     * creates and inserts a new Book in DB
     *
     * @param bookDetails Book details from NEW Book FROM
     * @return id of new Book
     */
    public Long create(Book bookDetails) {
        bookRepository.save(bookDetails);
        return bookDetails.getId();
    }

}
