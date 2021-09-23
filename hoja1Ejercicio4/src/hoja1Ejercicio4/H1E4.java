package hoja1Ejercicio4;

import java.util.Scanner;

public class H1E4 {

	public static void main(String[] args) {
		//Elisa Expolio (20-09-21)
		//Ejercicio4: se muestran todos los divisores de un numero sin incluirse a si mismo
		//Entendemos por divisores que no tenemos decimales en el resultado, por tanto los divisores de un número son siempre 
		//más pequeños que el.
		
		
		//Declaramos las variables
		int numero;
		int resto;
		Scanner sc=new Scanner(System.in);
		
		//Pedimos numero por pantalla
		System.out.print("Introduzca un numero: ");
		numero=sc.nextInt();
		
		System.out.println("Los divisores de " + numero + " son: ");
		//Bucle for
		for(int divisor=1; divisor<numero; divisor++) //podemos ahorrarnos parte del bucle sabiendo que ningun divisor es mayor que la mitad del numero
		{
			resto=numero%divisor;
			if (resto==0)
			{
				System.out.println(divisor);
			}
		}
		
		sc.close();

	}

}
