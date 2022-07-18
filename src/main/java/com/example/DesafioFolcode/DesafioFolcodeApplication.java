package com.example.DesafioFolcode;

import com.example.DesafioFolcode.Models.Dto.PlanetaDTO;
import com.example.DesafioFolcode.Models.Entities.Planeta;
import com.example.DesafioFolcode.Models.Mappers.PlanetaMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class DesafioFolcodeApplication {

	@Bean
	public RestTemplate getresttemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) throws IOException {
		SpringApplication.run(DesafioFolcodeApplication.class, args);
	}

}
