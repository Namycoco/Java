/*
 * Objetivo: introducir 3 valores enteros, y diga cual es el más pequño. crea una función a la que pasamos dos valores, y devuelva el mínimo de los dos.
 * Autor: Noemi
 * Fecha: 18/11/2026
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		

		
		System.out.println("Introduce tres números: ");
		int num1 = teclado.nextInt();
		
		int num2 = teclado.nextInt();
		
		int num3 = teclado.nextInt();
		
		System.out.println("El minimo es: "+NumeroMinimo(num1 , NumeroMinimo(num2, num3)));

		
	}
	//Devuelve el mínimo de dos valores.
	public static int NumeroMinimo(int num1, int num2) {
		int minimo;
		if (num1 > num2 ) {
			minimo= num2;
		} else {
			minimo=num1;
		}
		return minimo;
	}

}
