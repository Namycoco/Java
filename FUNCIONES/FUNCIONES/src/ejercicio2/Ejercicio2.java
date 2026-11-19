/*
 * Objetivo: pedir la edad por teclado, mostrar por pantalla si eres mayor de edad o no
 * Autor: Noemi
 * Fecha: 15/11/2026
 */


package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce edad: ");
		int edad = teclado.nextInt();
		
		System.out.printf("Su edad es: "+edad+" Por tanto, mayor de edad es: "+esMayorEdad(edad));

	}
	//Devuelve verdaderp so a>=18, falso caso contrario.
	public static boolean esMayorEdad(int edad) {
		boolean esMayorEdad;
		if (edad >=18) {
			esMayorEdad=true;
		} else {
			
			esMayorEdad=false;
		}
		return esMayorEdad;
	}

}
