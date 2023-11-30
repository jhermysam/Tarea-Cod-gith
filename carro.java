package com.mycompany.vehiculo;

/**
 *
 * @author Usuario
 */
public class carro {
    String modelo;
    int kilometraje;
    int año;
    String color;
    int revisiones;
    int velocidad;

    public carro(String modelo, int kilometraje, int año, String color, int revisiones) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.año = año;
        this.color = color;
        this.revisiones = revisiones;
        this.velocidad = 0;
    }

    public void moverse(int nuevaVelocidad) {
        this.velocidad = nuevaVelocidad;
        System.out.println(this.modelo + " Empezó a moverse a " + this.velocidad + " km/h");

        if (this.velocidad > 50) {
            System.out.println("El vehiculo se mueve a  " + this.velocidad + " km/h por lo que tendra una multa");
        } else {
            System.out.println("Velocidad permitida: " + this.velocidad + " km/h");
        }
    }

    public void fallar() {
        System.out.println(this.modelo + " Empezó a fallar");
    }

    public void sobrecalentarse() {
        System.out.println(this.modelo + " Empezó a sobrecalentarse");
    }
}
