package com.projetobackend.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record HistoryRecordDto(
        @NotNull int idCarrinho,
        @NotNull int idProduct,
        @NotBlank String data) {
}
