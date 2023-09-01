package com.br.springjpapractices.mapper;

import com.br.springjpapractices.domain.Destino;
import com.br.springjpapractices.dto.request.DestinoRequest;
import com.br.springjpapractices.dto.response.DestinoResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DestinoMapper {

    private final ModelMapper mapper;

    public DestinoResponse toDestinoResponse(Destino destino) {
        return mapper.map(destino, DestinoResponse.class);
    }

    public Destino toDestinoEntity(DestinoRequest destinoRequest) {
        return mapper.map(destinoRequest, Destino.class);
    }
}
