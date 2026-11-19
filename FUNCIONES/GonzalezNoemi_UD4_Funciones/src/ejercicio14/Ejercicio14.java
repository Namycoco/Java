/*
 * Objetivo: Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir
dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.
 * Autor: Noemi
 * Fecha: 19/11/2026
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce caracter: ");
		char caracter = teclado.next().charAt(0);
		
		System.out.println("Introduce lineas: ");
		int lineas = teclado.nextInt();
		
		System.out.println(triangulo(caracter, lineas));

	}
	//Devuelve una impresión por pantalla de un carácter haciendo un triángulo.
	public static String triangulo(char caracter, int lineas) {

	    String resultado = "";

	    for (int i = 1; i <= lineas; i++) {

	        for (int j = 1; j <= i; j++) {
	            resultado = resultado + caracter;
	        }

	        resultado = resultado + "\n";
	    }

	    return resultado;
	}
}
