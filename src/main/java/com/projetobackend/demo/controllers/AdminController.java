package com.projetobackend.demo.controllers;

import com.projetobackend.demo.models.AdminModel;
import com.projetobackend.demo.repository.AdminRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//a
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminRepository adminRepository;

    @PostMapping
    public ResponseEntity<AdminModel> addOneAdmin(@RequestBody AdminRepository adminRepository) {
        var adminModel = new AdminModel();
        BeanUtils.copyProperties(adminModel, adminRepository);
        return ResponseEntity.status(HttpStatus.CREATED).body(adminRepository.save(adminModel));
    }

    @GetMapping
    public ResponseEntity<List<AdminModel>> getAllAdmins() {
        return ResponseEntity.ok(adminRepository.findAll());
    }

}
