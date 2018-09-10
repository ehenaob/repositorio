package modelo;

public class Canino extends Mamifero
{
	private String fidelidad;
	
	public  Canino() 
	{
		this.configurarMamifero();
	}

	public void configurarMamifero() 
	{
		super.dieta = "Purina";
		super.raza = "Pastor Belga";
		super.numeroDePatas = 4;
		this.fidelidad = "Alta";
	}

	public void mostrarMamifero() 
	{
		System.out.println("La raza del canino es: " + super.raza);
		System.out.println("Se alimenta de: " + super.dieta);
		System.out.println("Tiene " + super.numeroDePatas + " numero de patas");
		System.out.println("Su olfato es "+this.fidelidad);
	}

}
