package com.ung.sistema_biblioteca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ung.sistema_biblioteca.Repository.LivroRepository;
import com.ung.sistema_biblioteca.model.Livro;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> findAll() {
        return livroRepository.findAll();
    }

    public Livro save(Livro livro) {
        return livroRepository.save(livro);
    }

    public void delete(Long id) {
        livroRepository.deleteById(id);
    }

    // Adicione outro métodos conforme necessário findAll, findById, etc.
}
