package com.br.springjpapractices.service;

import com.br.springjpapractices.domain.Usuario;
import com.br.springjpapractices.dto.request.UsuarioRequest;
import com.br.springjpapractices.dto.response.UsuarioEnderecoResponse;
import com.br.springjpapractices.dto.response.UsuarioResponse;
import com.br.springjpapractices.exception.BusinessException;
import com.br.springjpapractices.mapper.UsuarioMapper;
import com.br.springjpapractices.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioMapper mapper;
    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioResponse createUser(UsuarioRequest usuarioRequest) {
        Usuario usuarioEntity = mapper.toUsuarioEntity(usuarioRequest);

        return mapper.toUsuarioResponse(usuarioRepository.save(usuarioEntity));
    }

    @Override
    public UsuarioResponse findUser(Integer id) {
        return mapper.toUsuarioResponse(getUser(id));
    }

    @Override
    public List<UsuarioEnderecoResponse> listUserAddress() {
        return usuarioRepository.listUserAddress();
    }

    @Override
    public long totalAddressUser() {
        return usuarioRepository.totalAddress();
    }


    public Usuario getUser(Integer id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new BusinessException("User not found!"));
    }
}
