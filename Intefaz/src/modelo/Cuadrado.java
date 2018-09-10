package modelo;

import javax.swing.JOptionPane;

public class Cuadrado implements Figura
{
	private double lado;

	public double getLado() 
	{
		return lado;
	}
	
	public void setLado(double lado) 
	{
		this.lado = lado;
	}
	
	public double calcularArea() 
	{
		return this.getLado()*this.getLado();
	}
	

	public double calcularPerimetro() 
	{
		return this.getLado()*4;
	}

	public void imprimirAreayPerimetro()
	{
		JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + this.calcularArea() + " y el perimetro es: " + this.calcularPerimetro());
	}

}
