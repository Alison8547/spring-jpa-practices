package com.br.springjpapractices.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioEnderecoResponse {

    private Integer id;
    private String nome;
    private String email;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String pais;
}
