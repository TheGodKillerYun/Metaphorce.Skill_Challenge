package com.metaphorce.modelo;

/**
 * Clase que representa una película con sus atributos básicos.
 */
public class Pelicula {
    private int id;
    private String nombre;
    private boolean disponible;

    /**
     * Constructor de la clase Pelicula.
     * @param id Identificador único de la película
     * @param nombre Nombre de la película
     * @param disponible Estado de disponibilidad
     */
    public Pelicula(int id, String nombre, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}