package com.biblioteca.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.apirest.models.Livro;
import com.biblioteca.apirest.repository.LivroRepository;

@RestController
@RequestMapping(value = "/api")
public class LivroController {
	
	@Autowired
	LivroRepository repository;
	
	@GetMapping("/livros")
	public List<Livro> listarLivros(){
		return repository.findAll();		
	}
	@GetMapping("/livro/{id}")
	public Livro listarLivroUnico(@PathVariable(name = "id") Long id){
		return repository.findById(id).get();	
	}
	
	@PostMapping("/livro")
	public Livro salvarLivro(@RequestBody Livro livro){
		return repository.save(livro);		
	}
	
}
