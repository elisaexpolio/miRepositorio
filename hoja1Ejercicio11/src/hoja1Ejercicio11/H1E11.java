package hoja1Ejercicio11;

import java.util.Calendar;
import java.util.Scanner;

public class H1E11 { 

	public static void main(String[] args) {
		//Elisa Expolio (21-09-21)
		/*Ejercicio que hace un programa que lee nombre y aÃ±o de nacimiento de una serie de alumnos hasta introducir
		como nombre de alumno â€œfinâ€�. En ese momento mostrarÃ¡ la edad media de los alumnos y
		el nombre del alumno menor. NOTA: Al introducir como nombre â€œfinâ€�, no nos ha de pedir el
		aÃ±o de nacimiento.*/
		
		//CAMBIO PARA PROBAR GITHUB
		
		//Declaramos las variables
		String nombre;
		int añoNacimiento;
		float media;
		int añoActual=Calendar.getInstance().get(Calendar.YEAR); //obtiene el aÃ±o del sistema (vÃ¡lido para todos los aÃ±os)
		int edad;
		int suma=0; //contador para las edades
		int numNombres=0; //contador para el numero de nombres introducido
		//boolean continuar=true; activar para SOLUCIÃ“N 1
		int menor=Integer.MAX_VALUE; //para sacar el nombre del alumno de menor edad
		String nombreMenor = ""; //variable para guardar el nombre del alumno mÃ¡s pequeÃ±o. Inicializamos asÃ­ para que no de error por los if
								 //tambien lo podemos hacer con null
		String mensajeMedia;
		String mensajeMenor;
		Scanner sc=new Scanner(System.in);
		
		/*SOLUCIÃ“N 1:
		//Como no sabemos el numero de iteraciones es un bucle do-while
		do
		{
			//Pedimos nombre al usuario
			System.out.print("Introduzca nombre: ");
			nombre=sc.nextLine();
			
			//solo pedimos el aÃ±o al usuario si el nombre es distinto de fin
			if (nombre.equalsIgnoreCase("fin"))  //ignore case se refiere a que puedo escribir fin con mayusculas
												 //o con mezcla mayusculas y minusculas que va a funcionar igual
			{
				continuar=false;
			}
			else 
			{
				//sumamos 1 al contador del numero de nombres
				numNombres++; //si lo ponemos despues del nombre estariamos sumando uno mas
				
				System.out.print("Introduzca aÃ±o de nacimiento: ");
				aÃ±oNacimiento=Integer.valueOf(sc.nextLine()); //Â¿por quÃ©? (ver apuntes)
				
				//calculamos la edad haciendo la resta con el aÃ±o actual
				edad=aÃ±oActual-aÃ±oNacimiento;
				
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
		System.out.println(mensajeMenor);*/
		
		//SOLUCIÃ“N 2:
		//Pedimos el nombre
		System.out.print("Introduzca nombre: ");
		nombre=sc.nextLine();
		
		//Y con un bucle while
		while(nombre.equals("fin")==false)
		{
			//sumamos 1 al contador del numero de nombres
			numNombres++; //si lo ponemos despues del nombre estariamos sumando uno mas
			
			System.out.print("Introduzca año de nacimiento: ");
			añoNacimiento=Integer.valueOf(sc.nextLine()); //Â¿por quÃ©? (ver apuntes)
			
			//calculamos la edad haciendo la resta con el aÃ±o actual
			edad=añoActual-añoNacimiento;
			
			//acumulamos la edad en la suma para luego hacer la media
			suma=suma+edad;
			
			//nombre del alumno menor
			if (edad<menor)
			{
				menor=edad;
				nombreMenor=nombre;
			}
			
			//Pedimos otro nombre porque sino solo nos va a dejar introducir 1
			System.out.print("Introduzca nombre: ");
			nombre=sc.nextLine();
		}
		
		//Sacar solucion
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
