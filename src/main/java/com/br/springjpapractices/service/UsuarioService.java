package com.br.springjpapractices.service;


import com.br.springjpapractices.dto.request.UsuarioRequest;
import com.br.springjpapractices.dto.response.UsuarioResponse;

import javax.transaction.Transactional;

public interface UsuarioService {

    @Transactional
    UsuarioResponse createUser(UsuarioRequest usuarioRequest);

    UsuarioResponse findUser(Integer id);
}
