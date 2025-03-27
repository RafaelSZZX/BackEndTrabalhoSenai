package com.projetobackend.demo.models;


import jakarta.persistence.*;

@Entity
@Table(name = "TBCLIENTE")
public class ClientModel {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nmCliente;
    private String nmEmail;
    private String nmTelefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getNmEmail() {
        return nmEmail;
    }

    public void setNmEmail(String nmEmail) {
        this.nmEmail = nmEmail;
    }

    public String getNmTelefone() {
        return nmTelefone;
    }

    public void setNmTelefone(String nmTelefone) {
        this.nmTelefone = nmTelefone;
    }
}
