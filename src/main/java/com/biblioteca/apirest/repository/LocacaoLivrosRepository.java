package com.biblioteca.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.biblioteca.apirest.models.LocacaoLivros;

public interface LocacaoLivrosRepository extends JpaRepository<LocacaoLivros, Long> {
	
	@Query(value = "SELECT * FROM locacao_livros WHERE id_locacao = :id", nativeQuery = true)
	List<LocacaoLivros> findAllByLocacaoId(@Param("id") Long id_locacao);

}
