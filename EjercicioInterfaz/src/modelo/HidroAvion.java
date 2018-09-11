package modelo;

public class HidroAvion extends Aeroplano
{
	private int flotadores;
	private String nombre;
	
	public HidroAvion()
	{
		nombre = "Hidro Avion";
		flotadores = 2;
		super.medioTransporte = "Aereo";
	}

	public int getFlotadores() 
	{
		return flotadores;
	}

	public void setFlotadores(int flotadores) 
	{
		this.flotadores = flotadores;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String mostrarFlotadores()
	{
		String respuesta = " ";
		
		respuesta = "\nUn hidroavion tiene: " + this.flotadores + " flotadores";
		
		return respuesta;
	}
	
	public String mostrarMedio()
	{
		String respuesta = " ";
		
		respuesta = "\nUn hidroavion es un medio de transporte: " + this.medioTransporte;
		
		return respuesta;
	}
	
	public String imprimirDatos()
	{
		String respuesta = " ";
		
		respuesta = this.getNombre() + this.mostrarFlotadores() + this.mostrarMedio();
		
		return respuesta ;
	}
}
