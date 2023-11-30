/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animales;

/**
 *
 * @author Usuario
 */
public class Animales {

     public static void main(String[] args) {
        perro perr = new perro("Rufo", 10, "Aleman", "Negro", 5);
        perr.comer();
        perr.saltar();
        perr.jugar();

        System.out.println();

        gato gat = new gato("Donal", 6, "Siames", "Negro", 5);
        gat.dormir();
        gat.maullar();
        gat.ronronear();
        gat.lamerse();
    }
}
