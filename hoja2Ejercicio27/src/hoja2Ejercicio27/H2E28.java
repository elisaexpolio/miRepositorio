package hoja2Ejercicio27;

import java.util.Scanner;

public class H2E28 {

	public static void main(String[] args) {
		//Elisa Expolio (26-09-21)
		//Programa que lee una tabla 3x3 y muestra la columna cuya suma sea menor
		
		//Declaramos variables
		int filas=3;
		int columnas=3;
		int[][] matriz=new int[filas][columnas];
		int suma0=0;
		int suma1=0; 
		int suma2=0;
		int sumaMenor=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		
		//Completamos la tabla por teclado
		for(int i=0; i<filas; i++)
		{
			for(int j=0; j<columnas; j++)
			{
				System.out.print("Introduzca número en posición " + i + ", " + j + ": ");
				matriz[i][j]=sc.nextInt();
			}
		}
		
		sc.close();
		
		//Realizamos la suma de los elementos de cada columna
		for(int j=0; j<columnas;j++)
		{
			suma0=suma0+matriz[0][j];
			suma1=suma1+matriz[1][j];
			suma2=suma2+matriz[2][j];
		}
		System.out.println(suma0);
		System.out.println(suma1);
		System.out.println(suma2);
		
		//Vemos cual de las sumas es la menor
		if (suma0<sumaMenor)
		{
			sumaMenor=suma0;
			
			if(suma1<sumaMenor)
			{
				sumaMenor=suma1;
				
				if(suma2<sumaMenor)
				{
					sumaMenor=suma2;
				}
			}
			
		}
		
		System.out.println(sumaMenor);
		
	}

}
