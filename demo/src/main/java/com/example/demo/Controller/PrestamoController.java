package com.example.demo.Controller;

import com.example.demo.Logic.Prestamo;
import com.example.demo.Responses.ResponseHandler;
import com.example.demo.Service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService service;

    @GetMapping
    public ResponseEntity<Object> getAll() {
        return ResponseHandler.response("Lista de préstamos", 200, service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable Long id) {
        return service.findById(id)
            .map(prestamo -> ResponseHandler.response("Préstamo encontrado", 200, prestamo))
            .orElse(ResponseHandler.response("No encontrado", 404, null));
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Prestamo prestamo) {
        return ResponseHandler.response("Préstamo creado", 201, service.save(prestamo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseHandler.response("Eliminado", 200, null);
    }
}
