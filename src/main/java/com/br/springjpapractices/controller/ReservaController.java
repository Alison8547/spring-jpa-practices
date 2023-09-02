package com.br.springjpapractices.controller;

import com.br.springjpapractices.dto.request.ReservaRequest;
import com.br.springjpapractices.dto.response.ReservaResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RequestMapping
public interface ReservaController {

    @PostMapping("/create-reservation")
    ResponseEntity<ReservaResponse> createReservation(@Valid @RequestBody ReservaRequest reservaRequest);

    @GetMapping("/reservation/{id}")
    ResponseEntity<ReservaResponse> getReservation(@PathVariable(name = "id") Integer id);
}
