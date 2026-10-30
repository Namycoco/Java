package Ejercicios;

/*
 * Objetivo: programa sobre una tienda que calcula el precio de una compra.
 * autor: Noemi
 * fecha: 29/10/2026
 */
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		//variables de entrada:
		
		String nombre;
		
		double precioProducto;
		
		int cantidadUnidad;
		
		// variables auxiliares y de salida:
		
		double descuento = 0;
		
		double total;
		
		double precioFinal = 0;
		
		System.out.println("***Tienda***");
		System.out.println("____________");
		
		//introducir datos:
		
		System.out.println("Introduce su nombre: ");
		nombre=teclado.nextLine();
		
		System.out.println("Introduce el precio de un producto: ");
		precioProducto=teclado.nextDouble();
		
		System.out.println("Introduce unidades del producto: ");
		cantidadUnidad=teclado.nextInt();
		
		// OPERACIONES:
		
		total= precioProducto * cantidadUnidad;
		
		if (total >= 100) {
			descuento=total*0.15;
			precioFinal=total-descuento;
		} else if ( total >= 50 && total < 100) {
			descuento=total*0.10;
			precioFinal=total-descuento;
		} else if (total < 50) {
			precioFinal=total;
		}
		
		System.out.printf(
			    "Nombre del cliente: %s%n" +
			    "Precio del producto: %.2f €%n" +
			    "Cantidad: %d%n" +
			    "____________________________%n" +
			    "Cliente: %s%n" +
			    "Total sin descuento: %.2f €%n" +
			    "Descuento: %.2f €%n" +
			    "Precio final: %.2f €%n",
			    nombre,
			    precioProducto,
			    cantidadUnidad,
			    nombre,
			    total,
			    descuento,
			    precioFinal
			);
		
		teclado.close();
	}

}
