package com.br.springjpapractices.service;

import com.br.springjpapractices.domain.Endereco;
import com.br.springjpapractices.dto.request.EnderecoRequest;
import com.br.springjpapractices.dto.response.EnderecoResponse;
import com.br.springjpapractices.exception.BusinessException;
import com.br.springjpapractices.mapper.EnderecoMapper;
import com.br.springjpapractices.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoServiceImpl implements EnderecoService {

    private final EnderecoMapper mapper;
    private final EnderecoRepository enderecoRepository;
    private final UsuarioServiceImpl usuarioService;

    @Override
    public EnderecoResponse createAddress(EnderecoRequest enderecoRequest) {
        Endereco enderecoEntity = mapper.toEnderecoEntity(enderecoRequest);
        enderecoEntity.setUsuario(usuarioService.getUser(enderecoRequest.getIdUsuario()));
        enderecoRepository.save(enderecoEntity);

        return mapper.toEnderecoResponse(enderecoEntity);
    }

    @Override
    public EnderecoResponse findAddress(Integer id) {
        return mapper.toEnderecoResponse(getAddress(id));
    }

    public Endereco getAddress(Integer id) {
        return enderecoRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Not found Address!"));
    }
}
