package hoja1Ejercicio18;

import java.util.Scanner;

public class H1E18 {

	public static void main(String[] args) {
		//Elisa Expolio (26-09-21)
		//Programa que lee tres numeros y los muestra de mayor a menor
		
		//Declaramos las variables
		int n1;
		int n2;
		int n3;
		int aux; //variable de apoyo
		Scanner sc=new Scanner(System.in);
		
		//Introducimos los numeros
		System.out.println("Introduzca 3 números: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		//Condiciones
		//Si n1 es menor que n2, convertimos n1 en el mayor (n2)
		if(n1<n2)
		{
			aux=n1;
			n1=n2;
			n2=aux;
		}
		//Si n1 reescrito es menor que n3, convertimos n1 en el mayor (n3)
		if(n1<n3)
		{
			aux=n1;
			n1=n3;
			n3=aux;
		}
			
		//Sacamos el mayor (hemos forzado a que sea n1) por pantalla
		System.out.print(n1 + ", ");
			
		//Comparamos n2 y n3
		if(n2>=n3)
		{System.out.println(n2 + ", " + n3);}
		else
		{System.out.println(n3 + ", " + n2);}
		
		sc.close();

	}

}
