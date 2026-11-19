/*
 * Objetivo: pide un número entero y muestre si es positivo, negativo o cero.
 * Autor: Noemi
 * Fecha: 15/11/2026
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int a=teclado.nextInt();
		
		System.out.println("Su número es: "+dimeSigno(a));
		
		

	}
	//Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo.
	public static int dimeSigno(int a) {
		int respuesta;
		if (a < 0) {
			respuesta = -1;
		} else if ( a == 0) {
			respuesta = 0;
		} else {
			respuesta = 1;
		}
		return respuesta;
	}

}
