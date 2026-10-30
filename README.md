<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=rect&color=ED8B00&height=120&section=header&text=JAVA%20DESDE%20CERO&fontSize=40&fontColor=ffffff&animation=fadeIn" width="100%">
</p>


<hr>

<p align="center">
<img src="https://img.shields.io/badge/Java-Lenguaje_de_programación-orange?style=for-the-badge&logo=openjdk&logoColor=white" />
<img src="https://img.shields.io/badge/Nivel-Principiante-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Aprendizaje-En_progreso-blue?style=for-the-badge" />
</p>

<p align="center">
<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=22&pause=1000&color=ED8B00&center=true&vCenter=true&width=600&lines=Aprendiendo+Java+desde+cero;Construyendo+programas+con+Java;Cada+linea+de+codigo+cuenta+%E2%98%95" />
</p>

 **¿Qué es Java?**

Java es un lenguaje de programación orientado a objetos, multiplataforma y de propósito general. Permite desarrollar aplicaciones de escritorio, aplicaciones web, sistemas empresariales y aplicaciones Android.

Su filosofía principal es:

Write Once, Run Anywhere 🌍
Escribe una vez, ejecuta en cualquier lugar.

En este repositorio voy a recopilar mis primeros pasos con Java, desde los conceptos más básicos hasta la creación de pequeños proyectos.

**01. Primeros pasos con Java**

El clásico programa para comenzar a programar:

java
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
    }
}


**¿Qué significa cada parte?**

public class Main: declara una clase.
main(): es el punto de entrada del programa.
System.out.println(): muestra información por consola.
;: indica el final de una instrucción.
 **02. Variables y tipos de datos**

Las variables permiten almacenar información.

java
public class Main {
    public static void main(String[] args) {

        String nombre = "Programador";
        int edad = 20;
        double altura = 1.75;
        boolean programando = true;
        char inicial = 'J';

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("¿Programa?: " + programando);
        System.out.println("Inicial: " + inicial);
    }
}

Tipo	Descripción	Ejemplo
int	Números enteros	25
double	Números decimales	3.14
float	Decimales de menor precisión	2.5f
char	Un carácter	'A'
String	Texto	"Hola"
boolean	Verdadero o falso	true
🔀 03. Condicionales

Permiten ejecutar diferentes instrucciones dependiendo de una condición.

java
int edad = 18;

if (edad >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}


También podemos utilizar else if para comprobar varias condiciones.

 **04. Bucles**

Los bucles permiten repetir instrucciones automáticamente.

Bucle FOR:

java
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}


Bucle WHILE:

java
int contador = 1;

while (contador <= 5) {
    System.out.println(contador);
    contador++;
}

⌨️ 05. Entrada de datos por teclado

Con Scanner podemos pedir información al usuario.

java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("¡Bienvenido, " + nombre + "!");

        teclado.close();
    }
}

 **06. Métodos**

Los métodos permiten organizar y reutilizar código.

java
public class Main {

    public static void saludar() {
        System.out.println("¡Hola, programador!");
    }

    public static void main(String[] args) {
        saludar();
    }
}

 **07. Programación orientada a objetos (POO)**

Java utiliza la programación orientada a objetos.

Sus conceptos principales son:

Clases: plantillas para crear objetos.
Objetos: instancias de una clase.
Atributos: características de los objetos.
Métodos: acciones que pueden realizar.

Ejemplo:

java
class Persona {

    String nombre;
    int edad;

    void presentarse() {
        System.out.println("Hola, soy " + nombre);
    }
}

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.nombre = "Alex";
        persona.edad = 20;

        persona.presentarse();
    }
}

Primer programa en Java
Variables y tipos de datos
Condicionales
Bucles
Entrada de datos
Métodos
Arrays y matrices
Programación orientada a objetos avanzada
Herencia y polimorfismo
Encapsulación
Excepciones
Colecciones
Proyectos prácticos
 **Retos para practicar**
Nivel	Reto
🟢 Fácil	Crear una calculadora
🟢 Fácil	Comprobar si un número es par o impar
🟡 Medio	Crear un juego de adivinar números
🟡 Medio	Crear un conversor de temperaturas
🔴 Difícil	Crear un sistema de gestión de usuarios
📊 Estadísticas del repositorio

<p align="center">
<img src="https://github-readme-stats.vercel.app/api?username=TU_USUARIO&show_icons=true&theme=tokyonight&hide_border=true&locale=es" />
</p>

<p align="center">
<img src="https://github-readme-stats.vercel.app/api/top-langs/?username=TU_USUARIO&layout=compact&theme=tokyonight&hide_border=true" />
</p>

<p align="center">
<img src="https://streak-stats.demolab.com?user=TU_USUARIO&theme=tokyonight&hide_border=true&locale=es" />
</p>

 **Herramientas utilizadas**

<p align="center">
<img src="https://skillicons.dev/icons?i=java,eclipse,vscode,git,github" />
</p>

<p align="center">
<img src="https://capsule-render.vercel.app/api?type=waving&color=ED8B00&height=120&section=footer" />
</p>

