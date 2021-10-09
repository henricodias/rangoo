package com.rangoo.repository;

import com.rangoo.entity.Categoria;
import com.rangoo.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}