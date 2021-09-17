package com.hendisantika.controller;

import com.hendisantika.model.Category;
import com.hendisantika.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
