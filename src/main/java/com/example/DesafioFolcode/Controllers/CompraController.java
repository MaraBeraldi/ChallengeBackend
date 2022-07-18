package com.example.DesafioFolcode.Controllers;

import com.example.DesafioFolcode.Models.Dto.CompraDTO;
import com.example.DesafioFolcode.Models.Dto.CompraEnteraDTO;
import com.example.DesafioFolcode.Services.CompraService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class CompraController {
    private final CompraService compraService;

    public CompraController(CompraService compraService){
        this.compraService = compraService;
    }
    @PostMapping("")
    public ResponseEntity<CompraDTO> add(@RequestBody CompraDTO entity){
        return ResponseEntity.ok(compraService.addCompra(entity));
    }
    @GetMapping(value="")
    public ResponseEntity<List<CompraEnteraDTO>> list() {
        return ResponseEntity.ok(compraService.listCompras());
    }
}
