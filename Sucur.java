/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sucur;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Sucur {
    public static void main(String[] args) {

        String[][] sucursalespro = {
                {"manzanas ", "peras", "naranjas"},
                {"pan", "trigo", "arroz"},
                {"agua ", "gaseosas", "jugos"}
        };

        Scanner scanner = new Scanner(System.in);
        int numeroSucursal;

        System.out.print("Ingrese el número de la sucursal (1-3): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        numeroSucursal = scanner.nextInt();

        switch (numeroSucursal) {
            case 1:
            case 2:
            case 3:
                
                System.out.println("Productos disponibles en la Sucursal " + numeroSucursal + ":");
                for (int i = 0; i < sucursalespro[numeroSucursal - 1].length; i++) {
                    System.out.println((i + 1) + ". " + sucursalespro[numeroSucursal - 1][i]);
                }

                int numeroProducto;
                do {
                    System.out.print("Ingrese el número del producto (1-3): ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Por favor, ingrese un número válido.");
                        scanner.next();
                    }
                    numeroProducto = scanner.nextInt();

                    if (numeroProducto < 1 || numeroProducto > 3) {
                        System.out.println("Número de producto no válido. Por favor, ingrese un número entre 1 y 3.");
                    }

                } while (numeroProducto < 1 || numeroProducto > 3);

            
                String productoSeleccionado = sucursalespro[numeroSucursal - 1][numeroProducto - 1];
                System.out.println("Ha seleccionado el Producto: " + productoSeleccionado + " en la Sucursal " + numeroSucursal);
                break;
            default:
                System.out.println("Número de sucursal no válido. Por favor, ingrese un número entre 1 y 3.");
        }
    }
}


