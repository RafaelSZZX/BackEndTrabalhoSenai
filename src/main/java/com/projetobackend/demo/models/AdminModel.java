package com.projetobackend.demo.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="TBADMIN")
public class AdminModel {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int cdEmpresa;
    private int cdAdmin;
    private Date dtNascimento;
    private String nmAdmin;
    private String dsEmail;
    private String nuCnpj;
    private String nuSenha;

    public int getCdEmpresa() {
        return cdEmpresa;
    }

    public void setCdEmpresa(int cdEmpresa) {
        this.cdEmpresa = cdEmpresa;
    }

    public int getCdAdmin() {
        return cdAdmin;
    }

    public void setCdAdmin(int cdAdmin) {
        this.cdAdmin = cdAdmin;
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
}
