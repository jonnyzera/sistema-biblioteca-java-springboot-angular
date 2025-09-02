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

import com.ung.sistema_biblioteca.Service.EmprestimoService;
import com.ung.sistema_biblioteca.model.Emprestimo;

@RestController
@RequestMapping("/api/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @GetMapping
    public List<Emprestimo> getAllEmprestimos() {
        return emprestimoService.findAll();
    }

    @PostMapping
    public Emprestimo createEmprestimo(@RequestBody Emprestimo emprestimo) {
        return emprestimoService.save(emprestimo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmprestimo(@PathVariable Long id) {
        emprestimoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
