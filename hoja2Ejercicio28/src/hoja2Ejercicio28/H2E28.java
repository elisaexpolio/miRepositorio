package hoja2Ejercicio28;

public class H2E28 {

	public static void main(String[] args) {
		//Elisa Expolio (26-09-21)
		//Programa que recoge el array bidimensional dado y despues lo muestra por pantalla
		
		//Declaramos variables
		int numFilas=5;
		int numColumnas=7;
		int[][] matriz=new int[numFilas][numColumnas];
		int start=numFilas*numColumnas;
		boolean resta=true;
		
		//Bucle para rellenar la matriz
		for(int j=0; j<numColumnas; j++)
		{
			for(int i=0; i<numFilas; i++)
			{
				//Asignamos el valor de comienzo
				matriz[i][j]=start;
				
				//Si estamos en cualquiera de las filas intermedias
				if(i<numFilas-1)
				{
					if (resta==true)
					{start--;}
					else
					{start++;}
				}
			}
			start-=numFilas;
			resta=!resta;
		}
		
		//Sacamos por pantalla
		for(int i=0; i<numFilas; i++)
		{
			for(int j=0; j<numColumnas; j++)
			{
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
