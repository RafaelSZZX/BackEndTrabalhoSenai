package com.projetobackend.demo.repository;

import com.projetobackend.demo.models.StockModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<StockModel, Integer> {

    Optional<StockModel>findBy(int id);

    Optional<StockModel> findAllById(int id);
}
