package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tabela_cartao")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String numero;
    @Column(name = "limite_disponivel", precision = 13, scale = 2)
    private BigDecimal limite;

    public Long getId() {
        return id;
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public BigDecimal getLimite() {
        return limite;
    }
    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }
}
