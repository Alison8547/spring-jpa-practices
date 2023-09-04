package com.br.springjpapractices.controller;

import com.br.springjpapractices.dto.request.UsuarioRequest;
import com.br.springjpapractices.dto.response.UsuarioCountEnderecoResponse;
import com.br.springjpapractices.dto.response.UsuarioEnderecoResponse;
import com.br.springjpapractices.dto.response.UsuarioReservaDestinoResponse;
import com.br.springjpapractices.dto.response.UsuarioResponse;
import com.br.springjpapractices.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class UsuarioControllerImpl implements UsuarioController {

    private final UsuarioService usuarioService;

    @Override
    public ResponseEntity<UsuarioResponse> createUser(UsuarioRequest usuarioRequest) {
        return new ResponseEntity<>(usuarioService.createUser(usuarioRequest), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<UsuarioResponse> getUser(Integer id) {
        return new ResponseEntity<>(usuarioService.findUser(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<UsuarioEnderecoResponse>> getUserAddress() {
        return new ResponseEntity<>(usuarioService.listUserAddress(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Long> totalAddressUser() {
        return new ResponseEntity<>(usuarioService.totalAddressUser(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<UsuarioResponse>> listOrderDataNascimento() {
        return new ResponseEntity<>(usuarioService.listOrderDataNascimento(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<UsuarioCountEnderecoResponse>> listUserCountAddress() {
        return new ResponseEntity<>(usuarioService.listUserCountAddress(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<UsuarioReservaDestinoResponse>> listUserReservation(Integer idUser) {
        return new ResponseEntity<>(usuarioService.listUserReservation(idUser), HttpStatus.OK);
    }
}
