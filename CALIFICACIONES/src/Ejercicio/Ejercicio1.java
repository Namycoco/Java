package Ejercicio;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM_ALUMNO = 8;
		final int NUM_MATERIA = 4;
		
		String [] nombreAlumno = {"José", "Miguel", "Juan", "Pedro", "María", "Irene", "Carmen", "Gracia"};
		String [] nombreMateria = {"Lengua", "Inglés", "Física", "Música"};
		
		int notas [][] = new int [NUM_ALUMNO][NUM_MATERIA];
		
		for (int alumno=0; alumno<notas.length;++alumno) {
			for (int materia=0; materia<notas[alumno].length;++materia) {
				notas[alumno][materia] = (int)(Math.random()*10+1);
			}
		}
		
		
		
		//MOSTRAR DATOS:
		
		// Mostrar las notas como una tabla

		System.out.printf("%-12s", "Alumno");

		for (int materia = 0; materia < nombreMateria.length; materia++) {
		    System.out.printf("%-12s", nombreMateria[materia]);
		}

		System.out.println();

		for (int alumno = 0; alumno < notas.length; alumno++) {

		    System.out.printf("%-12s", nombreAlumno[alumno]);

		    for (int materia = 0; materia < notas[alumno].length; materia++) {
		        System.out.printf("%-12d", notas[alumno][materia]);
		    }

		    System.out.println();
		}
		
		
		
		System.out.println("____________________________________________________________\n");
		
		
		
		
		
		// Mostrar la media de cada alumno
		System.out.printf("%-15s %-15s%n", "ALUMNO", "NOTA MEDIA");
		for (int i=0; i<notas.length;i++) {
			 System.out.printf("%-15s %-15.2f%n",
				        nombreAlumno[i], NotaMediaAlumno(notas, i));
		}
		

		System.out.println("____________________________________________________________\n");
		
		//Mostrar media de las materias
		System.out.printf("%-15s %-15s%n", "MATERIA", "NOTA MEDIA");
		for (int i=0;i<notas[0].length;i++) {
			System.out.printf("%-15s %-15.2f%n", nombreMateria[i], NotaMediaMateria(notas, i));
		}
		
		System.out.println("____________________________________________________________\n");
		
		
		//Mostrar alumno con peor nota
		
		System.out.println("ALUMNO CON MENOR MEDIA\n");
		System.out.println(AlumnoCalificacionMasBaja(notas, nombreAlumno));
		
		
		System.out.println("____________________________________________________________\n");
		
		
		
		//Mostrar primera materia con media inferior a 4
		System.out.println("PRIMERA MATERIA CON MEDIA INFERIOR A 4\n");
	
		String resultado = MateriaCalificacionInferior(notas, nombreMateria);
		
		if (resultado.equals("")) {
			System.out.println("No hay materia con media inferior a 4");
		} else {
			System.out.println(resultado);
		}
		
		
		
	}
	//Devuelve la nota media de cada alumno
	public static double NotaMediaAlumno(int notas[][], int alumno) {
		int suma = 0;
		
		for (int i=0; i<notas[alumno].length;i++) {
				suma = suma + notas[alumno][i];
		}
		
		return (double) suma / notas[alumno].length;
	}
	//Devuelve la nota media de cada materia
	public static double NotaMediaMateria(int notas[][], int materia) {
		
		int suma = 0;
		
		for (int i=0; i<notas.length;i++) {
			suma = suma + notas[i][materia];
		}
		return (double) suma / notas.length;
		
	}
	//Devuelve el nombre del alumno con la calificación media más baja
	public static String AlumnoCalificacionMasBaja(int notas[][], String[] nombreAlumno) {
		
		double menorNota = NotaMediaAlumno(notas,0);
		int posicion = 0;
		
		for (int i=1; i<notas.length;i++) {
			if (NotaMediaAlumno(notas, i) < menorNota) {
				menorNota = NotaMediaAlumno(notas, i);
				posicion = i;
			}
			
		}
		return nombreAlumno[posicion];
		
	}
	//Devuelve el nombre de la primera materia con una calificación media inferior a 4
	public static String MateriaCalificacionInferior(int notas[][], String[] nombreMateria) {
		
		boolean encontrada= false;
		String materiaInferior = "";
		
		for (int materia = 0; materia< notas[0].length;materia++) {
			if (NotaMediaMateria(notas, materia) < 4 && encontrada == false) {
				materiaInferior = nombreMateria[materia];
				encontrada=true;
				
			}
		}
		return materiaInferior;
		
		
	}
	

}
