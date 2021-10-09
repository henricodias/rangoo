package com.rangoo.controller;

import com.rangoo.entity.Cliente;
import com.rangoo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cl) {
        return service.add(cl);
    }
}
