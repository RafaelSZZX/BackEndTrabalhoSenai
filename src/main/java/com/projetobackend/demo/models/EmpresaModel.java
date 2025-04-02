package com.projetobackend.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TBEMPRESA>")
public class EmpresaModel {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
