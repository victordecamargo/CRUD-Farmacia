package com.generation.farmacia.repository;

import com.generation.farmacia.model.Categoria;
import com.generation.farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
