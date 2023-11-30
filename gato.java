/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales;

/**
 *
 * @author Usuario
 */
public class gato {
    String nombre;
int edad;
String raza;
String color;
int vacunas;
    
    public gato(String nombre, int edad, String raza, String color, int vacunas) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.vacunas = vacunas;
        
    }
    
    public void dormir (){
        System.out.println(this.nombre + " Empezo a dormir ");
    }
    
    public void maullar (){
        System.out.println(this.nombre + " Empezo a maullar ");
    }
    
    public void ronronear (){
        System.out.println(this.nombre + " Empezo a ronronear ");
    }
    
    public void lamerse (){
        System.out.println(this.nombre + " Empezo a lamerse ");
}
}