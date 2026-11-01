package ejercicio1;
/*
 * Objetivo: pide dos números por teclado N y M, entre esos dos imprimir los múltiplos de 7 y 13, n puede ser mayor que m y m puede ser mayor que n.
 * Autor: Noemi
 * Fecha: 01/11/2026
 */
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		//Variables de entrada:
		int N, M;
		
		//Variables auxiliares y de salida:
		int menor=0, mayor=0;
		
		//Información del programa:
		System.out.println("***Programa que muestra los números múltiplos entre N y M.***");
		System.out.println("_______________________________________________________________");
		
		// Pedir números por teclado:
		System.out.println("Introduce valor entero de N: ");
		N=teclado.nextInt();
		
		System.out.println("Introduce valor entero de M:");
		M=teclado.nextInt();
		
		//Procesamiento:
		
		//Comprobar por condicionales cual es mayor o menor para compararlos.
		
		if (N < M) {
			menor =  N; //Guardar el número menor.
			mayor = M; //Guardar el número mayor.
		} else {
			menor = M;
			mayor = N;
		}
		
		//Recorrer todos los números comprendidos entre menor y mayor:
		 boolean encontrado = false;

		for (int i = menor; i<=mayor; i++) {
			if (i % 7 == 0 && i % 13 == 0) {  //Comprobar si el multiplo de 7 Y de 13 es 0 al mismo tiempo, tenemos que utilizar &&
				System.out.println(i);
				encontrado=true;
			}
		}
		// Avisar si no se ha encontrado ningún múltiplo
        if (!encontrado) {
            System.out.println("No hay múltiplos de 7 y 13 en ese intervalo.");
        }

        teclado.close();
	}

}
