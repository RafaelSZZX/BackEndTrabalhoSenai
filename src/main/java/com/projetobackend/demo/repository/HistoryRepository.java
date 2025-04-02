package com.projetobackend.demo.repository;

import com.projetobackend.demo.models.HistoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HistoryRepository extends JpaRepository<HistoryModel, Integer> {

    Optional<HistoryModel> findById(int id);

    Optional<HistoryModel> findAllById(int id);
}
