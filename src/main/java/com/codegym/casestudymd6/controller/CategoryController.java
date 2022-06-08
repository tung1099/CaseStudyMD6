package com.codegym.casestudymd6.controller;

import com.codegym.casestudymd6.model.Category;
import com.codegym.casestudymd6.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categories")
@CrossOrigin("*")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public ResponseEntity<Iterable<Category>> showAllCategory(){
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }
}
