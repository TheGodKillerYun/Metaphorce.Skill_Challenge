package com.metaphorce.modelo;

import java.util.ArrayList;
import java.util.List;

/** Clase que gestiona una colección de películas con diversas operaciones. */
public class GestorPeliculas {

    private final List<Pelicula> peliculas;

        /** Constructor que inicializa la lista de películas */
        public GestorPeliculas() {
        this.peliculas = new ArrayList<>();
        }

    /**
     * Agrega una película a la colección.
     * @param pelicula Película a agregar
     */
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    /**
     * Elimina una película de la colección por su ID.
     * @param id ID de la película a eliminar
     * @return true si se eliminó, false si no se encontró
     */
    public boolean eliminarPelicula(int id) {
        return peliculas.removeIf(p -> p.getId() == id);
    }

    /**
     * Obtiene todas las películas de la colección.
     * @return Lista de todas las películas
     */
    public List<Pelicula> obtenerPeliculas() {
        return new ArrayList<>(peliculas);
    }

    /**
     * Obtiene las películas disponibles.
     * @return Lista de películas disponibles
     */
    public List<Pelicula> obtenerPeliculasDisponibles() {
        List<Pelicula> disponibles = new ArrayList<>();
        for (Pelicula p : peliculas) {
            if (p.isDisponible()) {
                disponibles.add(p);
            }
        }
        return disponibles;
    }

    /**
     * Obtiene las películas no disponibles.
     * @return Lista de películas no disponibles
     */
    public List<Pelicula> obtenerPeliculasNoDisponibles() {
        List<Pelicula> noDisponibles = new ArrayList<>();
        for (Pelicula p : peliculas) {
            if (!p.isDisponible()) {
                noDisponibles.add(p);
            }
        }
        return noDisponibles;
    }

    /**
     * Marca una película como disponible por su ID.
     * @param id ID de la película a marcar como disponible
     * @return true si se actualizó, false si no se encontró
     */
    public boolean marcarPeliculaComoDisponible(int id) {
        for (Pelicula p : peliculas) {
            if (p.getId() == id) {
                p.setDisponible(true);
                return true;
            }
        }
        return false;
    }
}