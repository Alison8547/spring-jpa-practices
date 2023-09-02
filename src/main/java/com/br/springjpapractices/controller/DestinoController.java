package com.br.springjpapractices.controller;

import com.br.springjpapractices.dto.request.DestinoRequest;
import com.br.springjpapractices.dto.response.DestinoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RequestMapping
public interface DestinoController {

    @PostMapping("/create-destiny")
    ResponseEntity<DestinoResponse> createDestiny(@Valid @RequestBody DestinoRequest destinoRequest);

    @GetMapping("/destiny/{id}")
    ResponseEntity<DestinoResponse> getDestiny(@PathVariable(name = "id") Integer id);
}
