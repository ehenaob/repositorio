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
		
		interfaz.mostrarSuperman(mundo.getSuperman().imprimirDatos());
		interfaz.mostrarPajaro(mundo.getPajaro().imprimirDatos());
		interfaz.mostrarAeroplano(mundo.getAeroplano().imprimirDatos());
		
		interfaz.mostrarHelicoptero(mundo.getHelicoptero().imprimirDatos());
		interfaz.mostrarHidroAvion(mundo.getHidro().imprimirDatos());
	}
}
