package controlador;

import modelo.Circulo;
import modelo.Cuadrado;
import vista.Interfaz;

public class Controlador 
{
	private Cuadrado cuadrado;
	private Circulo circulo;
	private Interfaz interfaz;
	
	
	public Controlador()
	{
		cuadrado = new Cuadrado();
		circulo = new Circulo();
		interfaz = new Interfaz();
				
		cuadrado.setLado(interfaz.pedirLadoCuadrado());
		cuadrado.calcularArea();
		cuadrado.calcularPerimetro();
		cuadrado.imprimirAreayPerimetro();
		
		circulo.setRadio(interfaz.pedirRadioCirculo());
		circulo.calcularArea();
		circulo.calcularPerimetro();
		circulo.imprimirAreayPerimero();
		
	}
}
