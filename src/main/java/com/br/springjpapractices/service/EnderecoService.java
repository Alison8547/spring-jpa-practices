package com.br.springjpapractices.service;

import com.br.springjpapractices.dto.request.EnderecoRequest;
import com.br.springjpapractices.dto.response.EnderecoResponse;

import javax.transaction.Transactional;

public interface EnderecoService {

    @Transactional
    EnderecoResponse createAddress(Integer idUser, EnderecoRequest enderecoRequest);

    EnderecoResponse findAddress(Integer id);

}
