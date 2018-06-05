/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author ESFOT
 */
public class ListaAutor {
    
    private String nombre;

    public ListaAutor(String nombre) {
        this.nombre = nombre;
    }  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre del autor:" + nombre;
    }
    
    
}
