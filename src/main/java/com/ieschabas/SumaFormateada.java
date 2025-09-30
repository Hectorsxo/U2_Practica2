package com.ieschabas;

import java.util.Scanner;
/**
 * Programa que pide dos números enteros al usuario y muestre la suma en formato a + b = resultado.
 * @author Héctor Crespo
 * @version 1.0
 */
import java.util.Scanner;

public class SumaFormateada {
    public static void main(String[] args) {

        /**
         * Crear el objeto Scanner
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Pedir los números al usuario
         */

        System.out.print("Introduce el primer número: ");
        double a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        double b = sc.nextInt();

        /**
         * Calculo de la suma
         */
        double resultado = a + b;

        /**
         * Mostrar el resultado en formato a + b = resultado
         */
        System.out.println(a + " + " + b + " = " + resultado);

        sc.close();

    }
}
