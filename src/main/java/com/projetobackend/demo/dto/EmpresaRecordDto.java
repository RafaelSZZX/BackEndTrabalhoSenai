package com.projetobackend.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EmpresaRecordDto(@NotNull int idEmpresa, @NotBlank String nmEmpresa) {
}
