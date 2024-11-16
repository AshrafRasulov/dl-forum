package com.forum.forumnew.controller;

import com.forum.forumnew.View.CategoryResponse;
import com.forum.forumnew.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("category/")
public class CategoryController {
    private CategoryService categoryService;

    @GetMapping("bobayoba")
    public CategoryResponse ActiveIndex(){
        return categoryService.Catigorissimus();
    }
}
