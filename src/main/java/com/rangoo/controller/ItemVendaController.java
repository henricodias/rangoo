package com.rangoo.controller;

import com.rangoo.entity.ItemVenda;
import com.rangoo.service.ItemVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item_venda")
public class ItemVendaController {

    @Autowired
    private ItemVendaService service;

    @GetMapping
    public List<ItemVenda> listar() {
        return service.listar();
    }

    @PostMapping
    public ItemVenda salvar(@RequestBody ItemVenda i) {
        return service.add(i);
    }
}