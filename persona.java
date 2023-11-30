/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author DELL
 */
public class persona {
    String nombre;
    int edad;
    
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void saltar (){
        System.out.println(this.nombre + "Empezo a saltar ");
    }
    
    public void jugar (){
        System.out.println(this.nombre + "Empezo a jugar ");
    }
    
    public void comer (){
        System.out.println(this.nombre + "Empezo a comer ");
    }
}
