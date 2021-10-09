package com.rangoo.controller;

import com.rangoo.entity.Venda;
import com.rangoo.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaService service;

    @GetMapping
    public List<Venda> listar() {
        return service.listar();
    }

    @PostMapping
    public Venda salvar(@RequestBody Venda v) {
        return service.add(v);
    }
}