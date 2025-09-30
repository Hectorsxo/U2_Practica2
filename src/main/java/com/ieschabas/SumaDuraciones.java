package com.ieschabas;
/**
 * Programa que lee los minutos y segundos de dos canciones y muestra la suma en formato mm:ss.
 * @author Héctor Crespo
 * @version 1.0
 */

import java.util.Scanner;

public class SumaDuraciones {
    public static void main(String[] args) {

        /**
         * Creación del objeto Scanner
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Pedir los minutos y segundos de la primera canción.
         */
        System.out.print("Introduce los minutos de la primera canción: ");
        int min1 = sc.nextInt();
        System.out.print("Introduce los segundos de la primera canción: ");
        int seg1 = sc.nextInt();

        /**
         * Pedir los minutos y segundos de la segunda canción.
         */
        System.out.print("Introduce los minutos de la segunda canción: ");
        int min2 = sc.nextInt();
        System.out.print("Introduce los segundos de la segunda canción: ");
        int seg2 = sc.nextInt();

        /**
         * Sumar los segundos de ambas canciones.
         */
        int totalSegundos = seg1 + seg2;
        /**
         * Convertir los segundos extra en minutos y sumarlos a los minutos totales.
         */
        int totalMinutos = min1 + min2 + totalSegundos / 60;

        /**
         * Obtener los segundos restantes que no forman un minuto completo.
         */
        int segundosRestantes = totalSegundos % 60;

        /**
         * Mostrar resultado en formato mm:ss.
         */
        System.out.printf("Duración total: %d:%02d%n", totalMinutos, segundosRestantes);

        sc.close();
    }
}
