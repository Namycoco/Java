/*
 * Objetivo: pida cinco precios y muestre por pantalla el precio de venta de cada
uno tras aplicarle un 21% de IVA
 * Autor: Noemi
 * Fecha: 15/11/2026
 */
package ejercicio6;

import java.util.Scanner;

public class Ejecicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
	
		double[] precios = new double[5];
		
		for (int i=0; i<5;i++) {
			System.out.printf("Introduce el precio del producto "+ (i + 1) + ":");
			precios[i]=teclado.nextDouble();
		}
		
		for (int i =0; i< 5 ;i++) {
			System.out.printf("Precio con IVA del 21%% del producto %d: %.2f €%n" , (i+1), precioConIVA(precios[i]));
		}

	}
	//Devuelve el precio tras sumarle un 21% de IVA
	public static double precioConIVA(double precio) {
		final double IVA=0.21;
		double precioConIva;
		precioConIva = precio*(1 + IVA);
		
		return precioConIva;
	}

}
