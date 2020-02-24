package com.reysson.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reysson.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepositories extends JpaRepository<Categoria, Integer>{

}
