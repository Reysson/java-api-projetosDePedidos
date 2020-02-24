package com.reysson.cursomc.resource.exception;

import java.io.Serializable;

public class ErroPadrao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String mensagem;
	private Long tempo;
	public ErroPadrao(Integer status, String mensagem, Long tempo) {
		super();
		this.status = status;
		this.mensagem = mensagem;
		this.tempo = tempo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Long getTempo() {
		return tempo;
	}
	public void setTempo(Long tempo) {
		this.tempo = tempo;
	}
	
	
}
