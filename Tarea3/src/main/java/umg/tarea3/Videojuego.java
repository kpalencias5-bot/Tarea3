/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.tarea3;

/**
 *
 * @author KATYYYY
 */
public class Videojuego {
    String nombre;
    String plataforma;
    int anioLanzamiento;

    public Videojuego(String nombre, String plataforma,
                      int anioLanzamiento) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.anioLanzamiento = anioLanzamiento;
  }  
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " | Plataforma: " + plataforma
                + " | Año: " + anioLanzamiento;
    }
}
