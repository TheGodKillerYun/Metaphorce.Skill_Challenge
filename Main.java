package com.Metaphorce.vista;

import com.Metaphorce.modelo.GestorPeliculas;
import com.Metaphorce.modelo.Pelicula;

/**
 * Clase principal que demuestra el uso del gestorx de películas.
 */
public class Main {
    public static void main(String[] args) {
        // Crear el gestor de películas
        GestorPeliculas gestor = new GestorPeliculas();

        // Agregar algunas películas
        gestor.agregarPelicula(new Pelicula(1, "El Padrino", true));
        gestor.agregarPelicula(new Pelicula(2, "Pulp Fiction", false));
        gestor.agregarPelicula(new Pelicula(3, "El Señor de los Anillos", true));
        gestor.agregarPelicula(new Pelicula(4, "Interestelar", false));
        gestor.agregarPelicula(new Pelicula(5, "Matrix", true));

        // Mostrar todas las películas
        System.out.println("Todas las películas:");
        gestor.obtenerPeliculas().forEach(System.out::println);

        // Eliminar una película
        gestor.eliminarPelicula(3);
        System.out.println("\nDespués de eliminar la película con ID 3:");
        gestor.obtenerPeliculas().forEach(System.out::println);

        // Marcar una película como disponible
        gestor.marcarPeliculaComoDisponible(2);
        System.out.println("\nDespués de marcar la película con ID 2 como disponible:");
        gestor.obtenerPeliculas().forEach(System.out::println);

        // Mostrar películas no disponibles
        System.out.println("\nPelículas no disponibles:");
        gestor.obtenerPeliculasNoDisponibles().forEach(System.out::println);
    }
}