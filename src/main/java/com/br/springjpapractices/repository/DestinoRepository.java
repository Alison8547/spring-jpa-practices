package com.br.springjpapractices.repository;

import com.br.springjpapractices.domain.Destino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Integer> {
}
