package com.ieschabas;

/**
 *Clase quepide al usuario introducir un texto que se repite tres veces en consola separado por guiones.
 * @author Héctor Crespo
 * @version 1.0
 */

import java.util.Scanner;

public class EcoGuiones {
    public static void main(String[] args){

        /**
         * Crear objeto Scanner.
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Pedir palabra al usuario.
         */
        System.out.println("Escribe el texto: ");
        String texto = sc.nextLine();

        /**
         * Mostrar el texto 3 veces separado por guiones.
         */
        System.out.println(texto + "-" + texto + "-" + texto);

        sc.close();

}



}
