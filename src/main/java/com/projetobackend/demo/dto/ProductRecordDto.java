package com.projetobackend.demo.dto;

import com.projetobackend.demo.models.EmpresaModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecordDto(
        @NotNull int id,
        @NotNull  int idEmpresa,
        @NotBlank String nmProduto,
        @NotNull BigDecimal vlProduto
) {
}
