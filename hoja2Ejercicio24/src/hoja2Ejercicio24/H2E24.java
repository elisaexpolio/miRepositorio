package hoja2Ejercicio24;

import java.util.Scanner;

public class H2E24 {

	public static void main(String[] args) {
		//Elisa Expolio (01-10-21)
		//Ejercicio que lee 10 numeros y los muestra en orden ascendente
		
		//Declaramos la matriz
		int[] numeros=new int[10];
		Scanner sc=new Scanner(System.in);
		int contador;
		int aux;
		
		//Pedimos los números por pantalla con un bucle for
		System.out.println("Por favor, introduzca 10 números:");
		for(int i=0; i<numeros.length; i++)
		{
			numeros[i]=sc.nextInt();
		}
		
		sc.close();
		
		//Los ordenamos con el algoritmo de la burbuja
		do
		{
			contador=0; //inicializamos
			
			for(int j=0; j<numeros.length-1;j++)
			{
				//si un número es mayor que el siguiente, lo cambiamos
				if(numeros[j]>numeros[j+1])
				{
					aux=numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
					
					contador++;
				}
			}
			
		}while(contador>0);
		
		//Los sacamos por pantalla
		System.out.println("Los números ordenados son: ");
		
		for(int k=0; k<numeros.length;k++)
		{
			System.out.println(numeros[k]);
		}

	}

}
