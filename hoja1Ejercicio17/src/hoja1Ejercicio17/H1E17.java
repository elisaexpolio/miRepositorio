package hoja1Ejercicio17;

import java.util.Scanner;

public class H1E17 {

	public static void main(String[] args) {
		//Elisa Expolio (26-09-21)
		//Programa que lee nombres, cantidades y precios de productos. Al final devuelve la suma y si la compra supera los 1000€ hace un
		//descuento del 5%. El programa finaliza al introducir una cantidad 0
		
		//Declaramos variables
		//String nombre;
		int cantidad;
		float precios;
		float preciosxCantidad;
		float precioTotal=0; //es un contador del total de la compra por lo que se inicializa a cero
		float totalDescuento;
		Scanner sc=new Scanner(System.in);
		
		//Tendremos que hacer un bucle do while puesto que el numero de iteraciones es desconocido
		do
		{
			//Pedimos precio y cantidad por pantalla
			System.out.print("Introduzca cantidad de producto:");
			cantidad=sc.nextInt();
			
			System.out.print("Introduzca precio del producto:");
			precios=sc.nextFloat();
			
			//Obtenemos el precio total de dicho producto
			preciosxCantidad=(precios*cantidad);
			
			//Sumamos al total de la compra
			precioTotal=precioTotal+preciosxCantidad;
	
		}while(cantidad!=0);
		
		sc.close();
		
		//Veamos si se aplica el descuento
		if(precioTotal>=1000)
		{
			totalDescuento=precioTotal-(precioTotal*5/100);
			System.out.println("Se aplica descuento! El precio final es: " + totalDescuento);			
		}
		else
		{
			System.out.println("No se aplica descuento. El precio final es: " + precioTotal);
		}

	}

}
