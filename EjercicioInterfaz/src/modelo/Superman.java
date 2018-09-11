package modelo;

public class Superman extends Kryptoniano implements Volador
{
	private String nombre;
	private String comoDespega;
	private String comoAterriza;
	private String comoVuela;
	
	public Superman()
	{
		this.nombre = "Superman";
		this.comoDespega = "Me agacho y salto";
		this.comoAterriza = "Doblo las rodillas";
		this.comoVuela = "Utilizo mi capa";
		
		this.despegar();
		this.aterrizar();
		this.volar();
		this.configurarDebilidad();
		this.configurarComida();
		this.mostrarDebilidad();
		this.mostrarQueCome();
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void configurarComida() 
	{
		super.come = "Comida humana";
	}
	
	public void configurarDebilidad() 
	{
		super.debilidad = "Kryptonina";
	}
	
	public String despegar() 
	{
		String respuesta = " ";
		
		respuesta = "\nPara despegar yo: " + this.comoDespega;
		
		return respuesta;
	}
	public String aterrizar() 
	{
		String respuesta = " ";
		
		respuesta = "\nPara aterrizar yo: " + this.comoAterriza;
		
		return respuesta;
	}
	public String volar() 
	{
		String respuesta = " ";
		
		return respuesta = "\nPara volar yo: " + this.comoVuela;
		
	}
	public String mostrarDebilidad() 
	{
		String respuesta = " ";
	
		respuesta = "\nMi debilidad es la: " + super.debilidad;
		
		return respuesta;
	}
	public String mostrarQueCome() 
	{
		String respuesta = " ";
		
		respuesta = "\nYo como: " + super.come;
		
		return respuesta;
	}
	
	public String saltarEdificios()
	{
		String respuesta = " ";
		
		respuesta = "\nPuedo saltar entre edificios";
		
		return respuesta;
	}
	
	public String detenerBalas()
	{
		String respuesta = " ";
		
		respuesta = "\nPuedo deter las balas con poderes mentales";
		
		return respuesta;
	}
	
	
	public String imprimirDatos()
	{
		String imprimir = " ";
		
		imprimir = this.getNombre() + this.despegar() + this.volar() + this.aterrizar() + this.mostrarDebilidad() + this.mostrarQueCome() + this.saltarEdificios() + this.detenerBalas();
		
		return imprimir;
	}
}
