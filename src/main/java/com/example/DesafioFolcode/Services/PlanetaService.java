package com.example.DesafioFolcode.Services;

import com.example.DesafioFolcode.Models.Dto.PlanetaDTO;
import com.example.DesafioFolcode.Models.Entities.Planeta;
import com.example.DesafioFolcode.Models.Mappers.PlanetaMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service("planetaService")
public class PlanetaService {

    private final PlanetaMapper planetamapper = new PlanetaMapper();
    public PlanetaService(){

    }

    public List<Planeta> getPlanetas() throws IOException {
        RestTemplate restTemplate= new RestTemplate();
        ResponseEntity<String> response =
                restTemplate.getForEntity(
                        "https://swapi.dev/api/planets/",
                        String.class);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.getBody());
        JsonNode name = root.path("results");
        ObjectReader reader = mapper.readerFor(new TypeReference<List<Planeta>>(){});
        List<Planeta> planetas = reader.readValue(name);
        //return planetas.stream().map(planetamapper::entityToDto).collect(Collectors.toList());
        return planetas;
    }
}

