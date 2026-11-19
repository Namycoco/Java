/*
 * Objetivo: pide el ancho y el alto de un rectángulo y muestre su area y su perimetro.
 * Autor: Noemi
 * Fecha: 16/11/2026
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el ancho: ");
		double ancho = teclado.nextDouble();
		
		System.out.println("Introduce el alto: ");
		double alto = teclado.nextDouble();
		
		System.out.printf("El perímetro de un rectángulo es: %.2f%n" , perimetroRectangulo(ancho, alto));
		System.out.printf("El área del rectángulo es: %.2f", areaRectangulo(ancho, alto));

	}
	//Devuelve el perímetro:
	public static double perimetroRectangulo(double ancho, double alto){
		double perimetro;
		perimetro=2*(ancho+alto);
		return perimetro;
		
	}
	//Devuelve el área
		public static double areaRectangulo(double ancho, double alto) {
			double area;
			area=ancho*alto;
			return area;

	}
}
