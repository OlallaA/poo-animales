/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author Usuario
 */
public class Main {
    
      
      
    
      public static void main(String[] args) {
        
      Perro miPerro = new Perro();
      Gato miGato = new Gato();
      
      miPerro.setNombre("Thor");
      miPerro.setEdad(4);
      
          System.out.println("Nombre" + miPerro.getNombre());
          System.out.println("Edad" + miPerro.getEdad());
          miPerro.hacerSonido();
          
          
      miGato.setNombre("Glorfindel");
      miGato.setEdad(2);
      
          System.out.println("Nombre" + miGato.getNombre());
          System.out.println("Edad" + miGato.getEdad());
          miGato.hacerSonido();
          
        
        
    }
    
    
}
