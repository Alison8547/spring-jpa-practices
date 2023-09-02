package com.br.springjpapractices.service;

import com.br.springjpapractices.dto.request.DestinoRequest;
import com.br.springjpapractices.dto.response.DestinoResponse;

import javax.transaction.Transactional;

public interface DestinoService {

    @Transactional
    DestinoResponse createDestiny(DestinoRequest destinoRequest);

    DestinoResponse findDestiny(Integer id);
}
