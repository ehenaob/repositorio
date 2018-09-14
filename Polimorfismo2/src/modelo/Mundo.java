package modelo;

public class Mundo 
{
	private Alumno alumno;
	private Profesor profesor;
	private Persona persona;
	
	private Persona personas[];
	
	public Mundo()
	{
		persona = new Persona();
		profesor = new Profesor();
		alumno = new Alumno();
		
		
		personas = new Persona[3];
		
		personas[0] = new Persona();
		personas[1] = new Alumno();
		personas[2] = new Profesor();
	}

	public Alumno getAlumno() 
	{
		return alumno;
	}

	public void setAlumno(Alumno alumno) 
	{
		this.alumno = alumno;
	}

	public Profesor getProfesor() 
	{
		return profesor;
	}

	public void setProfesor(Profesor profesor) 
	{
		this.profesor = profesor;
	}

	public Persona getPersona() 
	{
		return persona;
	}

	public void setPersona(Persona persona) 
	{
		this.persona = persona;
	}
	
	public String crearLinea()
	{
		String linea = " ";
		
		for (int i = 0; i < personas.length; i++) 
		{
			linea = linea + personas[i].toString() + "\n" ;
		}
		
		return linea;	
	}
}
