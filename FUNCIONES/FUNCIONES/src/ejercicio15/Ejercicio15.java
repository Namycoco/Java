/*
 * Objetivo:Escribe un programa que cree un array de tamaño 50 con los números naturales comprendidos
entre 50 y 99. Luego muestra la suma total y la media. Implementa una función que calcule la
suma de un array y otra que calcule la media de un array.
 * Autor: Noemi
 * Fecha 19/11/2026
 */
package ejercicio15;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAMANO=50;
		
		int [] array;
		
		array = new int [TAMANO];
		
		for (int i=0; i< TAMANO;i++) {
			array[i]=i+50;
			
		}
		System.out.println("La suma es: " + SUMA(array));
        System.out.println("La media es: " + MEDIA(array));
	

	}
	// Calcula la suma de un array
	public static int SUMA(int[] array) {
	int total=0;
	
	for (int i=0;i<array.length;i++) {
		total=total+array[i];
	}
	return total;
	}

	//calcula la media de un array
	public static double MEDIA(int[] array) {
	double resultado = SUMA(array)/ (double) array.length;
	return resultado;

		}
		
	}

	

