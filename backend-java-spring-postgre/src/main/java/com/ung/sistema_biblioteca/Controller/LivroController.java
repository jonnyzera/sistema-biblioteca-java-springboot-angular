package com.ung.sistema_biblioteca.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ung.sistema_biblioteca.Service.LivroService;
import com.ung.sistema_biblioteca.model.Livro;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> getAllLivros() {
        return livroService.findAll();
    }

    @PostMapping
    public Livro createLivro(@RequestBody Livro livro) {
        return livroService.save(livro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLivro(@PathVariable Long id) {
        livroService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
