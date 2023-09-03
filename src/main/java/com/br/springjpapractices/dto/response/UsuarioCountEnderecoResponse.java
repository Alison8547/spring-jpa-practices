package com.br.springjpapractices.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioCountEnderecoResponse {

    private String nome;
    private long countEndereco;
}
