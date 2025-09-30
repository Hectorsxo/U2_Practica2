package com.ieschabas;
/**
 * Programa que pide al usuario el radio y la altura de un cilindro y muestra su volumen.
 */

import java.util.Scanner;

public class VolumenCilindro {
    public static void main(String[] args) {
        /**
         * Creación del objeto Scanner.
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Pedir el radio y la altura al usuario.
         */
        System.out.print("Introduce el radio: ");
        double radio = sc.nextDouble();

        System.out.print("Introduce la altura: ");
        double altura = sc.nextDouble();

        /**
         * Calcular el volumen del cilindro: V = π * r^2 * h
         */

        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        /**
         * Mostrar el resultado por consola.
         */
        System.out.println("Volumen: " + volumen);

        sc.close();
    }
}
