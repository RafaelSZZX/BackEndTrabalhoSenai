package com.projetobackend.demo.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="TBADMIN")
public class AdminModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dtNascimento;
    private String nmAdmin;
    private String dsEmail;
    private String nuCnpj;
    private String nuSenha;

    @ManyToOne
    @JoinColumn(name = "idEmpresa", nullable = false)
    private EmpresaModel empresa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getNmAdmin() {
        return nmAdmin;
    }

    public void setNmAdmin(String nmAdmin) {
        this.nmAdmin = nmAdmin;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public String getNuCnpj() {
        return nuCnpj;
    }

    public void setNuCnpj(String nuCnpj) {
        this.nuCnpj = nuCnpj;
    }

    public String getNuSenha() {
        return nuSenha;
    }

    public void setNuSenha(String nuSenha) {
        this.nuSenha = nuSenha;
    }

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }
}
