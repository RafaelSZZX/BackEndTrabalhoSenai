package com.projetobackend.demo.dto;

import jakarta.validation.constraints.NotNull;

public record StockRecordDto(@NotNull Long idProduct, @NotNull Long qtPtoduct) {
}
