package com.ieschabas;

/**
 * Programa que pide una temperatura en grados Celsius y muestre su equivalente en Fahrenheit y en Kelvin.
 * @author Héctor Crespo
 * @versiom 1.0
 */

import java.util.Scanner;

/**
 * Declaración de la clase pública ConversorTemperatura.
 */
public class ConversorTemperatura {
    /**
     * Constructor por defecto de la clase ConverrsorTemperatura.
     */
    public ConversorTemperatura() {
    }

    /**
     * Método principal donde inicia la ejecución del programa.
     * @param args argumentos de línea de comandos.
     */
    public static void main(String[] args) {

        /**
         * Creación del objeto Scanner.
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Se pide la temperatura en celsius.
         */
        System.out.print("Introduce la temperatura en Celsius: ");
        double celsius = sc.nextDouble();

        /**
         * Conversión de fahrenheit a kelvin.
         */
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        /**
         * Muestra el resultado en consola.
         */
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        sc.close();
    }
}
