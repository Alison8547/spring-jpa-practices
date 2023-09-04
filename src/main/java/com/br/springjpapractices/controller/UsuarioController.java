package com.br.springjpapractices.controller;

import com.br.springjpapractices.dto.request.UsuarioRequest;
import com.br.springjpapractices.dto.response.UsuarioCountEnderecoResponse;
import com.br.springjpapractices.dto.response.UsuarioEnderecoResponse;
import com.br.springjpapractices.dto.response.UsuarioReservaDestinoResponse;
import com.br.springjpapractices.dto.response.UsuarioResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RequestMapping
public interface UsuarioController {

    @PostMapping("/create-user")
    ResponseEntity<UsuarioResponse> createUser(@Valid @RequestBody UsuarioRequest usuarioRequest);

    @GetMapping("/user/{id}")
    ResponseEntity<UsuarioResponse> getUser(@PathVariable(name = "id") Integer id);

    @GetMapping("/user-address")
    ResponseEntity<List<UsuarioEnderecoResponse>> getUserAddress();

    @GetMapping("/total-address-user")
    ResponseEntity<Long> totalAddressUser();

    @GetMapping("/user-order-date")
    ResponseEntity<List<UsuarioResponse>> listOrderDataNascimento();

    @GetMapping("/user-counter-address")
    ResponseEntity<List<UsuarioCountEnderecoResponse>> listUserCountAddress();

    @GetMapping("/user-reservation")
    ResponseEntity<List<UsuarioReservaDestinoResponse>> listUserReservation(@RequestParam(required = false) Integer idUser);
}
