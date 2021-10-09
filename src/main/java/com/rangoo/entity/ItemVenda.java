package com.rangoo.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "item_venda")
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Cliente cliente;

    @Column
    private Restaurante restaurante;

    @Column
    private Produto produto;

    @Column
    private Integer quantidade;

    @Column
    private Double subtotal;
}