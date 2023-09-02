package com.br.springjpapractices.controller;

import com.br.springjpapractices.dto.request.DestinoRequest;
import com.br.springjpapractices.dto.response.DestinoResponse;
import com.br.springjpapractices.service.DestinoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DestinoControllerImpl implements DestinoController {

    private final DestinoService destinoService;

    @Override
    public ResponseEntity<DestinoResponse> createDestiny(DestinoRequest destinoRequest) {
        return new ResponseEntity<>(destinoService.createDestiny(destinoRequest), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<DestinoResponse> getDestiny(Integer id) {
        return new ResponseEntity<>(destinoService.findDestiny(id), HttpStatus.OK);
    }
}
