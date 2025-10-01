package com.ieschabas;
/**
 * Programa que pide al usuario su nombre y primer apellido y muestra sus iniciales en mayúscula, separadas por punto.
 * @author Héctor Crespo
 * @version 1.0
 */

import java.util.Scanner;

/**
 * Declaración de la clase pública Iniciales.
 */
public class Iniciales {

    /**
     * Constructor por defecto de la clase Iniciales.
     */
    public Iniciales() {
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
         * Pedir el nombre y apellido al usuario.
         */
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tu primer apellido: ");
        String apellido = sc.nextLine();


        /**
         * Obtener la primera letra de cada uno y convertirla a mayúscula
         */
        char inicialNombre = Character.toUpperCase(nombre.charAt(0));
        char inicialApellido = Character.toUpperCase(apellido.charAt(0));

        /**
         * Mostrar por pantalla las iniciales separadas por punto.
         */

        System.out.println("Iniciales: " + inicialNombre + "." + inicialApellido + ".");

        sc.close();
    }
}

