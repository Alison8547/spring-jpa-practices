package com.br.springjpapractices.enums;

public enum Status {
    PENDENTE("pendente"), CONFIRMADA("confirmada"), CANCELADA("cancelada");


    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
