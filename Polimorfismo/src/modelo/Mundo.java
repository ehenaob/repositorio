package modelo;

public class Mundo 
{
	public Mundo()
	{
		
	}
	
	public String hacerSobrecarga() 
	{
		return "Sobrecarga solita";
	}
	public String hacerSobrecarga(int argumento)
	{
		return "Sobrecarga "+ argumento +" un parametro tipo entero";
	}
	public String hacerSobrecarga(int argumento1, double argumento2)
	{
		return "Sobrecarga "+ argumento1 + " " + "y " + argumento2 + " argumento tipo entero y argumento tipo double";
	}
}
