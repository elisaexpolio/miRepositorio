package hoja1Ejercicio11;

import java.util.Calendar;
import java.util.Scanner;

public class H1E11 {

	public static void main(String[] args) {
		//Elisa Expolio (21-09-21)
		/*Ejercicio que hace un programa que lee nombre y a�o de nacimiento de una serie de alumnos hasta introducir
		como nombre de alumno �fin�. En ese momento mostrar� la edad media de los alumnos y
		el nombre del alumno menor. NOTA: Al introducir como nombre �fin�, no nos ha de pedir el
		a�o de nacimiento.*/
		
		//Declaramos las variables
		String nombre;
		int a�oNacimiento;
		float media;
		int a�oActual=Calendar.getInstance().get(Calendar.YEAR); //obtiene el a�o del sistema (v�lido para todos los a�os)
		int edad;
		int suma=0; //contador para las edades
		int numNombres=0; //contador para el numero de nombres introducido
		boolean continuar=true;
		int menor=Integer.MAX_VALUE; //para sacar el nombre del alumno de menor edad
		String nombreMenor = ""; //variable para guardar el nombre del alumno m�s peque�o. Inicializamos as� para que no de error por los if
								 //tambien lo podemos hacer con null
		String mensajeMedia;
		String mensajeMenor;
		Scanner sc=new Scanner(System.in);
		
		//Como no sabemos el numero de iteraciones es un bucle do-while
		do
		{
			//Pedimos nombre al usuario
			System.out.print("Introduzca nombre: ");
			nombre=sc.nextLine();
			
			//solo pedimos el a�o al usuario si el nombre es distinto de fin
			if (nombre.equalsIgnoreCase("fin"))  //ignore case se refiere a que puedo escribir fin con mayusculas
												 //o con mezcla mayusculas y minusculas que va a funcionar igual
			{
				continuar=false;
			}
			else 
			{
				//sumamos 1 al contador del numero de nombres
				numNombres++; //si lo ponemos despues del nombre estariamos sumando uno mas
				
				System.out.print("Introduzca a�o de nacimiento: ");
				a�oNacimiento=Integer.valueOf(sc.nextLine()); //�por qu�? (ver apuntes)
				
				//calculamos la edad haciendo la resta con el a�o actual
				edad=a�oActual-a�oNacimiento;
				
				//acumulamos la edad en la suma para luego hacer la media
				suma=suma+edad;
				
				//nombre del alumno menor
				if (edad<menor)
				{
					menor=edad;
					nombreMenor=nombre;
				}
			}
			
		}while(continuar==true);
		
		
		if(numNombres>0) //hace que no se rompa si el primer nombre es fin
		{
			//hacemos la media
			media=(float)suma/numNombres;  //estamos dividiendo dos enteros, por lo que para que la media sea
										   //tipo float tenemos que convertir 1 o los dos a tipo float
			
			//Sacamos por pantalla los resultados
			mensajeMedia="La media de edades es: "+ media;
			mensajeMenor="El alumno de menor edad es: "+ nombreMenor;
		}
		else
		{
			media=0;
			mensajeMedia="No hay alumnos para hacer la media de edad";
			mensajeMenor="No hay alumnos";
		}
		
		System.out.println(mensajeMedia);
		System.out.println(mensajeMenor);
		
		
		
		sc.close();
		

		
	}

}
