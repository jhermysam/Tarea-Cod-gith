/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales;

/**
 *
 * @author Usuario
 */
public class perro {
    String nombre;
int edad;
String raza;
String color;
int vacunas;
    
    public perro(String nombre, int edad, String raza, String color, int vacunas) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.vacunas = vacunas;
        
    }
    
    public void saltar (){
        System.out.println(this.nombre + " Empezo a saltar ");
    }
    
    public void jugar (){
        System.out.println(this.nombre + " Empezo a jugar ");
    }
    
    public void comer (){
        System.out.println(this.nombre + " Empezo a comer ");
    }
}
