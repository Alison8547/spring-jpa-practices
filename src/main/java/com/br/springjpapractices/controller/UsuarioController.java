package com.br.springjpapractices.controller;

import com.br.springjpapractices.dto.request.UsuarioRequest;
import com.br.springjpapractices.dto.response.UsuarioResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RequestMapping
public interface UsuarioController {

    @PostMapping("/create-user")
    ResponseEntity<UsuarioResponse> createUser(@Valid @RequestBody UsuarioRequest usuarioRequest);

    @GetMapping("/user/{id}")
    ResponseEntity<UsuarioResponse> getUser(@PathVariable(name = "id") Integer id);
}
