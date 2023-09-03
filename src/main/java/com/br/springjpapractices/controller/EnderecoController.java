package com.br.springjpapractices.controller;

import com.br.springjpapractices.dto.request.EnderecoRequest;
import com.br.springjpapractices.dto.response.EnderecoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RequestMapping
public interface EnderecoController {

    @PostMapping("/create-address/{idUser}")
    ResponseEntity<EnderecoResponse> createAddress(@PathVariable(name = "idUser") Integer idUser, @Valid @RequestBody EnderecoRequest enderecoRequest);

    @GetMapping("/address/{id}")
    ResponseEntity<EnderecoResponse> getAddress(@PathVariable(name = "id") Integer id);

}
