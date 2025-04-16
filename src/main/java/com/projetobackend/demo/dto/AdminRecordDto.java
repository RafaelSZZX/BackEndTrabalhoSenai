package com.projetobackend.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record AdminRecordDto(
        @NotNull int id,
        @NotBlank String nmAdmin,
        @NotBlank String nuSenha,
        @NotBlank String dsEmail,
        @NotBlank String nuCnpj,
        @NotBlank Date dtNascimento) {
}
