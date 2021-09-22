package hoja1Ejercicio11;

import java.util.Scanner;

public class H1E11 {

	public static void main(String[] args) {
		//Elisa Expolio (21-09-21)
		/*Ejercicio que hace un programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
		como nombre de alumno “fin”. En ese momento mostrará la edad media de los alumnos y
		el nombre del alumno menor. NOTA: Al introducir como nombre “fin”, no nos ha de pedir el
		año de nacimiento.*/
		
		//Declaramos las variables
		String nombre;
		int año;
		float media;
		int añoActual=2021;
		int edad;
		int suma=0; //contador para las edades
		int numNombres=0; //contador para el numero de nombres introducido
		boolean continuar=true;
		String mensaje;
		Scanner sc=new Scanner(System.in);
		
		//Como no sabemos el numero de iteraciones es un bucle do-while
		do
		{
			//Pedimos nombre al usuario
			System.out.print("Introduzca nombre: ");
			nombre=sc.nextLine();
			
			//solo pedimos el año al usuario si el nombre es distinto de fin
			if (nombre.equalsIgnoreCase("fin"))
			{
				continuar=false;
			}
			else 
			{
				//sumamos 1 al contador del numero de nombres
				numNombres++;
				
				System.out.print("Introduzca año de nacimiento: ");
				año=Integer.valueOf(sc.nextLine()); //¿por qué? (ver apuntes)
				
				//calculamos la edad haciendo la resta con el año actual
				edad=añoActual-año;
				
				//acumulamos la edad en la suma para luego hacer la media
				suma=suma+edad;
			}
			
		}while(continuar==true);
		
		//hacemos la media
		media=(float)suma/numNombres;
		
		//Sacamos por pantalla la media de edades
		mensaje="La media de edades es: "+media;
		System.out.println(mensaje);
		
		sc.close();
		

		
	}

}
