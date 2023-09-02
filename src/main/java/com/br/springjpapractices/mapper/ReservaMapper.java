package com.br.springjpapractices.mapper;

import com.br.springjpapractices.domain.Reserva;
import com.br.springjpapractices.dto.request.ReservaRequest;
import com.br.springjpapractices.dto.response.ReservaResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReservaMapper {

    private final ModelMapper mapper;
    public ReservaResponse toReservaResponse(Reserva reserva) {
        return mapper.map(reserva, ReservaResponse.class);
    }

    public Reserva toReservaEntity(ReservaRequest reservaRequest) {
        mapper.getConfiguration().setAmbiguityIgnored(true);
        return mapper.map(reservaRequest, Reserva.class);
    }
}
