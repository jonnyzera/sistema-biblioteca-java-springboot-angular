package com.ung.sistema_biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ung.sistema_biblioteca.model.Emprestimo;

public interface EmprestivoRepository extends JpaRepository<Emprestimo, Long> {

}
