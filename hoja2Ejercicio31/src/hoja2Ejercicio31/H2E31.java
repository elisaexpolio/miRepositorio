package hoja2Ejercicio31;

import java.util.Scanner;

public class H2E31 {

	public static void main(String[] args) {
		//Elisa Expolio (27-09-21)
		//Ejercicio 31
		
		//Declaramos variables
		String menu;
		Scanner sc=new Scanner(System.in);
		int numeros[]=new int[18];
		int opcion;
		int i=0; //apunta a la posición vacía del array
		int num; //para guardar elementos de numeros antes de guardarlo (comprobamos si está repetido)
		int j;
		int contadorIntercambios;
		int aux; //para manejar el intercambio del algoritmo de la burbuja
		
		//Establecemos el menú
		menu="MENÚ: " + "\n"
			 + "1- Introduxir número entero \n"
			 + "2- Listar números \n"
			 + "3- Eliminar número \n"
			 + "4- Eliminar todos los números\n"
			 + "5- Salir\n";
		
		//Hacemos un bucle do while que se repita hasta que introduzcamos la opción 5 de salir
		do
		{
			System.out.println(menu);
			System.out.print("Introduzca opción: ");
			opcion=sc.nextInt();
			
			//Ahora asignamos cada opción a su correspondiente número
			switch(opcion)
			{
				//1- RELLENAMOS EL ARRAY Y ORDENAMOS EN ORDEN ASCENDENTE
				case 1:
				{
					//Comprobamos si estamos en la ultima posicion
					if(i==18)
					{
						System.out.println("Array lleno. No se ha guardado");
					}
					else
					{
						System.out.print("Introduzca número: "); //pedimos número
						num=sc.nextInt();
						
						//Comprobamos que no esté repetido
						for( j=0; j<i && numeros[j]!=num; j++);
						
						if(i==j)  //si no está repetido se añade al array
						{
							numeros[i]=num;
							i++;
							
							//Ordenamos ascendentemente los elementos del array. Algoritmo de la burbuja
							do
							{
								contadorIntercambios=0; //inicializamos contador
								for( j=0; j<i-1; j++)
								{
									if(numeros[j]>numeros[j+1])  //si un número es mayor que el siguiente
									{
										aux=numeros[j];
										numeros[j]=numeros[j+1]; //j pasa a ser el de la posicion siguiente j+1
										numeros[j+1]=aux;		 //j+1 pasa a ser el de la pos j
										contadorIntercambios++;  //aumentamos el contador de intercambios
									}
								}
								
							}while(contadorIntercambios>0); //el bucle se realiza hasta que el numero de intercambios sea 0, nota que en cada iteración del bucle do
															//se vuelve a inicializar el contador. Si el contador es 0 significa que no se ha hecho ningún intercambio
															// y por tanto es mayor que todos los del array y se ha colocado al final.
						}
						else  //si no está repetido, no se añade
						{System.out.println("Número repetido! No se ha guardado");}
					}
				}
				break;
				
				//2- MOSTRAMOS LA LISTA
				case 2:
				{
					if(i==0)
					{System.out.println("No hay datos!!");}
					else
					{
						for(j=0; j<i; j++) //ponemos la i porque el tamaño del array es variable según el numero de elementos que hayamos introducido o si se repiten numeros
						{System.out.println(numeros[j]);}
					}
				}
				break;
				
				//3- ELIMINAMOS UN DATO Y CORREMOS LA LISTA
				case 3:
				{
					System.out.print("Introduzca número a eliminar: ");
					num=sc.nextInt();
					
					for(j=0; j<i && numeros[j]!=num; j++); //solo vamos aumentando la j desde 0 hasta i
					
						if(i==j)
						{System.out.println("No se ha encontrado. No se elimina"); }
						else
						{
							for(int k=j; k<i-1; k++)
							{numeros[k]=numeros[k+1];}
							i--;
						}
					
					
					if (i==j)
					{System.out.println("No se ha encontrado!. No hay nada que eliminar.");}
				}
				break;
				
				//4- ELIMINAMOS TODOS LOS DATOS:
				case 4:
				{
					i=0;
					//numeros=new int[18]; también podriamos redefinir el array
				}
					
				break;
				
				case 5:
				break;
				
				default:
				{System.out.println("\n Opción incorrecta!");}
				break;
			
			}
			
		}while(opcion!=5);
			
		sc.close();

	}

}
