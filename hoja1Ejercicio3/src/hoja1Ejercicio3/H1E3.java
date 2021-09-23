package hoja1Ejercicio3;

import java.util.Scanner;

public class H1E3 {

	public static void main(String[] args) {
		//Elisa Expolio (20-09-21)
		//Ejercicio 3: programa que lee números de manera consecutivas hasta que se introducen dos números iguales consecutivos
		
		//Declaramos las variables
		int numero1;
		int numero2;
		boolean continuar=true;   //esto es lo más importante para que no sean los numeros todo el rato iguales 
		Scanner sc = new Scanner(System.in);
				
		//Escribimos el bucle do
		/*do
		{
			System.out.print("Introduzca número: ");
			numero1=sc.nextInt();
			System.out.print("Introduzca otro número: ");
			numero2=sc.nextInt();
		}while(numero1!=numero2);*/
		
		//Este caso no funciona como queremos porque pide los números a pares, entonces no detecta si el primer numero2 es igual al 
		//segundo numero1. Compara los números a pares en cada una de las iteraciones pero no entre iteraciones distintas.
		
		//Probamos otra cosa
		System.out.print("Introduzca número: ");
		numero1=sc.nextInt();
		
		do
		{
			System.out.print("Introduzca otro número: ");
			numero2=sc.nextInt();
			
			if (numero1==numero2)
			{continuar=false;}
			
			//para conservar el ultimo numero introducido reescribimos numero1 y le damos el valor de numero2
			numero1=numero2;
					
			//la variable continuar nos ayuda a que los números no sean todo el rato iguales		
			
		}while(continuar==true);
		
		
		
		
		
		sc.close();
		

	}

}
