/*
 * Objetivo: Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con
valores aleatorios
 * Autor: Noemi
 * Fecha: 19/11/2026
 */
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el tamaño del array: ");
		int tamano = teclado.nextInt();
		
		int [] array;
		
		array = new int [tamano];
		
		array = ValoresAleatorios(array);
		
		for (int i = 0; i < array.length; i++) {
		    System.out.println(array[i]);
		}
		

	}
	//Rellena un array con valores aleatorios.
	public static int[] ValoresAleatorios(int[] array) {
		for (int i=0; i<array.length;i++) {
			array[i] = (int)(Math.random()*100);
		}
		return array;
	}

}
