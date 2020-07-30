package com.biblioteca.apirest.resources;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface Controller<T> {	
	
	public List<?> listar();	
	
	public T buscar(@PathVariable(name = "id") Long id);	
	
	public T salvar(@RequestBody T object);	
	
	public T alterar(@RequestBody T object);	
	
	public void deletar(@RequestBody T object);

}
