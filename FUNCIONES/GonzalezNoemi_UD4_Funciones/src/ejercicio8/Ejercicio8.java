/*
 * Objetivo: programa pide valor N entero y lo muestre: el sumatorio des 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N.
 * Autor: Noemi
 * Fecha: 17/11/2026
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int n = teclado.nextInt();
		

		System.out.println("El sumatorio de 1 a " + n + " es: " + suma1aN(n));
		System.out.println("El productorio de 1 a " + n + " es: " + producto1aN(n));
		System.out.println("El valor intermedio entre 1 y " + n + " es: " + intermedio1aN(n));
				
		teclado.close();
		

	}
	//Devuelve la suma de enteros de 1 a n
	public static int suma1aN(int n) {
		int resultadoSuma;
		resultadoSuma = 0;
		for (int i =1; i<= n; i++) {
			resultadoSuma = resultadoSuma + i;
		}
		return resultadoSuma;
	}
	//Devuelve el producto de enteros de 1 a n
	public static double producto1aN(int n) {
		double resultadoProducto = 1;
		for (int i=1; i<= n ;i++) {
			resultadoProducto = resultadoProducto * i;
		}
		return resultadoProducto;
		
	}
	//Devuelve el valor intermedio entre 1 y n
	public static double intermedio1aN (int n) {
		double resultadoIntermedio = (1 + n) / 2.0;
			return resultadoIntermedio;
		
	}

}
