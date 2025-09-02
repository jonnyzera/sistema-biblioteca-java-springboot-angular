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

import com.ung.sistema_biblioteca.Service.ClienteService;
import com.ung.sistema_biblioteca.model.Cliente;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.findAll();
    }

    @PostMapping
    Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {

        clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Adione PUT para update se necessário
}
