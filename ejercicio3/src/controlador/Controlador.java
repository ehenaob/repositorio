package controlador;

import java.util.Scanner;

import modelo.Metodo;

public class Controlador 
{
	private static Metodo metodo;

	public static void main(String[] args) 
	{
		boolean ejecucion = true;

		while (ejecucion == true)
		{
			metodo = new Metodo();

			System.out.println("[1] Agregar numero");
			System.out.println("[2] Buscar numero");

			Scanner lector = new Scanner(System.in);
			String respuesta = lector.nextLine();
			int res = Integer.parseInt(respuesta);

			switch(res)
			{

			case 1:

			{
				if(res == 1)
				{
					System.out.println("Digite el numero que desea agregar");
					String num = lector.nextLine();
					int numero = Integer.parseInt(num);

					metodo.agregarNumero(numero);

					System.out.println("El numero que agrego es: " + numero);
				}

				break;
			}
			case 2:
			{
				if(res == 2)
				{
					System.out.println("Digite el numero que desea buscar");
					String num = lector.nextLine();
					int numero = Integer.parseInt(num);

					if(metodo.buscarNumero(numero) == true)
					{
						System.out.println("El numero que busca se encuentra en la lista");
					}
					else
					{
						System.out.println("El numero que busca NO se encuentra en la lista");
					}
				}
				break;
			}
			}
			System.out.println("\n\t¿Desea Continuar? Y/N");
			String respues = lector.nextLine();
			
			if (respues.equalsIgnoreCase("N"))
			{
				ejecucion = false;
			}

		}	
	}
}
