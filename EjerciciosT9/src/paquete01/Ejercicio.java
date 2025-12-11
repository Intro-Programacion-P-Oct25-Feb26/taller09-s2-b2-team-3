/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String dato;
        String letra;
        int cantidad;
        int i = 0;
        System.out.println("¿Cuantas marcas desea ingresar?");
        cantidad = entrada.nextInt();
        entrada.nextLine();

        String[] arreglo1 = new String[cantidad];

        while (i < arreglo1.length) {
            System.out.println("Ingrese una marca de vehiculo (no se permite  "
                    + "que la marca empiece con estas letras A, C, T)");
            dato = entrada.nextLine();
            letra = dato.substring(0, 1);
            letra = letra.toLowerCase();
            switch (letra) {
                case "a":
                case "c":
                case "t":
                    System.out.println("Marca invalida");
                    break;
                default:
                    arreglo1[i] = dato;
                    i++;
            }
        }
        System.out.println("\nLista de marcas ingresadas\n"
                + "--------------------------------------");
        for (int e = 0; e < arreglo1.length; e++) {
            System.out.printf("Marca %d: %s\n",
                    e, arreglo1[e]);
        }

    }
}
