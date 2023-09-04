package com.br.springjpapractices.service;

import com.br.springjpapractices.domain.Usuario;
import com.br.springjpapractices.dto.request.UsuarioRequest;
import com.br.springjpapractices.dto.response.UsuarioCountEnderecoResponse;
import com.br.springjpapractices.dto.response.UsuarioEnderecoResponse;
import com.br.springjpapractices.dto.response.UsuarioReservaDestinoResponse;
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

    @Override
    public List<UsuarioResponse> listOrderDataNascimento() {
        return usuarioRepository.orderByDateNascimento();
    }

    @Override
    public List<UsuarioCountEnderecoResponse> listUserCountAddress() {
        return usuarioRepository.listUserCountAddress();
    }

    @Override
    public List<UsuarioReservaDestinoResponse> listUserReservation(Integer idUser) {
        return usuarioRepository.listUserReservation(idUser);
    }


    public Usuario getUser(Integer id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new BusinessException("User not found!"));
    }
}
