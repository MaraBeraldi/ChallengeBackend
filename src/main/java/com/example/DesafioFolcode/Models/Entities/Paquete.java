package com.example.DesafioFolcode.Models.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "PaqueteTuristico")
@Entity
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Paquete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPaqueteTuristico", columnDefinition = "INT(11) UNSIGNED")
    Integer id;
    @Column(name = "nombre", columnDefinition = "VARCHAR(45)")
    String nombre = "";
    @Column(name = "descripcion", columnDefinition = "VARCHAR(45)")
    String descripcion = "";
    @Column(name = "cant_noches", columnDefinition = "INT(11)")
    Integer cantNoches;
    @Column(name = "precio", columnDefinition = "FLOAT")
    Float precio;
    @Column(name = "planeta_destino", columnDefinition = "VARCHAR(45)")
    String planetaDestino = "";
}
