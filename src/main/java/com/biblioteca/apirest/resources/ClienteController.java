package com.biblioteca.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.apirest.models.Cliente;
import com.biblioteca.apirest.repository.ClienteRepository;

@RestController
@RequestMapping(value = "/api")
public class ClienteController implements Controller<Cliente> {
	
	@Autowired
	private ClienteRepository repository;

	@GetMapping("/clientes")
	@Override
	public List<?> listar() {
		return repository.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	@Override
	public Cliente buscar(Long id) {
		return repository.findById(id).get();
	}

	@PostMapping("/cliente")
	@Override
	public Cliente salvar(Cliente cliente) {
		return repository.save(cliente);
	}

	@PutMapping("/cliente")
	@Override
	public Cliente alterar(Cliente cliente) {
		return repository.save(cliente);
	}

	@DeleteMapping("/cliente")
	@Override
	public void deletar(Cliente cliente) {
		repository.delete(cliente);
	}

	

}
