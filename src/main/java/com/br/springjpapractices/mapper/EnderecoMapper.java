package com.br.springjpapractices.mapper;

import com.br.springjpapractices.domain.Endereco;
import com.br.springjpapractices.dto.request.EnderecoRequest;
import com.br.springjpapractices.dto.response.EnderecoResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnderecoMapper {

    private final ModelMapper mapper;

    public EnderecoResponse toEnderecoResponse(Endereco endereco) {
        return mapper.map(endereco, EnderecoResponse.class);
    }

    public Endereco toEnderecoEntity(EnderecoRequest enderecoRequest) {
        return mapper.map(enderecoRequest, Endereco.class);
    }
}
