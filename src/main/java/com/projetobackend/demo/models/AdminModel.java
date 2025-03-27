package com.projetobackend.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name="TBADMIN")
public class AdminModel {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nmAdmin;
    private String nmEmail;
    private int nmCpf;
    private String nmTelefone;
    private String nmEndereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmAdmin() {
        return nmAdmin;
    }

    public void setNmAdmin(String nmAdmin) {
        this.nmAdmin = nmAdmin;
    }

    public String getNmEmail() {
        return nmEmail;
    }

    public void setNmEmail(String nmEmail) {
        this.nmEmail = nmEmail;
    }

    public int getNmCpf() {
        return nmCpf;
    }

    public void setNmCpf(int nmCpf) {
        this.nmCpf = nmCpf;
    }

    public String getNmTelefone() {
        return nmTelefone;
    }

    public void setNmTelefone(String nmTelefone) {
        this.nmTelefone = nmTelefone;
    }

    public String getNmEndereco() {
        return nmEndereco;
    }

    public void setNmEndereco(String nmEndereco) {
        this.nmEndereco = nmEndereco;
    }
}
