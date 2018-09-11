package modelo;

public abstract class Vehiculo 
{
	protected String medioTransporte;
	
	public Vehiculo()
	{
		medioTransporte = " ";
	}
	
	public abstract void configurarMedio();
	public abstract String mostrarMedio();
}
