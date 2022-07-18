package com.example.DesafioFolcode.Models.Dto;

import com.example.DesafioFolcode.Models.Entities.Paquete;
import com.example.DesafioFolcode.Models.Entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompraEnteraDTO {
    Integer id;
    LocalDate fecha;
    String metodo_pago;
    Paquete paquete_turistico;
    Usuario usuario;
}
