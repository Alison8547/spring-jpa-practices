package com.br.springjpapractices.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservaRequest {

    @NotNull
    private String status;

    @NotNull
    private Integer idUsuario;

    @NotNull
    private Integer idDestino;
}
