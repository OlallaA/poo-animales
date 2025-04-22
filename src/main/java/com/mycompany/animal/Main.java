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
      Gato miGato = new Gato("Glorfindel", 3);
      Pajaro miPajaro = new Pajaro("Gwaihir", 200);
      
      miPerro.setNombre("Thor");
      miPerro.setEdad(4);
          
          System.out.println("Nombre " + miPerro.getNombre());
          System.out.println("Edad " + miPerro.getEdad());
          miPerro.hacerSonido();
          
         
      
          System.out.println("Nombre " + miGato.getNombre());
          System.out.println("Edad " + miGato.getEdad());
          miGato.hacerSonido();
          
     
           System.out.println("Nombre " + miPajaro.getNombre());
           System.out.println("Edad " + miPajaro.getEdad());
           miPajaro.hacerSonico();
        
    }
    
    
}
