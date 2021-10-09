package com.rangoo.service;

import com.rangoo.entity.ItemVenda;
import com.rangoo.repository.ItemVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemVendaService {

    @Autowired
    private ItemVendaRepository repository;

    public List<ItemVenda> listar() {
        return repository.findAll();
    }

    public ItemVenda add(ItemVenda i){
        return repository.save(i);
    }
}