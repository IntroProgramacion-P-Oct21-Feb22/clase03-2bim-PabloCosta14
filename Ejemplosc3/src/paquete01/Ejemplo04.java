/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        // forma 1
        int[][] arreglo1 = {
            
            {10, 20, 40},  // fila 0
            
            
            {1, 2, 3} // fila 1
        
        };
        
        int suma;
        
        for (int fila = 0; fila < arreglo1.length; fila++) { // 0<2
            suma = 0;
            for (int col = 0; col < arreglo1[fila].length; col++) { // arreglo[0].length:3
                suma = suma + arreglo1[fila][col];                 // 0<3 // 1<3
                // 0 + arreglo[0][0] //0+10//10
                //10 + arreglo1[0][01] // 10+20//30
                //30 + arreglo[0][2] // 30+50 // 70
            }
            System.out.printf("Suma de valores del arreglo: %d\n", suma);
        }
        
        // System.out.printf("Suma de valores del arreglo: %d\n", suma);
    }
    
}
/*
fila:0
col:0, 1, 2, 3
Suma:0, 30, 70
pantalla:0
suma de valores del arreglo : 70
*/
