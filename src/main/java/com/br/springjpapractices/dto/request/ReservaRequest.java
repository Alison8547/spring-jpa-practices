package com.br.springjpapractices.dto.request;

import com.br.springjpapractices.enums.Status;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservaRequest {

    @NotNull
    private Status status;

    @NotNull
    private Integer idUsuario;

    @NotNull
    private Integer idDestino;
}
