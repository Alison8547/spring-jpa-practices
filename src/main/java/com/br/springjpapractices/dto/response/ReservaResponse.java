package com.br.springjpapractices.dto.response;

import com.br.springjpapractices.enums.Status;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservaResponse {

    private Integer id;
    private Status status;
    private Integer idUsuario;
    private Integer idDestino;
}
