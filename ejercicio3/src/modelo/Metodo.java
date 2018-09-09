package modelo;

public class Metodo 
{
	public final static int CANTIDAD = 5;

	private Numero[] numeros;

	public Metodo()
	{
		numeros = new Numero[CANTIDAD];
	}

	public boolean agregarNumero(int pNumero)
	{
		boolean agregado = false;

		for (int i = 0; i < numeros.length && agregado == false; i++) 
		{
			if(numeros[i] == null)
			{
				numeros[i] = new Numero(pNumero);
				agregado = true;
			}
			else if(numeros[i] == null)
			{
				System.out.println("No se pudo agregar");
			}
		}
		return agregado;
	}

	public boolean buscarNumero(int pNumero)
	{
		boolean encontrado = false;
		
		for (int i = 0; i < numeros.length && encontrado == false; i++) 
		{
			if(numeros[i] != null && pNumero == numeros[1].darNumero())
			{
				encontrado = true;
			}
		}
		return encontrado;
	}

}
