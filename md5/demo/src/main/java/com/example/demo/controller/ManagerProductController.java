package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.IProductService;
import com.example.demo.service.IProductTypeService;
import com.example.demo.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ManagerProductController {

    @Autowired
    private IProductService productService;
    @Autowired
    private IProductTypeService productTypeService;

    @GetMapping("/")
    public ResponseEntity<Page<Product>> list(@RequestParam(defaultValue = "0") int page,
                                              @RequestParam(required = false, defaultValue = "") String name) {
        return new ResponseEntity<>(productService.findByAll(name, PageRequest.of(page, 5)), HttpStatus.OK);
    }

//    @PostMapping("/create")
//    public ResponseEntity<> create(){
//
//    }
}
