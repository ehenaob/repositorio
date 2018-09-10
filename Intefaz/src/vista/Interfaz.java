package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	private String numero;
	private double numero1;

	public Interfaz()
	{

	}

	public double pedirLadoCuadrado()
	{
			numero = JOptionPane.showInputDialog("Ingrese la medida de el lado del cuadrado");
			numero1 = Double.parseDouble(numero);

		return numero1;
	}

	public double pedirRadioCirculo()
	{
			numero = JOptionPane.showInputDialog("Ingrese el radio del circulo");
			numero1 = Double.parseDouble(numero);

		return numero1;
	}
}
