/*
 * Objetivo: pida dos números enteros por teclado, y muestre cual es el mínimo
 * Autor: Noemi
 * Fecha: 15/11/2026
 */
package ejercicio3;

import java.util.Scanner;
	
	
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		int a=teclado.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int b=teclado.nextInt();
		
		System.out.println("El número menor es: "+ minimo(a, b));

	}
	//Devuelve el menor entre a y b.
	public static int minimo(int a, int b) {
		int resultado;
		if (a < b) {
			resultado = a;
		} else {
			resultado = b;
			
		}
		return resultado;
	}

}
