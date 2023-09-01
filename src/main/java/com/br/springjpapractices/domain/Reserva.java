package com.br.springjpapractices.domain;

import com.br.springjpapractices.enums.Status;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "id_usuario", insertable = false, updatable = false)
    private Integer idUsuario;

    @Column(name = "id_destino", insertable = false, updatable = false)
    private Integer idDestino;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Destino destino;

}
