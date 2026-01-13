package es.educastur.fuc29945.biblioteca2025;


import es.educastur.fuc29945.biblioteca2025.Usuario;
import es.educastur.fuc29945.biblioteca2025.Libro;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1dawd27
 */
public class Prestamo {
   private Libro libroPrestado;
    private Usuario usuarioPrestado;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Libro libroPrestado, Usuario usuarioPrestado, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.libroPrestado = libroPrestado;
        this.usuarioPrestado = usuarioPrestado;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    public Usuario getUsuarioPrestado() {
        return usuarioPrestado;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    public void setUsuarioPrestado(Usuario usuarioPrestado) {
        this.usuarioPrestado = usuarioPrestado;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return libroPrestado + ", " + usuarioPrestado + ", " + fechaPrestamo + ", " + fechaDevolucion;
    }
    
}
