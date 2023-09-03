package com.br.springjpapractices.service;

import com.br.springjpapractices.dto.request.ReservaRequest;
import com.br.springjpapractices.dto.response.ReservaResponse;

import javax.transaction.Transactional;

public interface ReservaService {

    @Transactional
    ReservaResponse createReservation(Integer idUser, Integer idDestiny, ReservaRequest reservaRequest);

    ReservaResponse findReservation(Integer id);
}
