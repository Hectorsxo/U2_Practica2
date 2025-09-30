package com.ieschabas;

/**
 * Programa que pida una temperatura en grados Celsius y muestre su equivalente en Fahrenheit y en Kelvin.
 */

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la temperatura en Celsius
        System.out.print("Introduce la temperatura en Celsius: ");
        double celsius = sc.nextDouble();

        // Conversión a Fahrenheit y Kelvin
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Mostrar resultados
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        sc.close();
    }
}
