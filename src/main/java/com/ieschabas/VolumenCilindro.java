package com.ieschabas;
/**
 * Programa que pide al usuario el radio y la altura de un cilindro y muestra su volumen.
 * @author Héctor Crespo
 * @verion 1.0
 */

import java.util.Scanner;

/**
 * Declaración de la clase pública VolumenCilindro.
 */
public class VolumenCilindro {

    /**
     * Constructor por defecto de la clase VolumenCilindro.
     */
    public VolumenCilindro() {
    }

    /**
     * Método principal donde inicia la ejecución del programa.
     * @param args argumentos de la línea de comandos.
     */
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
