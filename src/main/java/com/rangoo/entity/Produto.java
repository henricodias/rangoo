package com.rangoo.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Restaurante restaurante;

    @Column
    private Categoria categoria;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private Double valor;
}