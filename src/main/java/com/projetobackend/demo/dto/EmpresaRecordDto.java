package com.projetobackend.demo.dto;

import com.projetobackend.demo.models.EmpresaModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EmpresaRecordDto(
        @NotNull int idEmpresa,
        @NotBlank String nmEmpresa
) {
}
