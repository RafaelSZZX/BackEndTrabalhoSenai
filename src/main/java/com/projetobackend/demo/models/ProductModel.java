package com.projetobackend.demo.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "TBPRODUTO")
public class ProductModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nmProduto;
    private BigDecimal vlProduto;

    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    private EmpresaModel empresa;

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public BigDecimal getVlProduto() {
        return vlProduto;
    }

    public void setVlProduto(BigDecimal vlProduto) {
        this.vlProduto = vlProduto;
    }

}
