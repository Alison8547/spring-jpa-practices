package com.br.springjpapractices.service;


import com.br.springjpapractices.dto.request.UsuarioRequest;
import com.br.springjpapractices.dto.response.UsuarioCountEnderecoResponse;
import com.br.springjpapractices.dto.response.UsuarioEnderecoResponse;
import com.br.springjpapractices.dto.response.UsuarioResponse;

import javax.transaction.Transactional;
import java.util.List;

public interface UsuarioService {

    @Transactional
    UsuarioResponse createUser(UsuarioRequest usuarioRequest);

    UsuarioResponse findUser(Integer id);

    List<UsuarioEnderecoResponse> listUserAddress();

    long totalAddressUser();

    List<UsuarioResponse> listOrderDataNascimento();

    List<UsuarioCountEnderecoResponse> listUserCountAddress();
}
