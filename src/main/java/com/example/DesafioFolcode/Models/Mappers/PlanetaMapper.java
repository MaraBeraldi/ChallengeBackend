package com.example.DesafioFolcode.Models.Mappers;

import com.example.DesafioFolcode.Models.Dto.PlanetaDTO;
import com.example.DesafioFolcode.Models.Entities.Planeta;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PlanetaMapper {
    public PlanetaDTO entityToDto(Planeta entity){
        return Optional
                .ofNullable(entity)
                .map(
                        ent -> new PlanetaDTO(
                                ent.getName(),
                                ent.getTerrain()
                        )
                )
                .orElse(new PlanetaDTO());
    }
}
