package com.reysson.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reysson.cursomc.domain.Estado;

@Repository
public interface EstadoRepositories extends JpaRepository<Estado, Integer>{

}
