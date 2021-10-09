package com.rangoo.service;

import com.rangoo.entity.Cliente;
import com.rangoo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente add(Cliente cl){
        return repository.save(cl);
    }
}