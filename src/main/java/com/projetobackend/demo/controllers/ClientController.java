package com.projetobackend.demo.controllers;

import com.projetobackend.demo.dto.ClientRecordDto;
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
import java.util.Optional;

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

    @GetMapping("/id")
    public ResponseEntity<ClientModel> getClientById(@PathVariable(value = "id")int id) {
        Optional<ClientModel> clientModel = clientRepository.findById(id);
        if (clientModel.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(clientModel.get());
    }


    @PutMapping("/id")
    public ResponseEntity<Object> updateCliete(@PathVariable(value = "id")int id,
                                               @RequestBody @Valid ClientRecordDto ClientRecordDto) {

        Optional<ClientModel> clientModel = clientRepository.findAllById(id);
        if (clientModel.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }

        var clienteModelUpdate = clientModel.get();
        BeanUtils.copyProperties(ClientRecordDto, clienteModelUpdate);
        return ResponseEntity.status(HttpStatus.OK).body(clientRepository.save(clienteModelUpdate));
    }

    @DeleteMapping("/id")
    public ResponseEntity<Object> deleteClient(@PathVariable(value = "id")int id) {

        Optional<ClientModel> clientModel = clientRepository.findById(id);
        if (clientModel.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }

        clientRepository.delete(clientModel.get());
        return ResponseEntity.status(HttpStatus.OK).body("Cliente deletado com sucesso");
    }

}
