/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author PabloCosta14
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        // forma 1
        double[][] arreglo1 = new double[3][4];
        System.out.printf("Uso de la opción length: %d\n", arreglo1.length);

        System.out.printf("Uso valor de la posicion [0][2]: %s\n", arreglo1[0][2]);
        arreglo1[0][2] = 500.2;

        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                System.out.printf("fila[%d] columna[%d] = %s\n",
                        fila, col, arreglo1[fila][col]);
            }
        }

    }

}
