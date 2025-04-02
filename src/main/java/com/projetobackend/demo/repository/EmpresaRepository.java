package com.projetobackend.demo.repository;

import com.projetobackend.demo.models.EmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaModel, Integer> {
    
    Optional<EmpresaModel> findById(int id);
    
    Optional<EmpresaModel> findAllById(int id);
}
