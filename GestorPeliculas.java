package com.Metaphorce.modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorPeliculas {
    private List<Pelicula> peliculas;

    public GestorPeliculas() {
        this.peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("🎬 Película '" + pelicula.getNombre() + "' (ID: " + pelicula.getId() + ") agregada exitosamente");
    }

    public boolean eliminarPelicula(int id) {
        boolean eliminada = peliculas.removeIf(p -> p.getId() == id);
        if (eliminada) {
            System.out.println("🗑️ Película con ID " + id + " eliminada correctamente");
        } else {
            System.out.println("⚠️ No se encontró ninguna película con ID " + id);
        }
        return eliminada;
    }

    public List<Pelicula> obtenerPeliculas() {
        System.out.println("📋 Listado completo de películas (" + peliculas.size() + " registros)");
        return new ArrayList<>(peliculas);
    }

    public List<Pelicula> obtenerPeliculasDisponibles() {
        List<Pelicula> disponibles = peliculas.stream()
                .filter(Pelicula::isDisponible)
                .toList();
        System.out.println("✅ Películas disponibles: " + disponibles.size());
        return new ArrayList<>(disponibles);
    }

    public List<Pelicula> obtenerPeliculasNoDisponibles() {
        List<Pelicula> noDisponibles = peliculas.stream()
                .filter(p -> !p.isDisponible())
                .toList();
        System.out.println("⛔ Películas no disponibles: " + noDisponibles.size());
        return new ArrayList<>(noDisponibles);
    }

    public boolean marcarPeliculaComoDisponible(int id) {
        for (Pelicula p : peliculas) {
            if (p.getId() == id) {
                if (p.isDisponible()) {
                    System.out.println("ℹ️ La película con ID " + id + " ya estaba disponible");
                } else {
                    p.setDisponible(true);
                    System.out.println("🔄 Película con ID " + id + " marcada como disponible");
                }
                return true;
            }
        }
        System.out.println("⚠️ No se encontró ninguna película con ID " + id);
        return false;
    }
}