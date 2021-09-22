package hoja1Ejercicio12;

//import java.util.Scanner;

public class H1E12 {

	public static void main(String[] args) {
		//Elisa Expolio (22-09-21)
		/*Ejercicio que devuelve los numeros primos entre 1 y 100*/
		
		//Declaramos las variables
		int resto; 
		boolean primo;  //no podemos inicializarlo aquí porque sino el bucle deja de hacerse en cuanto
						//detecta el primer número no primo.
		//String mensaje;
		//Scanner sc=new Scanner(System.in);
		
		//Sacamos el número a través del un bucle for, ya no lo pedimos por teclado e introducimos 
		//el código de los primos
		for (int numero=1; numero<=100; numero++)
		{
			//Quitamos el 0,1 y los negativos 
			if(numero<2)
			{primo=false;} //para negativos, 0 y 1 siempre va a ser faslo
			else
			{primo=true;} //la inicializamos para el resto de números como verdadera y luego ya vemos 
						  //si cambia con el bucle de los divisores, pero de inicio es verdadera.
			
			//Creamos un bucle for
			for (int candidatoDivisor=2; candidatoDivisor<numero && primo==true; candidatoDivisor++)
			//el bucle excluye el 1 y el propio numero como divisores (condicion de primo, siempre se cumple)
			//por tanto si son divisibles entre otro número ya no serán primos
			{
				//calculamos el resto
				resto=numero%candidatoDivisor;
					
				//si el resto es cero, hemos encontrado un divisor
				if (resto==0)
				{primo=false;}
					
			}
			
			//Sacamos por pantalla, tiene que sacar cada numero, por tanto dentro del for
			if (primo==true)
			{System.out.println(numero);}
		}
		
		//Tenemos que inicializarla como verdadera cada vez que se pruebe un número nuevo del 1 al 100
		//Por eso se inicializa dentro del primer bucle for para que se re-inicialice después comprobar
		//cada número

	}

}
