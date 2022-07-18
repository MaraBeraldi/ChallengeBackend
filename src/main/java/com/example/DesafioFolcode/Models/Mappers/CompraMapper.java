package com.example.DesafioFolcode.Models.Mappers;

import com.example.DesafioFolcode.Models.Dto.CompraDTO;
import com.example.DesafioFolcode.Models.Dto.CompraEnteraDTO;
import com.example.DesafioFolcode.Models.Entities.Compra;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CompraMapper {
    public CompraDTO entityToDto(Compra entity){
        return Optional
                .ofNullable(entity)
                .map(
                        ent -> new CompraDTO(
                                ent.getId(),
                                ent.getFecha(),
                                ent.getMetodoPago(),
                                ent.getId_paquete_Turistico(),
                                ent.getId_usuario()
                        )
                )
                .orElse(new CompraDTO());
    }
    public Compra dtoToEntity(CompraDTO dto){
        Compra entity = new Compra();
        entity.setId(dto.getId());
        entity.setFecha(dto.getFecha());
        entity.setMetodoPago(dto.getMetodo_Pago());
        entity.setId_paquete_Turistico(dto.getId_paquete());
        entity.setId_usuario(dto.getId_usuario());
        return entity;
    }
    public CompraEnteraDTO entityToEnteroDto(Compra entity){
        return Optional
                .ofNullable(entity)
                .map(
                        ent -> new CompraEnteraDTO(
                                ent.getId(),
                                ent.getFecha(),
                                ent.getMetodoPago(),
                                ent.getPaquete(),
                                ent.getUsuario()
                        )
                )
                .orElse(new CompraEnteraDTO());
    }
}
