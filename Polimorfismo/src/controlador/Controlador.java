package controlador;

import javax.swing.JOptionPane;

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
		
		interfaz.mostrar(null, mundo.hacerSobrecarga());
		interfaz.mostrar(null, mundo.hacerSobrecarga(interfaz.ingresarArgumento()));
		interfaz.mostrar(null, mundo.hacerSobrecarga(interfaz.ingresarArgumento(), interfaz.ingresarArgumento2()));
	}
}
