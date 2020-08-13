package com.biblioteca.apirest.models;
import java.util.List;

public class LocacaoJSON {
		
	private Cliente cliente;
	private List<Livro> livros;
	private Locacao locacao;
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public Locacao getLocacao() {
		return locacao;
	}
	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}		
	

}
