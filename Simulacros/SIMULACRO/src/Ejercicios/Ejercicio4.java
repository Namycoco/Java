package Ejercicios;
/*
 * Objetivo: programa que gestione matriculas de un gimnasio.
 * autor: Noemi
 * fecha: 29/10/2026
 */

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		final double FITNESS=10;
		final double YOGA=15;
		final double MUSCULACION=20;
		
		
		//variables de entrada: 
		int opcion;
		
		//variables auxiliares:
		double descuento;
		
		double PrecioConDescuento;
		
		double iva1;
		double iva2;
		double iva3;
		
		int cantidadMatriculaFitnes;
		int cantidadMatriculaYoga=0;
		int cantidadMatriculaMusc=0;
		
		double matricula;
		
		System.out.println("Gestión de un GIMNASIO");
		System.out.println("_________________________________________________________");
		System.out.println("TIPOS DE MATRICULAS: 1.Fitness- 2.Yoga- 3.Musculación\n");
		System.out.println("Precio de la matrícula tipo 1 (FITNESS): 10.0€\n"
							+ "Precio de la matrícula tipo 2 (YOGA): 15.0€\n"
							+ "Precio de la matrícula tipo 3 (MUSCULACIÓN): 20.0€");
		
		
		
		//Operaciones:
		
		do {
		System.out.println("\n-----MENÚ DE OPERACIONES-----\n"
							+"1.Calcular PVP de cada matricula.\n"
							+"2.Aplicar oferta a un tipo de matricula (sin iva).\n"
							+"3.Calcular el importe total de matriculas realizadas (sin iva).\n"
							+"4.Salir\n"
							+"Seleccione una opción:");
		opcion=teclado.nextInt();
		
		
		switch (opcion) {
		 
		 case 1: 
			
			//pedir que tipo de iva para cada matricula:
			System.out.println("Ingrese el IVA para el tipo de matrícula 1 (4 - 10 - 21): ");
			iva1=teclado.nextDouble();
			
			System.out.println("Ingrese el IVA para el tipo de matrícula 2 (4 - 10 - 21): ");
			iva2=teclado.nextDouble();
			
			System.out.println("Ingrese el IVA para el tipo de matrícula 3 (4 - 10 - 21): ");
			iva3=teclado.nextDouble();
			
			//calculos:
	
			
			System.out.println("El PVP de la actividad Fitness es: "+ (FITNESS + (FITNESS*(iva1 /100))));
			System.out.println("El PVP de la actividad Yoga es: "+ (YOGA +(YOGA*(iva2/(100)))));
			System.out.println("El PVP de la actividad Musculación es: "+ (MUSCULACION+(MUSCULACION*(iva3/100))));
			
		 
		
		
		break;
			
		 case 2: 
			 
			 //Aplicar oferta a un tipo de matricula (sin iva):
			 System.out.println("Seleccione tipo de matrícula (1. Fitnees, 2. Yoga, 3. Musculacion");
			 matricula=teclado.nextInt();
			 
			 System.out.println("Ingrese el % de descuento a aplicar: ");
			 descuento=teclado.nextInt();
			 
			 if (matricula == 1) {
				 System.out.println("Precio con descuento sin IVA para la matrícula 1 es: "+(PrecioConDescuento=FITNESS-(FITNESS*descuento/100)));
			 } else if (matricula == 2) {
				 System.out.println("Precio con descuento sin IVA para la matrícula 2 es: "+(PrecioConDescuento=YOGA-(YOGA*descuento/100)));
			 } else if (matricula == 3) {
				 System.out.println("Precio con descuento sin IVA para la matrícula 3 es: "+(PrecioConDescuento=MUSCULACION-(MUSCULACION*descuento/100)));
			 }
			 
			 break;
			 
			 case 3: 
				 
				 System.out.println("Ingrese las matriculas realizadas para el tipo de matrícula 1 (1. Fitnees, 2. Yoga, 3. Musculacion)");
				 cantidadMatriculaFitnes=teclado.nextInt();
				 
				 System.out.println("Ingrese las matriculas realizadas para el tipo de matrícula 2 (1. Fitnees, 2. Yoga, 3. Musculacion)");
				 cantidadMatriculaYoga=teclado.nextInt();
				 
				 System.out.println("Ingrese las matriculas realizadas para el tipo de matrícula 3 (1. Fitnees, 2. Yoga, 3. Musculacion)");
				 cantidadMatriculaMusc=teclado.nextInt();
				 
				 System.out.println("El importe total (sin iva) de las matrículas realizadas es: "+(FITNESS*cantidadMatriculaFitnes) +(YOGA*cantidadMatriculaYoga)+(MUSCULACION*cantidadMatriculaMusc));
				 
				 break;
				 
			 case 4:
				 System.out.println("Saliendo del programa...");
				 
				 break;
				
			default:
				System.out.println("Opción no válida, inténtelo de nuevo.");
			 
			 
		 }
			
		
			
		
		
		
		} while (opcion != 4);
		
		

	}

}
