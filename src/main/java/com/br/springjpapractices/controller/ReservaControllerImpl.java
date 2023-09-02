package com.br.springjpapractices.controller;

import com.br.springjpapractices.dto.request.ReservaRequest;
import com.br.springjpapractices.dto.response.ReservaResponse;
import com.br.springjpapractices.service.ReservaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReservaControllerImpl implements ReservaController {

    private final ReservaService reservaService;

    @Override
    public ResponseEntity<ReservaResponse> createReservation(ReservaRequest reservaRequest) {
        return new ResponseEntity<>(reservaService.createReservation(reservaRequest), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ReservaResponse> getReservation(Integer id) {
        return new ResponseEntity<>(reservaService.findReservation(id), HttpStatus.OK);
    }
}
