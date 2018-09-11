package modelo;

public abstract class Animal 
{
	protected String come;
	
	public Animal()
	{
		this.come = " ";
	}
	
	public abstract void configurarComida();
	public abstract String mostrarQueCome();
}
