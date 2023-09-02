package com.br.springjpapractices.service;

import com.br.springjpapractices.domain.Reserva;
import com.br.springjpapractices.dto.request.ReservaRequest;
import com.br.springjpapractices.dto.response.ReservaResponse;
import com.br.springjpapractices.exception.BusinessException;
import com.br.springjpapractices.mapper.ReservaMapper;
import com.br.springjpapractices.repository.ReservaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservaServiceImpl implements ReservaService {

    private final ReservaMapper mapper;
    private final ReservaRepository reservaRepository;
    private final UsuarioServiceImpl usuarioService;
    private final DestinoServiceImpl destinoService;

    @Override
    public ReservaResponse createReservation(ReservaRequest reservaRequest) {

        Reserva reservaEntity = mapper.toReservaEntity(reservaRequest);
        reservaEntity.setUsuario(usuarioService.getUser(reservaEntity.getId()));
        reservaEntity.setDestino(destinoService.getDestiny(reservaEntity.getIdDestino()));

        reservaRepository.save(reservaEntity);
        return mapper.toReservaResponse(reservaEntity);
    }

    @Override
    public ReservaResponse findReservation(Integer id) {
        return mapper.toReservaResponse(getReservation(id));
    }

    public Reserva getReservation(Integer id) {
        return reservaRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Not found Reservation!"));
    }
}
