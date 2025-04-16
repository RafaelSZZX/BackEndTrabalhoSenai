package com.projetobackend.demo.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBLOGIN")
public class LoginClientModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLogin;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private ClientModel cliente;

   @ManyToOne
   @JoinColumn(name = "email", nullable = false)


   private ClientModel dsEmail;

   private String password;

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public ClientModel getCliente() {
        return cliente;
    }

    public void setCliente(ClientModel cliente) {
        this.cliente = cliente;
    }

    public ClientModel getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(ClientModel dsEmail) {
        this.dsEmail = dsEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
