package com.biblioteca.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.biblioteca.apirest.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
