package com.biblioteca.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.apirest.models.Livro;
import com.biblioteca.apirest.repository.LivroRepository;

@RestController
@RequestMapping(value = "/api")
public class LivroController implements Controller<Livro> {
	
	@Autowired
	private LivroRepository repository;
	
	@GetMapping("/livros")	
	@Override
	public List<Livro> listar() {
		return repository.findAll();	
	}
	
	@GetMapping("/livro/{id}")	
	@Override
	public Livro buscar(Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/livro")		
	@Override
	public Livro salvar(Livro object) {
		return repository.save(object);
	}
	
	@PutMapping("/livro")		
	@Override
	public Livro alterar(Livro object) {
		return repository.save(object);
	}
	
	@DeleteMapping("/livro")
	@Override
	public void deletar(Livro object) {
		repository.delete(object);
	}
	
	
}
