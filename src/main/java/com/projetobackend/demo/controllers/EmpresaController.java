package com.projetobackend.demo.controllers;

import com.projetobackend.demo.dto.EmpresaRecordDto;
import com.projetobackend.demo.dto.HistoryRecordDto;
import com.projetobackend.demo.models.ClientModel;
import com.projetobackend.demo.models.EmpresaModel;
import com.projetobackend.demo.models.HistoryModel;
import com.projetobackend.demo.repository.ClientRepository;
import com.projetobackend.demo.repository.EmpresaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping
    public ResponseEntity<List<EmpresaModel>> getAllClients() {
        return ResponseEntity.status(HttpStatus.OK).body(empresaRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<EmpresaModel> saveEmpresa(@RequestBody @Valid EmpresaRecordDto empresaRecordDto) {
        var EmpresaModel = new EmpresaModel();

        BeanUtils.copyProperties(empresaRecordDto, EmpresaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaRepository.save(EmpresaModel));
    }

}
