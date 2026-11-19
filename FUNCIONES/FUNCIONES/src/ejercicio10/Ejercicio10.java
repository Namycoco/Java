/*
 * Objetivo: Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
si la fecha es correcta o no. Se debe crear una función donde le pasemos los datos y devuelva si
es correcta o no.
 * Autor: Noemi
 * Fecha: 18/11/2026
 */
package ejercicio10;

import java.util.Scanner;
	
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce dia: ");
		int dia = teclado.nextInt();
		
		System.out.println("Introduce mes: ");
		int mes = teclado.nextInt();
		
		System.out.println("Introduce año: ");
		int year = teclado.nextInt();
		
	
		if (EsFechaCorrecta(dia, mes, year)) {
			System.out.println("La fecha " + dia + "/" + mes + "/" + year + " es CORRECTA.");
		} else {
			System.out.println("La fecha " + dia + "/" + mes + "/" + year + " es INCORRECTA.");
		}

		teclado.close();

	}
	//Devuelve el resultado de si la fecha introducida es correcta o no.
	public static boolean EsFechaCorrecta(int dia, int mes, int year) {
		// Comprobamos que el año y el mes tengan sentido
			boolean correcto = true;
				if (year <= 0 || mes < 1 || mes > 12 || dia < 1) {
					correcto = false;
				}

				// Calculamos cuál es el máximo de días permitido para ese mes
				int diasMaximos = 31;

				if (mes == 2) {
					if (year % 4 == 0) {
						diasMaximos = 29;
					} else {
						diasMaximos = 28; // Febrero
					}
	
				} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					diasMaximos = 30; // Abril, junio, septiembre y noviembre
				}

				// Si el día supera el máximo de su mes, es incorrecta
				if (dia > diasMaximos) {
					correcto = false;
				}

				// Si ha pasado todos los filtros, la fecha es válida
				return correcto;
			}

}
