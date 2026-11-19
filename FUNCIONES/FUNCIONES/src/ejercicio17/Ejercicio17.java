/*
 * Objetivo:Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
pasándole un número entero devuelva si es primo o no.
 * Autor: Noemi
 * Fecha: 19/11/2026
 */
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int numero;
		
		
		do {
			System.out.println("Introduce número (salir:0): ");
		    numero = teclado.nextInt();
		    
		    if (numero !=0) {
		    	if (NumeroPrimo(numero)) {
		    		System.out.println("Es primo");
		    	} else {
		    		System.out.println("No es primo");
		    	}
		    }
			
			
		} while (numero !=0);

	}
	//Deuvele si el número es primo o no.
	public static boolean NumeroPrimo(int numero) {
		boolean EsPrimo = true;
		if (numero < 2) {
			EsPrimo = false;
		}
		
		for (int i = 2; i < numero; i++) {
		    if (numero % i == 0) {
		        EsPrimo = false;
		    }
		}
		return EsPrimo;
		
	}

}
