package MATRICES;

public class Matrices_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//vamos a mejorar la version anterior 
		
		//declarar un vector String para nombres que coincida el indice y otro vector string nombresasignaturas q coincida los indices del vector matriz q tine filas y columnas de alumno , notas


		final int NUM_ALUMNOS = 10;	//constante q me da el tamaño de la matriz
		final int NUM_MATERIAS = 6;
		
		
		//Esto es una manera de hacerlo:
		
		//declaramos los vectores string:
		
		//String[] nombreAlumnos = new String[NUM_ALUMNOS];  //indicamos q es un vector de cadena de caracteres.
		
								//No hay que inicializar cadena de caracteres pero si el vector:
		
		
		//nombreAlumnos[0]="Pepe";
		
		//ESTO ES OTRA MANERA DE HACERLO el declarar los vectores String de ALUMNOS, NO HAY QUE INSTANCIAR:
		
		String[] nombreAlumno = {"Pepe", "pedro", "Pablo", "Rubí", "Rubén", "Sara", "Magda", "María ","Jesús", "Jose"}; //asi no necesito el operador NEW
		
		//declarar el vector de las MATERIAS, no hay que instanciar, lo hace automatico:
		
		String [] nombreMateria = {"Matematicas","Programacion","Lengua","Sistemas Informaticos","Base de datos","Sociales"};
		
		//declaramos e instanciamos:
		
		int notas[][] = new int[NUM_ALUMNOS][NUM_MATERIAS];
		
		//Asignamos notas aleatorias:
		
		//para acceder a la nota de la nota de un alumno en la posicion 0.
		
		for (int alumno = 0; alumno < notas.length ; alumno++) {
			for (int materia=0; materia< notas[alumno].length;materia++) {
				//designamos la tabla por donde va a pasar
				notas[alumno][materia] = (int)(Math.random()*10); //lo convertimos en int, usamos random para que de datos y no haya q meterlos por pantalla, y por 10.
				//Se multiplica por 10 porque Math.random() genera números decimales entre 0 (incluido) y 1 (sin incluirlo).
			
		}
		
		
	}
		// Mostramos los nombres de las materias
		System.out.printf("%-15s", "");

		for (int materia = 0; materia < nombreMateria.length; materia++) {
		    System.out.printf("%-20s", nombreMateria[materia]);
		}
		System.out.println();


		// Mostramos las notas de cada alumno
		for (int alumno = 0; alumno < NUM_ALUMNOS; alumno++) {

		    System.out.printf("%-15s", nombreAlumno[alumno]);

		    for (int materia = 0; materia < NUM_MATERIAS; materia++) {
		        System.out.printf("%-20d", notas[alumno][materia]);
		    }

		    System.out.println();
		}
		
		//calcular la media de cada materia:
		
				int suma2 = 0; //acumulador
				double mediaMateria;
				
				System.out.println("\nMEDIA DE CADA MATERIA");
				System.out.println("----------------------------------------");
				
				System.out.printf("%-25s %10s%n", "MATERIA", "MEDIA");

				System.out.println("----------------------------------------");
				
				for (int materia = 0; materia < NUM_MATERIAS ; materia++) {
					suma2=0;
					for (int alumno=0; alumno< NUM_ALUMNOS; alumno++) {
						suma2 = suma2 + notas[alumno][materia]; //con esto lo acumulamos
					}
					
					//media de cada materia:
					mediaMateria = (double) suma2 /NUM_ALUMNOS;
					// Mostramos el nombre de la materia y su media:
				    System.out.printf("%-25s %10.2f%n", nombreMateria[materia], mediaMateria);
				}

				System.out.println("----------------------------------------");
		
	}
}