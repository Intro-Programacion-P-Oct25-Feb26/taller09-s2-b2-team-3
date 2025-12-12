/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] arreglo1 = {"Café tradicional", "Café francés", "Café alemán"};

        double[] arreglo2 = {1.5, 2.1, 2.3};

        String mensaje = "";
        boolean bandera = true;
        double suma = 0;

        while (bandera) {
            System.out.println("Ingrese el café que desea comprar "
                    + "\n1 = Café tradicional \n2 = Café francés \n3 = Café alemán");
            int i = entrada.nextInt();
            System.out.println("Ingrese el número de tazas a comprar");
            int tazas = entrada.nextInt();

            if (i == 1) {
                double precio = arreglo2[i - 1];
                double valor_total = tazas * precio;
                
                suma += valor_total;
                mensaje = String.format("%sCafé tradicional (%s t), valor a cancelar %.2f\n\t",
                        mensaje,
                        tazas,
                        valor_total);
            } else {
                if (i == 2) {
                    double precio = arreglo2[i - 1];
                    double valor_total = tazas * precio;
                    suma += valor_total;
                    mensaje = String.format("%sCafé francés (%s t), valor a cancelar %.2f\n\t",
                            mensaje,
                            tazas,
                            valor_total);

                } else {
                    if (i == 3) {
                        double precio = arreglo2[i - 1];
                        double valor_total = tazas * precio;
                        suma += valor_total;
                        mensaje = String.format("%sCafé alemán (%s t), valor a cancelar %.2f\n\t",
                                mensaje,
                                tazas,
                                valor_total);
                    }
                }
            }
            entrada.nextLine();
            System.out.println("Desea ingresar más valores? (si/no)");
            String salida = entrada.nextLine();

            if (salida.equals("no")) {
                bandera = false;
            }
        }
        System.out.printf("El usuario ha comprado\n\t%s\nTotal a pagar: %.1f\n",
                mensaje,
                suma);
    }
}
