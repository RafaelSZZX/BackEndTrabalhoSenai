package com.projetobackend.demo.controllers;


import com.projetobackend.demo.models.ClientModel;
import com.projetobackend.demo.models.ProductModel;
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

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteClient(@PathVariable(value = "id")int id){
        Optional<ClientModel> client0 = clientRepository.findById(id);
        if (client0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }
        clientRepository.delete(client0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Cliente removido com sucesso");
    }

}
