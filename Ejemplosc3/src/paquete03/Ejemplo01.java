/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author PabloCosta14
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] nombresEstudiante = {"Jose A", "Elena J", "Paúl L"};
        double[] sumaNotas = new double[3]; // {34,31,35.5}
        double suma;
        String reporte = "";

        for (int i = 0; i < notas.length; i++) { // 0<3 
            suma = 0;
            for (int j = 0; j < notas[i].length; j++) { // 0<notas[0].length
                suma = suma + notas[i][j];              // 0<4  // 1<4  // 2<4  // 3<4 // 4<4
                // 0 + notas[0][0] // 0+ 9 //9
                // 0 + notas[0][1] // 9+10 //19
                // 0 + notas[0][2] // 19+ 7 //26
                // 0 + notas[0][3] // 26+ 8 //34
            }
            sumaNotas[i] = suma;
        }
        // Presentación de resultados
        for (int i = 0; i < nombresEstudiante.length; i++) {
            reporte = String.format("%sEstudiante %s tiene una sumatoria "
                    + "de notas: %.3f\n",
                    reporte,
                    nombresEstudiante[i],
                    sumaNotas[i]);
        }

        System.out.printf("%s\n", reporte);

    }
}
