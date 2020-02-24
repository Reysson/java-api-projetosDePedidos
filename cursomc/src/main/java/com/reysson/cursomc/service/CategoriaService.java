package com.reysson.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reysson.cursomc.domain.Categoria;
import com.reysson.cursomc.repositories.CategoriaRepositories;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepositories categoriaRepositories;
	
	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj = categoriaRepositories.findById(id);
		return obj;
	}
}
