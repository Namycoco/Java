/*
 * Objetivo:Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
Para ello implementa una función que reciba como parámetro un número entero y muestre por
pantalla la tabla de multiplicar de dicho número.
 * Autor: Noemi
 * Fecha: 18/11/2026
 */
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un número para visualizar su tabla de multiplicar: ");
		int numero = teclado.nextInt();
		
		System.out.println("La tabla del número: " + numero);
		
		// Llamamos a la función para que imprima todas las líneas
		tabla(numero);
		
		teclado.close();

	}
	//Devuelve la tabla de multiplicar tras recibir un número:
	public static int tabla(int numero) {
		int resultado = 1;
		for (int i=0; i<=10; i++) {
			resultado = numero*i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
		return resultado;
	}


}
