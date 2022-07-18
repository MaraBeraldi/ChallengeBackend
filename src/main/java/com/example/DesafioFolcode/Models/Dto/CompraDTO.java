package com.example.DesafioFolcode.Models.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompraDTO {
    Integer id;
    LocalDate fecha;
    String metodo_Pago;
    Integer id_paquete;
    Integer id_usuario;
}
