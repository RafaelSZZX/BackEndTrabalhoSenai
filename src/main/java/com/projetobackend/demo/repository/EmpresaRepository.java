package com.projetobackend.demo.repository;

import com.projetobackend.demo.models.EmpresaModel;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaModel, Integer> {

    Optional<EmpresaModel> findByIdEmpresa(int idEmpresa);

    Optional<EmpresaModel> findAllByIdEmpresa(int idEmpresa);
}
