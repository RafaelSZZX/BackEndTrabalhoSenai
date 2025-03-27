package com.projetobackend.demo.dto;

import jakarta.validation.constraints.NotBlank;

public record ClientRecordDto(@NotBlank String nmCliente, @NotBlank String nmTelefone, @NotBlank String nmEmail) {


}
