package com.br.springjpapractices.repository;

import com.br.springjpapractices.domain.Usuario;
import com.br.springjpapractices.dto.response.UsuarioCountEnderecoResponse;
import com.br.springjpapractices.dto.response.UsuarioEnderecoResponse;
import com.br.springjpapractices.dto.response.UsuarioResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query(" select new com.br.springjpapractices.dto.response.UsuarioEnderecoResponse(" +
            " u.id, " +
            " u.nome, " +
            " u.email, " +
            " e.rua, " +
            " e.numero, " +
            " e.cidade, " +
            " e.estado, " +
            " e.pais " +
            ")" +
            " from Usuario u" +
            " left join u.enderecoList e on e.idUsuario = u.id")
    List<UsuarioEnderecoResponse> listUserAddress();


    @Query(value = "select count(*) from Usuario u inner join u.enderecoList e where u.id = e.idUsuario")
    long totalAddress();


    @Query(" select new com.br.springjpapractices.dto.response.UsuarioResponse(u.id,u.nome,u.email,u.dataNascimento) from Usuario u order by u.dataNascimento")
    List<UsuarioResponse> orderByDateNascimento();

    @Query("select new com.br.springjpapractices.dto.response.UsuarioCountEnderecoResponse(u.nome,(select count(*) from Endereco e where e.idUsuario = u.id))  from  Usuario u")
    List<UsuarioCountEnderecoResponse> listUserCountAddress();


}
