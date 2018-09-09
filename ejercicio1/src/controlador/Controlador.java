package controlador;

import java.util.Scanner;

import modelo.Modelo;

public class Controlador 
{
	private Modelo modelo;
	
	public static void main(String[] args) 
	{
		Modelo modelo = new Modelo();		
		
		try
		{	
			Scanner lector = new Scanner(System.in);
			System.out.println("Por favor ingrese un n�mero");
			String numero = lector.nextLine();
			int pNumero = Integer.parseInt(numero);
			
			System.out.println(modelo.darMonto(pNumero) + " euros");
		}
		catch (Exception e) 
		{
				System.out.println("El n�mero que ingreso no est� entre 0 y 99");
		}	
	}
	
}
