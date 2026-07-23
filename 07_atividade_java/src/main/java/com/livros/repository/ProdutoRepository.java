package com.livros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livros.models.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{

}
