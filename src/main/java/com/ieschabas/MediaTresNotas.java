package com.ieschabas;
/**
 * Programa que lee tres notas decimales introducidas por el usuario y muestre la media con dos decimales.
 * @author Héctor Crespo
 * @version 1.0
 */

import java.util.Scanner;

/**
 * Declaración de la clase pública MediaTresNotas.
 */
public class MediaTresNotas {

    /**
     * Constructor por defecto de la clase MediaTresNotas
     */
    public MediaTresNotas() {
    }

    /**
     * Método principal donde inicia la ejecución del programa.
     * @param args argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        /**
         * Creación del objeto Scanner
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Pedir las notas al usuario
         */
        System.out.print("Introduce la primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Introduce la tercera nota: ");
        double nota3 = sc.nextDouble();

        /**
         * Calculo de la nota media
         */
        double media = (nota1 + nota2 + nota3) / 3;

        /**
         * Mostrar el resultado
         */
        System.out.println("Media: " + media);



        sc.close();
    }
}

