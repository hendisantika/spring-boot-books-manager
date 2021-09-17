package com.hendisantika.service;

import com.hendisantika.model.Category;
import com.hendisantika.repository.CategoryRepository;
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
 * Time: 06.02
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * gets all Categories from Database
     *
     * @return a Set containing Categories
     */
    public Set<Category> getAll() {
        Set<Category> categorySet = new HashSet<>();
        categoryRepository.findAll().iterator().forEachRemaining(categorySet::add);
        return categorySet;
    }

    /**
     * finds a Category in DB by its ID
     *
     * @param catId Database ID of Category
     * @return Category with ID = catId
     */
    public Category findById(Long catId) {
        Optional<Category> categoryOptional = categoryRepository.findById(catId);

        if (!categoryOptional.isPresent()) {
            throw new RuntimeException("Category Not Found!");
        }
        return categoryOptional.get();
    }

}
