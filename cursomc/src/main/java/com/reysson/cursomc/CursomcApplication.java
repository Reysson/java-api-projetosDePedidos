package com.reysson.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reysson.cursomc.domain.Categoria;
import com.reysson.cursomc.domain.Cidade;
import com.reysson.cursomc.domain.Cliente;
import com.reysson.cursomc.domain.Endereco;
import com.reysson.cursomc.domain.Estado;
import com.reysson.cursomc.domain.Produto;
import com.reysson.cursomc.domain.enuns.TipoCliente;
import com.reysson.cursomc.repositories.CategoriaRepositories;
import com.reysson.cursomc.repositories.CidadeRepositories;
import com.reysson.cursomc.repositories.ClienteRepositories;
import com.reysson.cursomc.repositories.EnderecoRespositories;
import com.reysson.cursomc.repositories.EstadoRepositories;
import com.reysson.cursomc.repositories.ProdutoRepositories;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	CategoriaRepositories categoriaRepositorie;
	
	@Autowired
	ProdutoRepositories produtoRepositories;
	
	@Autowired
	EstadoRepositories estadoRepositories;
	
	@Autowired
	CidadeRepositories cidadeRepositories;
	
	@Autowired
	ClienteRepositories clienteRespositories;
	
	@Autowired
	EnderecoRespositories enderecoRespositories;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		/*---------------------------------------------------*/
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00f);
		Produto p2 = new Produto(null, "Impressora", 800.00f);
		Produto p3 = new Produto(null, "Mouse", 80.00f);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		
		categoriaRepositorie.saveAll(Arrays.asList(cat1,cat2));
		produtoRepositories.saveAll(Arrays.asList(p1,p2,p3));
		/*----------------------------------------------------*/
		
		Estado e1 = new Estado(null, "Minas Gerais");
		Estado e2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null, "Uberlândia", e1);
		Cidade c2 = new Cidade(null, "São Paulo", e2);
		Cidade c3 = new Cidade(null, "Campinas", e2);
		
		e1.getCidades().addAll(Arrays.asList(c1));
		e2.getCidades().addAll(Arrays.asList(c2,c3));
		
		estadoRepositories.saveAll(Arrays.asList(e1,e2));
		cidadeRepositories.saveAll(Arrays.asList(c1,c2,c3));
		
		/*----------------------------------------------------*/
		
		Cliente cl1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "000.254.758-06", TipoCliente.PESSOAFISICA);
		cl1.getTelefones().addAll(Arrays.asList("3625-9658", "2245-7789"));
		
		Endereco en1 = new Endereco(null, "Maria das Flores", "1245", "Ap-14", "Guanabara", "20-963-785", cl1, c1);
		
		Endereco en2 = new Endereco(null, "Ceza Junior", "1475", "Casa", "Bacabeira", "69-578-000", cl1, c2);
		
		cl1.getEnderecos().addAll(Arrays.asList(en1,en2));
		
		clienteRespositories.saveAll(Arrays.asList(cl1));
		
		enderecoRespositories.saveAll(Arrays.asList(en1,en2));
		
		
	}

}
