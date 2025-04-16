package com.projetobackend.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ClientRecordDto(
        @NotNull int id,
        @NotBlank String nuCpf,
        @NotBlank String nmCliente,
        @NotBlank String dsEmail,
        @NotBlank String dsSenha,
        @NotBlank String nuTelefone
) {
}
