package com.projetobackend.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecordDto(
        @NotNull int id,
        @NotBlank String nmProduto,
        @NotNull BigDecimal vlProduto
) {
}
