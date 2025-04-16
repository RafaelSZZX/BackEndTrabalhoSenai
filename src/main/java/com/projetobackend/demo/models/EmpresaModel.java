package com.projetobackend.demo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TBEMPRESA")
public class EmpresaModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpresa;
    private String nmEmpresa;

    public String getNmEmpresa() {
        return nmEmpresa;
    }

    public void setNmEmpresa(String nmEmpresa) {
        this.nmEmpresa = nmEmpresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}
