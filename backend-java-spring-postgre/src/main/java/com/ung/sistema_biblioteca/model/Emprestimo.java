package com.ung.sistema_biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "emprestimos")
@Data
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Livro livro;

    @ManyToOne
    private Cliente cliente;

    private String dataEmprestimo;
    private String dataDevolucao;
}
