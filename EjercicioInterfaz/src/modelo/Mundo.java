package modelo;

public class Mundo 
{
	private Aeroplano aeroplano;
	private Pajaro pajaro;
	private Superman superman;
	private Helicoptero helicoptero;
	private HidroAvion hidro;
	
	public Mundo()
	{
		aeroplano = new Aeroplano();
		pajaro = new Pajaro();
		superman = new Superman();
		helicoptero = new Helicoptero();
		hidro = new HidroAvion();		
	}

	public Aeroplano getAeroplano() 
	{
		return aeroplano;
	}

	public void setAeroplano(Aeroplano aeroplano) 
	{
		this.aeroplano = aeroplano;
	}

	public Pajaro getPajaro() 
	{
		return pajaro;
	}

	public void setPajaro(Pajaro pajaro) 
	{
		this.pajaro = pajaro;
	}

	public Superman getSuperman()
	{
		return superman;
	}

	public void setSuperman(Superman superman) 
	{
		this.superman = superman;
	}

	public Helicoptero getHelicoptero() 
	{
		return helicoptero;
	}

	public void setHelicoptero(Helicoptero helicoptero) 
	{
		this.helicoptero = helicoptero;
	}

	public HidroAvion getHidro() 
	{
		return hidro;
	}

	public void setHidro(HidroAvion hidro) 
	{
		this.hidro = hidro;
	}
}
