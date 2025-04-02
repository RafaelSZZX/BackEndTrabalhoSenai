package com.projetobackend.demo.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "TBPRODUTO")
public class ProductModel {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int idProduto;
    private String nmProduto;
    private BigDecimal vlProduto;

    // chave estrangeira EmpresaMOdel
    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    private EmpresaModel empresa;

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
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
