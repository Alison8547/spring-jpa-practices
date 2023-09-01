package com.br.springjpapractices.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DestinoResponse {

    private Integer id;
    private String nome;
    private String descricao;
}
