package controlador;

import modelo.Mundo;

public class Principal 
{
	private static Mundo modelo;
	
	public static void main(String[] args)
	{
		modelo = new Mundo();
		
		modelo.darCan1().mostrarMamifero();
		modelo.darFel1().mostrarMamifero();
	}

}
