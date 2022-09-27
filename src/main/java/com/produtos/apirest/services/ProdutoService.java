package com.produtos.apirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repositories.ProdutoRepository;

@Service
public class ProdutoService {	
	
	@Autowired
	private ProdutoRepository repository;
	
	
	public List<Produto> findAll() {
		return repository.findAll();
	}
	
	
	public Produto findById(Long id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.get();
		
	}
	
	public Produto insert( Produto obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Produto update (Produto produto) {
		return repository.save(produto); 
	}
	
}
