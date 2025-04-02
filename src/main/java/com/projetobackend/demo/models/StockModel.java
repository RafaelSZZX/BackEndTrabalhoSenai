package com.projetobackend.demo.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBESTOQUE")

public class StockModel implements Serializable {

    private Long qtProduct;
    @Id
    private Long idStockProduct;

    public Long getQtProduct() {
        return qtProduct;
    }

    public void setQtProduct(Long qtProduct) {
        this.qtProduct = this.qtProduct;
    }

    public void setIdStockProduct(Long idStockProduct) {
        this.idStockProduct = idStockProduct;
    }

    public Long getIdStockProduct() {
        return idStockProduct;
    }
}
