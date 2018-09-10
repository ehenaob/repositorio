package modelo;

public class Mundo
{
	private Canino can1;
	private Felino fel1;
	
	public Mundo()
	{
		can1=new Canino();
		fel1=new Felino();
	}

	public Canino darCan1() 
	{
		return can1;
	}

	public void cambiarCan1(Canino can1) 
	{
		this.can1 = can1;
	}

	public Felino darFel1() 
	{
		return fel1;
	}

	public void cambiarFel1(Felino fel1) 
	{
		this.fel1 = fel1;
	}
	
}
