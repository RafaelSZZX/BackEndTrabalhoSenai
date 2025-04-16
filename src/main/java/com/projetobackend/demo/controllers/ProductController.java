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
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/produto")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecordDto productRecordDto) {
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productRecordDto, productModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
    }

    @GetMapping
    public ResponseEntity<List<ProductModel>> getAllProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(productRepository.findAll());
    }


    @GetMapping("/id")
    public ResponseEntity<Object> getOneProduct(@PathVariable(value = "id") int id) {
        Optional<ProductModel> productModel = productRepository.findById(id);
        if (productModel.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(productModel.get());
    }


    @PutMapping("/id")
    public ResponseEntity<Object> updateProduct(@PathVariable(value = "id")int id,
                                                @RequestBody @Valid ProductRecordDto productRecordDto) {
        Optional<ProductModel> productModel = productRepository.findAllById(id);
        if (productModel.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produtto não encontrado");
        }
        var productModelUpdate = productModel.get();
        BeanUtils.copyProperties(productRecordDto, productModelUpdate);
        return ResponseEntity.status(HttpStatus.OK).body(productRepository.save(productModelUpdate));
    }

    @DeleteMapping("/id")
    public ResponseEntity<Object> deleteProduct(@PathVariable(value = "id")int id) {
        Optional<ProductModel> productModel = productRepository.findById(id);
        if (productModel.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }
        productRepository.delete(productModel.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto deletado com sucesso");
    }
}
