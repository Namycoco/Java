/*
 * Objetivo: Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
crear una función a la que le pasemos ambos valores y nos devuelva el descuento (en %).
 * Autor: Noemi
 * Fecha: 18/11/2026
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el precio del producto sin descuento: ");
		double cantidadSinDescuento = teclado.nextDouble();
		
		System.out.println("Introduce el precio del producto con descuento aplicado: ");
		double cantidadConDescuento = teclado.nextDouble();
		
		System.out.println("El porcentaje aplicado en el descuento es : " + porcentajeDescuento(cantidadSinDescuento, cantidadConDescuento)+ " %");

	}
	//Devuelve el cálculo del porcentaje de descuento que se ha hecho al producto.
	public static double porcentajeDescuento(double cantidadSinDescuento, double cantidadConDescuento ) {
		double descuento;
	    descuento = ((cantidadSinDescuento - cantidadConDescuento)/ cantidadSinDescuento)*100;
		return descuento;
		
	}
}
