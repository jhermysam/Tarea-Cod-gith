/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salud;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Salud {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        Persona persona = new Persona(nombre);

        persona.saludar();
        scanner.close();
    }
}

class Persona {
    private String nombre;

    
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    
    public void saludar() {
        System.out.println("¡Hola, " + nombre + "! Gracias por atender.");
    }
}
