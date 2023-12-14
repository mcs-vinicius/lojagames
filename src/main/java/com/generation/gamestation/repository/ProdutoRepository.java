package com.generation.gamestation.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.generation.gamestation.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{
	List<Produto> findAllByNomeContainingIgnoreCase (@Param("nome")String nome);
	List<Produto> findAllByPlataformaContainingIgnoreCase (@Param("plataforma")String plataforma);
	List<Produto> findAllByFabricanteContainingIgnoreCase (@Param("fabricante")String fabricante);
}
