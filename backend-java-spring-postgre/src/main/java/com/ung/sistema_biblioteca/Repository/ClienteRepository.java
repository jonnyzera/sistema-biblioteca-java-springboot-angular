package com.ung.sistema_biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ung.sistema_biblioteca.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
