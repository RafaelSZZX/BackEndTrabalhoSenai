package com.projetobackend.demo.repository;

import com.projetobackend.demo.models.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel, Integer> {

    Optional<AdminModel> findById(int id);

    Optional<AdminModel> findAllById(int id);
}
