/*
 * Objetivo: pide un valor entero en millas, y muestra su equivalente en kilometros
 * Autor: Noemi
 * Fecha: 15/11/2026
 */
package ejercicio5;

import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un valor en millas: ");
		int millas = teclado.nextInt();
		
		System.out.println("***Pasar de millas a kilometros***");
		System.out.printf("Su número en millas es: %d, al pasar a kilometros se convierte en: %.5f km.", millas,  millas_a_kilometros(millas));

	}
	//Devuelve conversión de millas a kilómetros
	public static double millas_a_kilometros(int millas) {
		double kilometros;
		kilometros=millas*1.60934;
		return kilometros;
		
	}

}
