package modelo;

public class Aeroplano extends Vehiculo implements Volador
{
	private String comoDespega;
	private String comoAterriza;
	private String comoVuela;
	private String tipo;
	
	public Aeroplano()
	{
		this.comoDespega = "tiene que tomar impulso en la pista";
		this.comoAterriza = "baja el tren de aterrizaje";
		this.comoVuela = "las alas le dan estabilidad";
		this.tipo = "Aeroplano";
		
		this.despegar();
		this.aterrizar();
		this.volar();
		this.configurarMedio();
		this.mostrarMedio();
	}
	
	public String despegar() 
	{
		String respuesta = " ";
		
		respuesta = "\nUn aeroplano para despegar: " + this.comoDespega;
		
		return respuesta;
	}

	public String aterrizar() 
	{
		String respuesta = " ";
		
		respuesta = "\nEste aeroplano para despegar: " + this.comoAterriza;
		
		return respuesta;
	}

	public String volar() 
	{
		String respuesta = " ";
		
		respuesta = "\nPara volar " + this.comoVuela;		
		
		return respuesta;
	}

	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}


	public void configurarMedio() 
	{
		super.medioTransporte = "Aereo";
	}

	public String mostrarMedio() 
	{
		String respuesta = " ";
		
		respuesta = "\nEste medio de transporte es: " + super.medioTransporte;
		
		return respuesta;
	}
	
	public String imprimirDatos()
	{
		String respuesta = " ";
		
		respuesta = this.getTipo() + this.despegar() + this.volar() + this.aterrizar() + this.mostrarMedio();
		
		return respuesta;
	}

}
