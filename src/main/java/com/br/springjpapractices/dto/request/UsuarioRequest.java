package com.br.springjpapractices.dto.request;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioRequest {

    @NotBlank
    private String nome;

    @NotBlank
    @CPF
    private String cpf;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$", message = "Error, Mascara correta textoqualquer@hotmail.com")
    private String email;

    @NotNull
    private LocalDate dataNascimento;
}
