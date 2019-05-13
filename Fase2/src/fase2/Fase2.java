/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fase2;

import java.util.Scanner;

/**
 *
 * @author mriva
 */
public class Fase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        menu();
    }

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("_____________________________________");
            System.out.println("                MENU                 ");
            System.out.println("_____________________________________");
            System.out.println(" 1. Ejercicio Pimera Fase (factorial)");
            System.out.println(" 2. Arbol en arte ASCII");
            System.out.println(" 3. Exit ");
            System.out.println("\n");
            System.out.println(" Ingrese la opcion");
            opcion = scanner.nextInt();

            int n;

            switch (opcion) {
                case 1:
                    System.out.println("ingrese el valor del factorial ");
                    n = scanner.nextInt();
                    factorial(n);
                    break;
                case 2:
                    System.out.println("ingrese el  valor de Entrada ");
                    n = scanner.nextInt();
                    arbol(n);
                    break;
                default:

            }

        } while (opcion != 3);

    }

    public static void factorial(int n) {
        int factorial = 1;
       
               
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;

        }
        System.out.println("Resultado de facotrial " + factorial);
        
        // Tambien funciona con el ciclo while 
        
        //int i = 1;

        /*while (i <= n) {
         factorial = factorial * i;
         i = i + 1;

         }*/

    }

    public static void arbol(int n) {

        int fila = n;
        int columna;
        int limite = (n * 2) - 1;
        int espacio = n - 1;

        // Las filas llegaran hastqa el tamaño de n 
        /* Se recorren la primera fila y luego se recorre la columna 1,2,3, hasta (n*2)-1
         Si la columna es menor que (n-1) se llena con un espacio en blanco y si la fila 
         es mayor o igual que (n-1) y menor que el limite se llena con  "*".        
         */
        for (fila = 0; fila <= n; fila++) {
            for (columna = 0; columna < limite; columna++) {
                if (columna < espacio) {
                    System.out.print(" ");
                } else if (columna >= espacio && columna < (limite - espacio) && fila < n) {
                    System.out.print("*");
                } else if (fila == n && columna < (n - 1)) {
                    System.out.print(" ");
                } else if (fila == n && columna == n) {
                    System.out.print("*");
                }

            }

            espacio--;

            System.out.println("");

        }

    }
     

}
