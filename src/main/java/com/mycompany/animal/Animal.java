/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animal;

/**
 *
 * @author Usuario
 */
public class Animal {

    public void hacerSonido() {
        System.out.println("Sonido de animal");
        
    }
    
    
    private String nombre;
    private int edad;


    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
  
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
  
}
