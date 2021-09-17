package com.hendisantika.repository;

import com.hendisantika.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-books-manager
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/09/21
 * Time: 05.58
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
