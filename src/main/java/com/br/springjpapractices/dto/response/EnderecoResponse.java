package com.br.springjpapractices.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnderecoResponse {

    private Integer id;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String pais;
    private Integer idUsuario;
}
