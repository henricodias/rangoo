package com.rangoo.service;

import com.rangoo.entity.Restaurante;
import com.rangoo.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository repository;

    public List<Restaurante> listar() {
        return repository.findAll();
    }

    public Restaurante add(Restaurante r){
        return repository.save(r);
    }
}