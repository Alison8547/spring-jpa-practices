package com.br.springjpapractices.mapper;

import com.br.springjpapractices.domain.Usuario;
import com.br.springjpapractices.dto.request.UsuarioRequest;
import com.br.springjpapractices.dto.response.UsuarioResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioMapper {

    private final ModelMapper mapper;

    public UsuarioResponse toUsuarioResponse(Usuario usuario) {
        return mapper.map(usuario, UsuarioResponse.class);
    }

    public Usuario toUsuarioEntity(UsuarioRequest usuarioRequest) {
        return mapper.map(usuarioRequest, Usuario.class);
    }
}
