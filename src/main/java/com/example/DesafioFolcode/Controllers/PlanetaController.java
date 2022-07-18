package com.example.DesafioFolcode.Controllers;

import com.example.DesafioFolcode.Models.Dto.PlanetaDTO;
import com.example.DesafioFolcode.Models.Entities.Planeta;
import com.example.DesafioFolcode.Services.PlanetaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PlanetaController {

    @GetMapping("")
    public ResponseEntity <List<Planeta>> getAllplanetas() throws IOException {

        PlanetaService planetaservice = new PlanetaService();
        return ResponseEntity.ok(planetaservice.getPlanetas());
    }
}
