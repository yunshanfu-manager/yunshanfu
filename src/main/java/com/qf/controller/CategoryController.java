package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public BaseResp findAll(){
       return categoryService.findAll();
    }
}
