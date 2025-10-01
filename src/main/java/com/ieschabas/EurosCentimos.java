package com.ieschabas;
/**
 * Programa que pide un precio en euros con céntimos (por ejemplo, 12.34) y muestra por separado la parte entera (euros) y los céntimos.
 * @author Héctor Crespo
 * @version 1.0
 */

import java.util.Scanner;

/**
 * Declaración de la clase pública EurosCentimos.
 */
public class EurosCentimos {

    /**
     * Constructor por defecto de la clase EurosCentimos.
     */
    public EurosCentimos() {
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
         * Pedir al usuario el precio en euros con decimales
         */
        System.out.print("Introduce un precio en euros: ");
        double precio = sc.nextDouble();

        /**
         * Obtener la parte entera (euros)
         */

        int euros = (int) precio;

        /**
         * Obtener los céntimos.
         * Multiplicamos por 100 y restamos los euros ya convertidos a céntimos.
         * Math.round para redondear los decimales.
         */
        int centimos = (int) Math.round((precio - euros) * 100);

        /**
         * Mostrar el resultado
         */
        System.out.println("Euros: " + euros);
        System.out.println("Céntimos: " + centimos);

        sc.close();
    }
}
