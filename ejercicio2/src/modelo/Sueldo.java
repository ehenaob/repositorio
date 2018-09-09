package modelo;

public class Sueldo 
{
	private double sueldo;
	
	public Sueldo(double pSueldo)
	{
		sueldo = pSueldo;
	}

	public double darSueldo() 
	{
		return sueldo;
	}

	public void cambiarSueldo(double pSueldo) 
	{
		sueldo = pSueldo;
	}
}
