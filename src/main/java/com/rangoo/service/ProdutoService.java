package com.rangoo.service;

import com.rangoo.entity.Produto;
import com.rangoo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listar() {
        return repository.findAll();
    }

    public Produto add(Produto p){
        return repository.save(p);
    }
}