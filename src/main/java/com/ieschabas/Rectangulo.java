package com.ieschabas;
/**
 * Programa que pide al usuario la base y la altura de un rectángulo y muestra su área y perímetro.
 * @author Héctor Crespo
 * @verion 1.0
 */

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {

        /**
         * Creación del objeto Scanner.
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Pedir la base y la altura al usuario.
         */
        System.out.print("Introduce la base: ");
        double base = sc.nextDouble();

        System.out.print("Introduce la altura: ");
        double altura = sc.nextDouble();

        /**
         * Calcular el área y el perímetro.
         */
        double area = base * altura;
        double perimetro = 2 * (base + altura);

        /**
         * Mostrar resultados por consola.
         */
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

        sc.close();
    }
}
