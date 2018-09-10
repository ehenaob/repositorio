package modelo;

public abstract class Mamifero 
{
	protected String dieta;
	protected String raza;
	protected int numeroDePatas;
	
	public Mamifero()
	{
		this.dieta="";
		this.raza="";
		this.numeroDePatas=0;
	}
	
	public abstract void configurarMamifero();
	public abstract void mostrarMamifero();
}
