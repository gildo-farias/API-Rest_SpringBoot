package com.biblioteca.apirest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.apirest.models.Livro;
import com.biblioteca.apirest.models.Locacao;
import com.biblioteca.apirest.models.LocacaoJSON;
import com.biblioteca.apirest.models.LocacaoLivros;
import com.biblioteca.apirest.repository.ClienteRepository;
import com.biblioteca.apirest.repository.LivroRepository;
import com.biblioteca.apirest.repository.LocacaoLivrosRepository;
import com.biblioteca.apirest.repository.LocacaoRepository;

@RestController
@RequestMapping(value = "/api")
public class LocacaoController implements Controller<LocacaoJSON>{
	
	@Autowired
	private LocacaoRepository repository;
	@Autowired
	private LocacaoLivrosRepository repositoryInterable;
	
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private LivroRepository livroRepository;	

	@GetMapping("/locacao")	
	@Override
	public List<LocacaoJSON> listar() {
		List<LocacaoJSON> jsons = new ArrayList<LocacaoJSON>();
		for (Locacao locacao: repository.findAllOrderByData()) {			
			LocacaoJSON locacaoJSON = new LocacaoJSON();
			locacaoJSON.setLocacao(locacao);
			locacaoJSON.setCliente(clienteRepository.findById(locacao.getId_cliente()).get());
			
			List<Livro> livros = new ArrayList<Livro>();
			for (LocacaoLivros locacaoLivros: repositoryInterable.findAllByLocacaoId(locacao.getId())) {				
				livros.add(livroRepository.findById(locacaoLivros.getId_livro()).get());
			}
			locacaoJSON.setLivros(livros);
			jsons.add(locacaoJSON);
		}
		return jsons;
	}

	@GetMapping("/locacao/{id}")	
	@Override
	public LocacaoJSON buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping("/locacao")
	@Override
	public LocacaoJSON salvar(LocacaoJSON object) {		
		Locacao locacao = repository.save(object.getLocacao());				
		for (Livro livro : object.getLivros()) {
			LocacaoLivros locacaoLivros = new LocacaoLivros();
			
			locacaoLivros.setId_locacao(locacao.getId());
			locacaoLivros.setId_livro(livro.getId());			
			
			repositoryInterable.save(locacaoLivros);			
		}
		return object;
	}

	@Override
	@PutMapping("/locacao")
	public LocacaoJSON alterar(LocacaoJSON object) {
		repository.save(object.getLocacao());
		return object;	
	}

	@DeleteMapping("/locacao/{id}")
	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub				
	}
	
	

}
