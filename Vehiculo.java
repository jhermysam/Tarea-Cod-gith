/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiculo;

/**
 *
 * @author usuario
 */
public class Vehiculo {

     public static void main(String[] args) {
        System.out.println("Hello World!");
        carro car = new carro(" Toyota Fortuner ",150,2023, "Blanco", 5 );
        car.fallar();
        car.sobrecalentarse();
        car.moverse(10); 

    }
}