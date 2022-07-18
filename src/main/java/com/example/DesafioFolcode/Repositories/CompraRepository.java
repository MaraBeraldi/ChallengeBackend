package com.example.DesafioFolcode.Repositories;

import com.example.DesafioFolcode.Models.Entities.Compra;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends PagingAndSortingRepository<Compra, Integer> {
}
