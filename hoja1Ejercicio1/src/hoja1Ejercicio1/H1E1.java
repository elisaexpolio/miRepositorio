package hoja1Ejercicio1;

import java.util.Scanner;

public class H1E1 {

	public static void main(String[] args) {
		//Elisa Expolio (19-09-2021)
		//Ejercicio que nos dice si un número es divisor de otro
		
		//Vamos a pedir que nos introduzcan los números por pantalla
		//Declaramos las variables y adjudicamos valores
		float A;
		float B;
		float resto;
		String mensaje;
		Scanner sc;
		
		/*A=20.0F;
		B=10F;
		resto=(float)A%B;*/
		
		//Incializar la variable sc
		sc= new Scanner(System.in);  //crear una instancia
		
		System.out.print("Introducir numerador: ");
		A=sc.nextInt(); //pedimos que se introduzca una variable tipo int para asignar a A (cada tipo de variable tendrá su comando)
		System.out.print("Introducir divisor: ");
		B=sc.nextInt(); 
		
		// A/B, A es divisible entre B (B es divisor de A) si el resto es cero
		resto=A%B;
		
		sc.close();
		
		System.out.println("El resto es: "+ resto);
		
		//Condicional if sobre si es divisor, usamos el operador modulo
		if (resto==0) {
			
			//A es divisor de B
			mensaje=A + " es divisible entre "+B;	//unimos distintos tipos de variables concatenando con el +
													//se realiza una conversión automática (implícita) de los números int a Strings 
			//mensaje=String.valueOf(A)+" es divisible entre "+String.valueOf(B);
			//mensaje=String.format("%d es divisible entre %d",A, B);
		}
		else {
			mensaje=A+ " NO es divisible entre "+B;
			
		}
		
		System.out.println(mensaje);

	}

}
