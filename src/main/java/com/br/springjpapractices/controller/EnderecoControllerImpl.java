package com.br.springjpapractices.controller;

import com.br.springjpapractices.dto.request.EnderecoRequest;
import com.br.springjpapractices.dto.response.EnderecoResponse;
import com.br.springjpapractices.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnderecoControllerImpl implements EnderecoController {

    private final EnderecoService enderecoService;

    @Override
    public ResponseEntity<EnderecoResponse> createAddress(Integer idUser, EnderecoRequest enderecoRequest) {
        return new ResponseEntity<>(enderecoService.createAddress(idUser, enderecoRequest), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<EnderecoResponse> getAddress(Integer id) {
        return new ResponseEntity<>(enderecoService.findAddress(id), HttpStatus.OK);
    }
}
