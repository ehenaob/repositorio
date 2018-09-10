package modelo;

public class Felino extends Mamifero
{
	private String capacidadCaza;

	public  Felino() 
	{
		this.configurarMamifero();
	}

	public void configurarMamifero() 
	{
		super.dieta = "Carne";
		super.raza = "Leon";
		super.numeroDePatas = 4;
		this.capacidadCaza = "Alta";
	}

	public void mostrarMamifero() 
	{
		System.out.println("La raza del felino es: "+ super.raza);
		System.out.println("Se alimenta de: "+ super.dieta);
		System.out.println("Tiene "+ super.numeroDePatas +" numero de patas");
		System.out.println("Su capacidad de caza es: " + this.capacidadCaza);
	}


}
