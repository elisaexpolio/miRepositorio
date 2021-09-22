package hoja1Ejercicio12;

import java.util.Scanner;

public class H1E12 {

	public static void main(String[] args) {
		//Elisa Expolio (22-09-21)
		/*Ejercicio que devuelve los numeros primos entre 1 y 100*/
		
		//Declaramos las variables
		int numero;
		int resto; 
		boolean primo=true;  //asumimos primo de inicio
		String mensaje;
		Scanner sc=new Scanner(System.in);
		
		//Pedimos un numero
		System.out.print("Introduzca un numero: ");
		numero=sc.nextInt();
		
		sc.close();
		
		
		
		//Creamos un bucle for
		for (int candidatoDivisor=2; candidatoDivisor<numero && primo==true; candidatoDivisor++)
			//el bucle excluye el 1 y el propio numero como divisores (condicion de primo)
			//por tanto si otro numero
		{
			//calculamos el resto
			resto=numero%candidatoDivisor;
			
			//si el resto es cero, hemos encontrado un divisor
			if (resto==0)
			{primo=false;}
			
		}
		
		//Sacamos el mensaje
		mensaje=(primo==true)?"El número " + numero + " es primo.":"El número " + numero + " NO es primo";
		/*if(primo==true)
		{mensaje="El número " + numero + " es primo.";}
		else
		{mensaje="El número " + numero + " NO es primo";}*/
			
		System.out.println(mensaje);

	}

}
