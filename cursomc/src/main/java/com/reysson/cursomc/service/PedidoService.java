package com.reysson.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reysson.cursomc.domain.Pedido;
import com.reysson.cursomc.repositories.PedidoRepository;
import com.reysson.cursomc.service.exception.ObjetoNaoEncotradoException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = pedidoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjetoNaoEncotradoException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName())); 
	}
}
