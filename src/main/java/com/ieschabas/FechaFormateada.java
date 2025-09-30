package com.ieschabas;
/**
 * Programa que pide al usuario el día, mes y año y muestra la fecha en formato YYYY-MM-DD.
 * @author Héctor Crespo
 * @version 1.0
 */

import java.util.Scanner;

public class FechaFormateada {
    public static void main(String[] args) {

        /**
         * Creación del objeto Scanner.
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Pedir datos de la fecha al usuario.
         */
        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        int año = sc.nextInt();

        /**
         * Mostrar fecha en formato YYYY-MM-DD con ceros a la izquierda
         * %04d imprime el año con 4 dígitos
         * %02d → imprime el mes y el día con 2 dígitos
         */
        System.out.printf("Fecha: %04d-%02d-%02d%n", año, mes, dia);

        sc.close();
    }
}
