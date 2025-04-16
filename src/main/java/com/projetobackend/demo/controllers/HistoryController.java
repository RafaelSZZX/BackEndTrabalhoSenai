package com.projetobackend.demo.controllers;


import com.projetobackend.demo.dto.HistoryRecordDto;
import com.projetobackend.demo.models.HistoryModel;
import com.projetobackend.demo.repository.HistoryRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/carrinho")
public class HistoryController {

    @Autowired
    HistoryRepository historyRepository;

    @PostMapping
    public ResponseEntity<HistoryModel> saveHistory(@RequestBody @Valid HistoryRecordDto historyRecordDto) {
            var historyCar = new HistoryModel();

            BeanUtils.copyProperties(historyRecordDto, historyCar);
            return ResponseEntity.status(HttpStatus.CREATED).body(historyRepository.save(historyCar));
    }

    @GetMapping
    public ResponseEntity<List<HistoryModel>> getAllHistorys(){
        return ResponseEntity.status(HttpStatus.OK).body(historyRepository.findAll());
    }
}
