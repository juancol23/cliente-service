package com.challenge.assessment.cliente.cliente.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name= "id_cliente")
    private int id_cliente;

    @Column(name= "cod_cliente")
    private String cod_cliente;

    @Column(name= "tipo_documento")
    private String tipo_documento;

    @Column(name= "numero_documento")
    private String numero_documento;

    @Column(name= "nombre")
    private String nombre;

    @Column(name= "apellido")
    private String apellido;

    @Column(name= "fecha_nacimiento")
    private Date fecha_nacimiento;

}
