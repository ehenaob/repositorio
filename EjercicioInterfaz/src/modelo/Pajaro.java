package modelo;

public class Pajaro extends Animal implements Volador
{
	private String crearNido;
	private int ponerHuevos;
	private String raza;
	private String comoDespega;
	private String comoAterriza;
	private String comoVuela;
	
	public Pajaro()
	{
		this.raza = "perico";
		this.ponerHuevos = 2;
		this.crearNido = "sobre los arboles";
		this.comoDespega = "Abro mis alitas";
		this.comoAterriza = "Me guardo las alitas";
		this.comoVuela = "planeo";
		
		this.despegar();
		this.aterrizar();
		this.volar();
		this.configurarComida();
		this.mostrarQueCome();
	}
	
	public String getRaza() 
	{
		return raza;
	}

	public void setRaza(String raza) 
	{
		this.raza = raza;
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
		
		respuesta = "\nPara volar yo: " + this.comoVuela;
		
		return respuesta;
	}

	public void configurarComida() 
	{
		super.come = "Gusanos";
	}

	public String mostrarQueCome() 
	{
		String respuesta = " ";
		
		respuesta = "\nYo me alimento de: " + super.come;
		
		return respuesta;	
	}
	
	public String construirNido()
	{
		String respuesta = " ";
		
		respuesta = "\nYo construyo mi nido: " + this.crearNido;
		
		return respuesta;
	}
	
	public String ponerHuevos()
	{
		String respuesta = " ";
		
		respuesta = "\nYo puedo poner: " + this.ponerHuevos + " huevos cada 2 meses";
		
		return respuesta;
	}
	
	public String imprimirDatos()
	{
		String imprimir = " ";
		
		imprimir = this.getRaza() + this.despegar() + this.volar() + this.aterrizar()  + this.mostrarQueCome() + this.ponerHuevos() + this.construirNido();
		
		return imprimir;
	}

}
