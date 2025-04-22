/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author Usuario
 */
public class Pajaro extends Animal{
    
    public Pajaro (String nombre, int edad){
        super(nombre, edad);
    
    }
    
    @Override
    public void hacerSonico(){
        System.out.println("Pio, pio");
    
    }
}
