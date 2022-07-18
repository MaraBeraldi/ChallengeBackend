package com.example.DesafioFolcode.Models.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Table(name = "Usuario")
@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario", columnDefinition = "INT(11) UNSIGNED")
    Integer id;
    @Column(name = "fullname", columnDefinition = "VARCHAR(45)")
    String nombre = "";
    @Column(name = "email", columnDefinition = "VARCHAR(45)")
    String email = "";
    @Column(name = "birthdate", columnDefinition = "DATE")
    LocalDate fechaNacimiento;
}
