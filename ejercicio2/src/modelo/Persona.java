package modelo;

import javax.swing.JOptionPane;

public class Persona 
{
	public final static int CAPACIDAD=20;
	private Sueldo[] sueldos;
	private int numeroSueldos;
	private double sueldoMinimo;
	private double sueldoMaximo;
	private double promedioSueldos;
	
	public Persona()
	{		
		sueldos = new Sueldo[CAPACIDAD];
		numeroSueldos = 0;
		sueldoMinimo = 0.0;
		sueldoMaximo = 0.0;
		promedioSueldos = 0.0;
	}

	public boolean agregarSueldo(double pSueldo)
	{
		boolean agregar = false;

		for (int i = 0; i < sueldos.length && agregar == false; i++)
		{
			if(sueldos[i] == null)
			{
				sueldos[i] = new Sueldo(pSueldo);
				numeroSueldos++;
				agregar = true;
			}			
		}
		return agregar;
	}

	
	public double sueldoMinimo()
	{
		double menor = 0;
		menor = sueldos[0].darSueldo();
		
		for (int i = 0; i < sueldos.length; i++) 
		{
			if(sueldos[i]!=null)
			{
				if(sueldos[i].darSueldo()<menor)
				{
					menor = sueldos[i].darSueldo();
				}
			}
		}
		return menor;
	}

	public double sueldoMaximo()
	{
		double mayor = 0;
		mayor = sueldos[0].darSueldo();
		
		for (int i = 0; i < sueldos.length; i++) 
		{
			if(sueldos[i]!=null)
			{
				if(sueldos[i].darSueldo()> mayor)
				{
					mayor = sueldos[i].darSueldo();
				}
			}
		}
		return mayor;
	}
	
	public double promedioSueldo()
	{
		double promedio = 0.0;
		
		double sumatoria = 0.0;
		
		for (int i = 0; i < sueldos.length && sueldos[i] != null ; i++) 
		{
			sumatoria = sumatoria + sueldos[i].darSueldo();
			promedio = sumatoria/numeroSueldos;
		}
		return promedio;
	}
}


