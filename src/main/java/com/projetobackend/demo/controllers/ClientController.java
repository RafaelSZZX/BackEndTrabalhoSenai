package com.projetobackend.demo.controllers;

import com.projetobackend.demo.dto.ProductRecordDto;
import com.projetobackend.demo.models.ClientModel;
import com.projetobackend.demo.models.ProductModel;
import com.projetobackend.demo.repository.ClientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cliente")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping
    public ResponseEntity<ClientModel> saveClient(@RequestBody @Valid ClientRepository ClientRepository) {
        var clientModel = new ClientModel();
        BeanUtils.copyProperties(clientRepository, clientModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientRepository.save(clientModel));
    }

    @GetMapping
    public ResponseEntity<List<ClientModel>> getAllClients() {
        return ResponseEntity.status(HttpStatus.OK).body(clientRepository.findAll());
    }

}
