package com.ung.sistema_biblioteca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ung.sistema_biblioteca.Repository.EmprestivoRepository;
import com.ung.sistema_biblioteca.model.Emprestimo;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestivoRepository emprestimoRepository;

    public List<Emprestimo> findAll() {
        return emprestimoRepository.findAll();
    }

    public Emprestimo save(Emprestimo emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    public void delete(Long id) {
        emprestimoRepository.deleteById(id);
    }

    // Adicione outro métodos conforme necessário findAll, findById, etc.
}
