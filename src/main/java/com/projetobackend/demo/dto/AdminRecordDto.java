package com.projetobackend.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AdminRecordDto(@NotBlank String nmAdmin, @NotBlank String nmTelefone, @NotBlank String nmEmail, @NotNull int nmCpf, @NotBlank String nmEndereco) {

}
