package com.example.demo.Logic;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Entity
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean devuelto;

    private String nombreUsuario;
    private String nombreRecurso;

    // --- Constructores ---
    public Prestamo() {}

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion, boolean devuelto, String nombreUsuario, String nombreRecurso) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = devuelto;
        this.nombreUsuario = nombreUsuario;
        this.nombreRecurso = nombreRecurso;
    }

    // --- Getters y Setters ---
    public Long getId() { return id; }

    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public void setFechaPrestamo(LocalDate fechaPrestamo) { this.fechaPrestamo = fechaPrestamo; }

    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(LocalDate fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }

    public boolean isDevuelto() { return devuelto; }
    public void setDevuelto(boolean devuelto) { this.devuelto = devuelto; }

    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public String getNombreRecurso() { return nombreRecurso; }
    public void setNombreRecurso(String nombreRecurso) { this.nombreRecurso = nombreRecurso; }

    // --- Métodos de lógica de negocio ---
    public boolean tieneRetraso() {
        return !devuelto && fechaDevolucion.isBefore(LocalDate.now());
    }

    public long diasDeRetraso() {
        return tieneRetraso() ? ChronoUnit.DAYS.between(fechaDevolucion, LocalDate.now()) : 0;
    }
}
