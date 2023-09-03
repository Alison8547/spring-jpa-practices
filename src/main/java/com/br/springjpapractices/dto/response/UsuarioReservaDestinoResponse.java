package com.br.springjpapractices.dto.response;

import com.br.springjpapractices.enums.Status;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioReservaDestinoResponse {

    private Integer id;
    private String nome;
    private String email;
    private Status status;
    private String nomeDestino;
    private String descricao;
}
