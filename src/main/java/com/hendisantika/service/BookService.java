package com.hendisantika.service;

import com.hendisantika.model.Book;
import com.hendisantika.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
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

}
