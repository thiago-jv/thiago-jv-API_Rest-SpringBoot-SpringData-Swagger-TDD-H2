package br.com.thiago.servico.exception;

public class EntidadeEmUso extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public EntidadeEmUso(String messagem) {
		super(messagem);
	}
}
