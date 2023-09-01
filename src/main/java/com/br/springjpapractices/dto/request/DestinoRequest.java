package com.br.springjpapractices.dto.request;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DestinoRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String descricao;
}
