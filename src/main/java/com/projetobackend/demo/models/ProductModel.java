package com.projetobackend.demo.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TBPRODUTO")

public class ProductModel {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String nmProduct;
    private BigDecimal vlProduct;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmProduct() {
        return nmProduct;
    }

    public void setNmProduct(String nmProduct) {
        this.nmProduct = nmProduct;
    }

    public BigDecimal getVlProduct() {
        return vlProduct;
    }

    public void setVlProduct(BigDecimal vlProduct) {
        this.vlProduct = vlProduct;
    }
}
