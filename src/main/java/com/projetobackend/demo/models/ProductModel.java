package com.projetobackend.demo.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TBPRODUTO")

public class ProductModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id@GeneratedValue(strategy = GenerationType.AUTO)

    private UUID idProduct;
    private String nmProduct;
    private BigDecimal vlProduct;

    public String getNmProduct() {
        return nmProduct;
    }

    public void setNmProduct(String nmProduct) {
        this.nmProduct = nmProduct;
    }

    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return nmProduct;
    }

    public void setName(String name) {
        this.nmProduct = name;
    }

    public BigDecimal getVlProduct() {
        return vlProduct;
    }

    public void setVlProduct(BigDecimal vlProduct) {
        this.vlProduct = vlProduct;
    }
}
