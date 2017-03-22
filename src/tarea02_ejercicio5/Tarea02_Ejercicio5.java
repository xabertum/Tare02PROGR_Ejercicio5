/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02_ejercicio5;

import java.util.Scanner;

/**
 * Tarea02_Ejercicio 5 
 * @author mohat
 */
public class Tarea02_Ejercicio5 {

   /**
    * sonMultiplos () determina si los dos argumentos son multiplos entre si o no. 
    * @param a
    * @param b
    * @return 
    */
    public static boolean sonMultiplos(int a, int b) {

        boolean prueba = false;

        if (a % b == 0) {

            prueba = true;
        }
        return prueba;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduce el numero 1: ");
        num1 = scanner.nextInt();

        System.out.println("Introduce el numero 2: ");
        num2 = scanner.nextInt();

        if (sonMultiplos(num1, num2)) {

            System.out.println(num1 + " y " + num2 + " son multiplos entre si.");

        } else {

            System.out.println(num1 + " y " + num2 + " NO son multiplos entre si.");

        }

    }

}
