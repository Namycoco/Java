/*
 * Objetivo: programa q pida dos números reales por teclado y muestre por pantalla el resultado de multiplocar, implemeta y utiliza función.
 * Autor: Noemi
 * Fecha: 15/11/2026
 */
package ejercicio1;


import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce primer número: ");
		double a=teclado.nextDouble();
		
		System.out.println("Introduce segundo número: ");
		double b=teclado.nextDouble();
		
		System.out.println("Resultado de la multiplicación de "+a+ " y "+b+ " es "+ multiplica(a,b));

	}
	
	//Devuelve la multiplicación de dos números.
	public static double multiplica(double a, double b) {
		double resultado;
		resultado = a * b;
		return resultado;
	}

}
