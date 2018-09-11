package modelo;

public abstract class Kryptoniano extends Animal
{
	protected String debilidad;
	
	public Kryptoniano()
	{
		debilidad = " ";
	}
	
	public abstract void configurarDebilidad();
	public abstract String mostrarDebilidad();
}
