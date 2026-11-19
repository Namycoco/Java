/*
 * Objetivo: Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe
tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en
millas.
 * Autor: Noemi
 * Fecha: 18/11/2026
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce valor en kilometros: ");
		int kilometros = teclado.nextInt();
		
		System.out.println("***Conversión de kilometros a millas***\nValor introducido en kilómetros: "+kilometros+"\nResultado en millas: "+kilometros_a_millas(kilometros));
		
		
		teclado.close();

	}
	//Devuelve el número en millas tras recibirlo en kilómetros
	public static double kilometros_a_millas(int kilometros) {
		double millas;
		millas = kilometros / 1.60934;
		return millas;
	}

}
