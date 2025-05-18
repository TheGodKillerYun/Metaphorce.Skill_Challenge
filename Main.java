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

        // Creacion de películas
        gestor.agregarPelicula(new Pelicula(1, "Aftersun", true));
        gestor.agregarPelicula(new Pelicula(2, "New Avengers", false));
        gestor.agregarPelicula(new Pelicula(3, "Cyberpunk 2077", true));
        gestor.agregarPelicula(new Pelicula(4, "Interestelar", false));
        gestor.agregarPelicula(new Pelicula(5, "About Time", true));

        // Mostrar todas las películas
        System.out.println("Todas las películas:");
        gestor.obtenerPeliculas().forEach(System.out::println);

        // Eliminar una película
        gestor.eliminarPelicula(3 );
        System.out.println("\nDespués de eliminar la película con ID 3:");
        gestor.obtenerPeliculas().forEach(System.out::println);

        // Marcar una película como disponible
        gestor.marcarPeliculaComoDisponible(2);
        System.out.println("\nDespués de marcar la película con ID 2 como disponible:");
        gestor.obtenerPeliculas().forEach(System.out::println);

        // Mostrar películas no disponibles
        System.out.println("\nPelículas no disponibles:");
        gestor.obtenerPeliculasNoDisponibles().forEach(System.out::println);

        //Prueba de Validacion
        gestor.obtenerPeliculas();
        gestor.obtenerPeliculasDisponibles();
        gestor.obtenerPeliculasNoDisponibles();

        gestor.marcarPeliculaComoDisponible(2);
        gestor.marcarPeliculaComoDisponible(99); // ID inexistente

        gestor.eliminarPelicula(3);
        gestor.eliminarPelicula(30); //Id inexistente
    }
}