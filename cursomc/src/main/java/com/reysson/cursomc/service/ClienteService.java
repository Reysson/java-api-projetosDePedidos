package com.reysson.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reysson.cursomc.domain.Cliente;
import com.reysson.cursomc.repositories.ClienteRepositories;
import com.reysson.cursomc.service.exception.ObjetoNaoEncotradoException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepositories categoriaRepositories;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = categoriaRepositories.findById(id);
		return obj.orElseThrow(() -> new ObjetoNaoEncotradoException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName())); 
	}
}
