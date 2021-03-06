package com.hendisantika.controller;

import com.hendisantika.model.Book;
import com.hendisantika.model.Category;
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
 * Time: 06.51
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * Returns Form for new Category
     * @param model     contains Category Object
     * @return          template Form for new Category
     */
    @GetMapping( path = "/category/create")
    public String newCatForm(Model model) {
        model.addAttribute("category", new Category());
        return "categories/new";
    }

    /**
     * Save the Details of the NewCategoryForm in DD
     * @param category   contains field values
     * @return           redirection to categories list
     */
    @PostMapping(path = "/category")
    public String saveNewCategory(Category category) {
        long id = categoryService.create(category);
        return "redirect:/categories";
    }

    /**
     * Returns an Edit Form for an existing Category
     * @param id        Id of Category
     * @param model     contains Category Object
     * @return          edit Form
     */
    @GetMapping("/category/{id}")
    public String editCategoryForm(@PathVariable("id") long id, Model model) {
        Category category = categoryService.findById(id);
        model.addAttribute("category", category);
        return "categories/edit";
    }

    /**
     * Shows Books by Category
     * @param category_id        category_id
     * @param model              contains a Category and its Books
     * @return                   list view of books
     */
    @GetMapping("/category/books/{id}")
    public String showBooksByCategory(@PathVariable("id") long category_id, Model model) {
        Category category = categoryService.findById(category_id);
        Set<Book> books = category.getBooks();
        model.addAttribute("category", category);
        model.addAttribute("books", books);
        return "categories/showById";
    }

    /**
     * List/Table view of all existing Categories in Database
     * @param model         contains Categories from DB
     * @return              list view
     */
    @GetMapping("/categories")
    public String showAllCategories(Model model) {
        model.addAttribute("categories", categoryService.getAll());
        return "categories/list";
    }

    /**
     * After clicking "save" in the edit Category Form
     * details will be directed here
     * Saves updates existing Category Object in DB
     * @param id            category Id
     * @param category      field values of edit Form
     * @return
     */
    @PostMapping(path = "/category/{id}")
    public String updateCategory(@PathVariable("id") long id, Category category) {
        categoryService.update(id, category);
        return "redirect:/categories";    }

    /**
     * Deletes existing Object
     * @param id            Catefory Id
     * @return              redirect to list view of all Categories
     */
    @GetMapping(path = "/category/delete/{id}")
    public String deleteCategory(@PathVariable("id") long id) {
        categoryService.delete(id);
        return "redirect:/categories";
    }

}
