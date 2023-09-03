package com.br.springjpapractices.service;

import com.br.springjpapractices.domain.Destino;
import com.br.springjpapractices.domain.Reserva;
import com.br.springjpapractices.domain.Usuario;
import com.br.springjpapractices.dto.request.ReservaRequest;
import com.br.springjpapractices.dto.response.ReservaResponse;
import com.br.springjpapractices.enums.Status;
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
    public ReservaResponse createReservation(Integer idUser, Integer idDestiny, ReservaRequest reservaRequest) {

        Reserva reservaEntity = mapper.toReservaEntity(reservaRequest);
        Usuario user = usuarioService.getUser(idUser);
        Destino destiny = destinoService.getDestiny(idDestiny);

        for (int i = 0; i < Status.values().length; i++) {
            Status[] values = Status.values();
            if (reservaRequest.getStatus().equalsIgnoreCase(values[i].getDescricao())) {
                reservaEntity.setStatus(values[i]);
            }
        }
        reservaEntity.setUsuario(user);
        reservaEntity.setDestino(destiny);
        reservaEntity.setIdUsuario(user.getId());
        reservaEntity.setIdDestino(destiny.getId());

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
