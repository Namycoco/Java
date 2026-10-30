
package Ejercicios;

/*
 * objetivo: analizador de contraseñas
 * autor: Noemi
 * fecha: 29/10/2026
 */

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Variables de entrada
        String nombre, contrasena;

        // Variables auxiliares y de salida
        int contadorMayus = 0;
        int contadorMinu = 0;
        int contadorNum = 0;

        boolean tieneSimbolo;
        
        boolean tienePunto;

        // Pedir datos
        System.out.println("Introduce nombre de usuario:");
        nombre = teclado.nextLine();

        System.out.println("Introduce contraseña:");
        contrasena = teclado.nextLine();

        // Comprobar mayúsculas, minúsculas y números
        for (int i = 0; i < contrasena.length(); i++) {

            char letra = contrasena.charAt(i);

            if (Character.isUpperCase(letra)) {
                contadorMayus++;
            } else if (Character.isLowerCase(letra)) {
                contadorMinu++;
            } else if (Character.isDigit(letra)) {
                contadorNum++;
            }
        }

        // Comprobar si contiene el símbolo @
        tieneSimbolo = nombre.contains("@");
        tienePunto = nombre.contains(".");

     

        if (tieneSimbolo) {
            System.out.println("Contiene @: Sí");
        } else {
            System.out.println("Contiene @: No");
        }
        
        
        if (tienePunto) {
            System.out.println("Contiene '.': Sí");
        } else {
            System.out.println("Contiene '.': No");
        }


        // Comprobar si la contraseña es válida
        if (contrasena.length() >= 8
                && contadorMayus >= 1
                && contadorMinu >= 1
                && contadorNum >= 1) {

            System.out.println("Contraseña válida: Sí");

        } else {
            System.out.println("Contraseña válida: No");
        }
        
        
     // Mostrar resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Usuario: " + nombre);
        System.out.println("Contraseña en mayúsculas: "
                + contrasena.toUpperCase());
        System.out.println("Número de caracteres: "
                + contrasena.length());
        System.out.println("Mayúsculas: " + contadorMayus);
        System.out.println("Minúsculas: " + contadorMinu);
        System.out.println("Números: " + contadorNum);

        teclado.close();
    }
}
