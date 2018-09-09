package controlador;

import modelo.AigualA0;
import modelo.Modelo;
import modelo.RaizNegativa;

public class Controlador 
{
	private Modelo modelo;
	
	public Controlador() throws RaizNegativa, AigualA0
	{
		modelo = new Modelo();
		
		modelo.denominador(2,5,3);
		
	}
}
