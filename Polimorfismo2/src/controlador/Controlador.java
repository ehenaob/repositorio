package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador 
{
	private Mundo mundo;
	private Interfaz interfaz;
	
	public Controlador()
	{
		mundo = new Mundo();
		interfaz = new Interfaz();
		
		interfaz.imprimir(mundo.crearLinea());
	}
}
