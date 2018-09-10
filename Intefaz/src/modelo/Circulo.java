package modelo;

import javax.swing.JOptionPane;

public class Circulo implements Figura
{
	private double radio;
	private double pi = 3.1416;

	public double getRadio() 
	{
		return radio;
	}

	public void setRadio(double radio) 
	{
		this.radio = radio;
	}

	public double calcularArea() 
	{
		return pi * Math.pow(this.getRadio(), 2);
	}

	public double calcularPerimetro() 
	{
		return 2 * pi * this.getRadio();
	}
	
	public void imprimirAreayPerimero()
	{
		JOptionPane.showMessageDialog(null, "El area del circulo es: " + this.calcularArea() + " y el perimetro es: " + this.calcularPerimetro());
	}

}
