package com.rangoo.service;

import com.rangoo.entity.Venda;
import com.rangoo.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendaService {

    @Autowired
    private VendaRepository repository;

    public List<Venda> listar() {
        return repository.findAll();
    }

    public Venda add(Venda v){
        return repository.save(v);
    }
}