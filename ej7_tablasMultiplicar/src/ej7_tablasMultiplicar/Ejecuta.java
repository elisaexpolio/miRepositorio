package ej7_tablasMultiplicar;

public class Ejecuta {

	public static void main(String[] args) {
		//Elisa Expolio (22-09-21)
		//Ejemplo que calcula TODAS las tablas de multiplicar hasta el 10
		
		//Declaramos las variables
		int resultado;
		int suma; //queremos la suma de los resultados de cada una de las tablas por separado
		
		//Tenemos que hacer dos bucles for para que itere en los dos numeros
		for (int i=0; i<=10; i++)
		{
			//Título
			System.out.println("Tabla del "+ i + ":");
			suma=0; //se inicializa aqui para que no nos sume los resultados de unas tablas con los de otras
			
			for(int j=0; j<=10; j++)
			{
				resultado=i*j;
				System.out.println(i + "x" + j + "=" + resultado);
				suma=suma+resultado; //vamos sumando cada resultado obtenido
				
			}
			//Separador
			System.out.println("                  "); //separador
			System.out.println("Suma de resultados:"+suma);
			System.out.println("---------------------------------"); //separador
			
		}
		

	}

}
