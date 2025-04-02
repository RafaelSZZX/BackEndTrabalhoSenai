package com.projetobackend.demo.controllers;


import com.projetobackend.demo.dto.ProductRecordDto;
import com.projetobackend.demo.models.ProductModel;
import com.projetobackend.demo.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/produto")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecordDto productRecordDto) {
        var produtModel = new ProductModel();
        BeanUtils.copyProperties(productRecordDto, produtModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(produtModel));
    }

    @GetMapping
    public ResponseEntity<List<ProductModel>> getAllProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(productRepository.findAll());
    }
}
