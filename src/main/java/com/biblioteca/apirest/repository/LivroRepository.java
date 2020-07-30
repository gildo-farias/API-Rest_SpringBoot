package com.biblioteca.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.biblioteca.apirest.models.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
