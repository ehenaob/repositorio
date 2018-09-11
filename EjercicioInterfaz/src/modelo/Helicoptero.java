package modelo;

public class Helicoptero extends Aeroplano
{
	private int helices;
	private String nombre;
	
	public Helicoptero()
	{
		this.nombre = "Helicoptero";
		this.helices = 2;
		super.medioTransporte = "Aereo";
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getHelices() 
	{
		return helices;
	}

	public void setHelices(int helices) 
	{
		this.helices = helices;
	}
	
	public String mostrarHelices()
	{
		String respuesta = " ";
		
		respuesta = "\nUn helicoptero tiene: " + this.getHelices() + " helices";
		
		return respuesta;
	}
	
	public String mostrarMedio()
	{
		String respuesta = " ";
		
		respuesta = "\nUn helicoptero es un medio de transporte " + this.medioTransporte;
		
		return respuesta;
	}
	
	public String imprimirDatos()
	{
		String respuesta = " ";
		
		respuesta = this.getNombre() + this.mostrarHelices() + this.mostrarMedio();
		
		return respuesta ;
	}
}
