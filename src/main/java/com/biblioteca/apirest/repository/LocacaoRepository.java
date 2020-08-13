package com.biblioteca.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.biblioteca.apirest.models.Locacao;


public interface LocacaoRepository extends JpaRepository<Locacao, Long>{

	@Query(value = "SELECT * FROM locacao WHERE status = true ORDER BY data_devo", nativeQuery = true)
	List<Locacao> findAllOrderByData();
}
