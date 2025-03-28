package com.projetobackend.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String idProduct, @NotBlank String nmProduct, @NotNull BigDecimal vlProduct) {
}
