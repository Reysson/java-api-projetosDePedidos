package com.reysson.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reysson.cursomc.domain.Categoria;
import com.reysson.cursomc.repositories.CategoriaRepositories;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	CategoriaRepositories categoriaRepositorie;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		/*---------------------------------------------------*/
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		categoriaRepositorie.saveAll(Arrays.asList(cat1,cat2));
		/*----------------------------------------------------*/
		
		
		
	}

}
