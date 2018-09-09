package controlador;

import java.util.Scanner;

import modelo.Persona;

public class Controlador 
{
	private static Persona persona;

	public static void main(String[] args) 
	{
		persona = new Persona();

		boolean ejecucion = true;

		while (ejecucion == true)
		{
			System.out.println("Bienvenido al programa de salario");
			System.out.println("Las siguientes opciones son: ");
			System.out.println("[1] Agregar un salario");
			System.out.println("[2] Mostrar el salario minimo");
			System.out.println("[3] Mostrar el salario maximo");
			System.out.println("[4] Hacer un promedio de todos los salarios");
			
			Scanner lector = new Scanner(System.in);
			String respuesta = lector.nextLine();
			int res = Integer.parseInt(respuesta);

			switch(res)
			{

			case 1:
			{
				if(res == 1)
				{
					System.out.println("Escriba el numero del salario que desea agregar: ");
					String salarioNuevo = lector.nextLine();
					double salario = Double.parseDouble(salarioNuevo);

					persona.agregarSueldo(salario);

					System.out.println("EL salario ha sido agregado :)");

					break;
				}
			}	
			
			case 2:
			{

				if(res ==2)
				{
					System.out.println("El salario minimo es: " + persona.sueldoMinimo());
				}
				break;
			}
			
			case 3:
			{
				if(res == 3)
				{
					System.out.println("El salario maximo es: " + persona.sueldoMaximo());
				}
			}
			case 4:
			{
				if(res == 4)
				{
					System.out.println("El promedio de los salarios es: " + persona.promedioSueldo());
				}
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

