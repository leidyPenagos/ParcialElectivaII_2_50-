package com.example.demo.Service;

import com.example.demo.Logic.Prestamo;
import com.example.demo.Repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository repository;

    public List<Prestamo> findAll() {
        return repository.findAll();
    }

    public Optional<Prestamo> findById(Long id) {
        return repository.findById(id);
    }

    public Prestamo save(Prestamo prestamo) {
        return repository.save(prestamo);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
