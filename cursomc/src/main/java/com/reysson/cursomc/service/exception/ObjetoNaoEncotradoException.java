package com.reysson.cursomc.service.exception;

public class ObjetoNaoEncotradoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjetoNaoEncotradoException(String msg) {
		super(msg);
	}
	
	public ObjetoNaoEncotradoException(String msg, Throwable causa) {
		super(msg, causa);
	}
}
