package Ejercicios;
/*
 * objetivo: crear un programa que pida 10 numeros y hacer operaciones de calculos.
 * autor: Noemi
 * fecha: 29/10/2026
 */
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		//variables de entrada:
		
		int numero;
		
		//variables auxiliares y de salida:
		
		int positivo=0, negativo=0, cero=0;
		int par=0, impar=0, suma=0, sumaTotal = 0;
		
		double media;
		
		// Información del programa:
		System.out.println("***Programa que pide 10 números enteros y crea cálculos aritméticos***");
		System.out.println("______________________________________________________________________");
		
		
		//Operacion con bucle FOR:
		
		for (int i=1; i<=10;i++) {
		System.out.println("Introduce número: ");
		numero=teclado.nextInt();
		
		 // Clasificar por signo
		
		if (numero > 0) {
            positivo++;
            suma += numero;
        } else if (numero < 0) {
            negativo++;
        } else {
            cero++;
        }
		
		
		 // Clasificar por paridad
        if (numero % 2 == 0) {
            par++;
        } else {
            impar++;
        }
        
        sumaTotal += numero;
        
		}
		
		media = sumaTotal / 10.0;
		

        System.out.println("RESULTADOS:");
        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
        System.out.println("Ceros: " + cero);
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
        System.out.println("Suma de positivos: " + suma);
        System.out.println("Media: " + media);

        teclado.close();
		
	}
	

}