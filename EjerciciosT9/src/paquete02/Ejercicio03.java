/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;
        double media;
        int arriba = 0;
        int abajo = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        media = suma / arreglo.length;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                arriba++;
            } else {
                if (arreglo[i] < media) {
                    abajo++;
                }
            }
        }
        System.out.printf("Media aritmetica: %.2f\n", media);
        System.out.printf("Elementos que estan arriba de la media: %d\n", 
                arriba);
        System.out.printf("Elementos que estan abajo de la media: %d\n", 
                abajo);
    }

}
