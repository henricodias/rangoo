package com.rangoo.controller;

import com.rangoo.entity.Restaurante;
import com.rangoo.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService service;

    @GetMapping
    public List<Restaurante> listar() {
        return service.listar();
    }

    @PostMapping
    public Restaurante salvar(@RequestBody Restaurante r) {
        return service.add(r);
    }
}