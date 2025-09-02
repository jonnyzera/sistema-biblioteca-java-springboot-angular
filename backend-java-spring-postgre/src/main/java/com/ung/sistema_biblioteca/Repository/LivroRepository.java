package com.ung.sistema_biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ung.sistema_biblioteca.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
