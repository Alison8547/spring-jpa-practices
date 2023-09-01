package com.br.springjpapractices.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioResponse {

    private Integer id;
    private String nome;
    private String email;
    private LocalDate dataNascimento;
}
