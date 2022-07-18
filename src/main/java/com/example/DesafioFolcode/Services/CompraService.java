package com.example.DesafioFolcode.Services;

import com.example.DesafioFolcode.Models.Dto.CompraDTO;
import com.example.DesafioFolcode.Models.Dto.CompraEnteraDTO;
import com.example.DesafioFolcode.Models.Entities.Compra;
import com.example.DesafioFolcode.Models.Mappers.CompraMapper;
import com.example.DesafioFolcode.Repositories.CompraRepository;
import com.example.DesafioFolcode.Services.Interfaces.Icompra;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("compraService")
public class CompraService implements Icompra {
    private final CompraMapper compramapper;
    private final CompraRepository compraRepository;

    public CompraService(CompraMapper compramapper,CompraRepository compraRepository){
        this.compramapper = compramapper;
        this.compraRepository = compraRepository;
    };

    public CompraDTO addCompra(CompraDTO entity){
        entity.setId(null);
        return compramapper.entityToDto(compraRepository.save(compramapper.dtoToEntity(entity)));
    }
    public List<CompraEnteraDTO> listCompras(){
        List<Compra> compras = (List<Compra>) compraRepository.findAll();
        return compras.stream().map(compramapper::entityToEnteroDto).collect(Collectors.toList());
    }
}
