package com.rangoo.service;

import com.rangoo.entity.Categoria;
import com.rangoo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> listar() {
        return repository.findAll();
    }

    public Categoria add(Categoria ca){
        return repository.save(ca);
    }
}