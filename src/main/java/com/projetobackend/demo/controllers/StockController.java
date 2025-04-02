package com.projetobackend.demo.controllers;

import com.projetobackend.demo.dto.StockRecordDto;
import com.projetobackend.demo.models.StockModel;
import com.projetobackend.demo.repository.StockRepository;
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
public class StockController {

    @Autowired
    StockRepository stockRepository;

    @PostMapping
    public ResponseEntity<StockModel> saveStock(@RequestBody @Valid StockRecordDto stockRecordDto){
        var stockModel = new StockModel();
        BeanUtils.copyProperties(stockRecordDto, stockModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(stockRepository.save(stockModel));
    }

    @GetMapping
    public ResponseEntity<List<StockModel>> getAllStock(){
        return ResponseEntity.status(HttpStatus.OK).body(stockRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object>getOneStock(@PathVariable(value = "id")int id){

        Optional<StockModel> stock0 = stockRepository.findById(id);
        if(stock0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(stock0.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateStock(@PathVariable(value = "id")int id,
                                              @RequestBody @Valid StockRecordDto stockRecordDto){
        Optional<StockModel> stock0 = stockRepository.findById(id);
        if(stock0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }
        var stockModel = stock0.get();
        BeanUtils.copyProperties(stockRecordDto, stockModel);
        return ResponseEntity.status(HttpStatus.OK).body(stockRepository.save(stockModel));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteStock(@PathVariable(value = "id")int id){
        Optional<StockModel> stock0 = stockRepository.findById(id);
        if(stock0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }
        stockRepository.delete(stock0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto removido com sucesso");
    }
}
