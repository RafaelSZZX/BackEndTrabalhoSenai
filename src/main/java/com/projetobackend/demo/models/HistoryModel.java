package com.projetobackend.demo.models;

import jakarta.persistence.*;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "TBCARRINHO")
public class HistoryModel {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCarrinho")
    private int id;

    @ManyToOne
    @JoinColumn(name = "idEmpresa", nullable = false)
    private EmpresaModel empresa;

    @ManyToOne
    @JoinColumn(name = "idProduct", nullable = false)
    private ProductModel product;

    private String data;

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
