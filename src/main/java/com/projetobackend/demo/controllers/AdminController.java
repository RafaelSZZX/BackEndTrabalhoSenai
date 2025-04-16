package com.projetobackend.demo.controllers;


import com.projetobackend.demo.models.AdminModel;
import com.projetobackend.demo.models.ClientModel;
import com.projetobackend.demo.models.ProductModel;
import com.projetobackend.demo.repository.AdminRepository;
import com.projetobackend.demo.repository.ClientRepository;
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
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @PostMapping
    public ResponseEntity<AdminModel> saveAdmin(@RequestBody @Valid AdminRepository adminRepository) {
        var adminModel = new AdminModel();
        BeanUtils.copyProperties(adminRepository, adminModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(adminRepository.save(adminModel));
    }

    @GetMapping
    public ResponseEntity<List<AdminModel>> getAllAdmins() {
        return ResponseEntity.status(HttpStatus.OK).body(adminRepository.findAll());
    }

    @GetMapping("/id")
    public ResponseEntity<AdminModel> getAdminById(@PathVariable(value = "id")int id) {
        Optional<AdminModel> adminModel = adminRepository.findById(id);
        if (adminModel.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(adminModel.get());
    }

}
