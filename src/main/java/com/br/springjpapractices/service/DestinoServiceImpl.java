package com.br.springjpapractices.service;

import com.br.springjpapractices.domain.Destino;
import com.br.springjpapractices.dto.request.DestinoRequest;
import com.br.springjpapractices.dto.response.DestinoResponse;
import com.br.springjpapractices.exception.BusinessException;
import com.br.springjpapractices.mapper.DestinoMapper;
import com.br.springjpapractices.repository.DestinoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DestinoServiceImpl implements DestinoService {

    private final DestinoMapper mapper;
    private final DestinoRepository destinoRepository;

    @Override
    public DestinoResponse createDestiny(DestinoRequest destinoRequest) {
        Destino destinoEntity = mapper.toDestinoEntity(destinoRequest);

        return mapper.toDestinoResponse(destinoRepository.save(destinoEntity));
    }

    @Override
    public DestinoResponse findDestiny(Integer id) {
        return mapper.toDestinoResponse(getDestiny(id));
    }


    public Destino getDestiny(Integer id) {
        return destinoRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Not found Destiny!"));
    }
}
