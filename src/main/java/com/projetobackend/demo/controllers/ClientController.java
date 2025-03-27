package com.projetobackend.demo.controllers;


import com.projetobackend.demo.models.ClientModel;
import com.projetobackend.demo.repository.ClientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cliente")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @PostMapping
    public ResponseEntity<ClientModel> saveCliente(@RequestBody ClientRepository clientRepository) {
        var clientModel = new ClientModel();
        BeanUtils.copyProperties(clientModel, clientRepository);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientRepository.save(clientModel));
    }

    @GetMapping
    public ResponseEntity<List<ClientModel>> getAllClients() {
        return ResponseEntity.ok(clientRepository.findAll());
    }

}
