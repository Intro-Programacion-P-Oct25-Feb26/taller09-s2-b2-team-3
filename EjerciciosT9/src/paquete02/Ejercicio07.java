/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 * Diseñe una solución que permita al usuario introducir 10 números en un
 * arreglo, luego despliegue cada número y su diferencia a partir del promedio
 * numérico de los números introducidos.
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int suma = 0;
        double promedio;
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ":");
            numeros[i] = entrada.nextInt();
            suma += numeros[i];
        }

        promedio = (double) suma / numeros.length;
        System.out.println("\n\t\t\t =====RESULTADOS=====\n");

        for (int i = 0; i < numeros.length; i++) {
            double diferencia = numeros[i] - promedio;

            System.out.printf("Número %d: %d ==> Promedio: %.2f "
                    + "==> Diferencia con el promedio: %.2f\n",
                    (i + 1),
                    numeros[i],
                    promedio,
                    diferencia);
        }
    }
}
