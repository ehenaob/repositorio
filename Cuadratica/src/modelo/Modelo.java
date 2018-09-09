package modelo;

public class Modelo
{
	private double a;
	private double b;
	private double c;

	private double denominador1;

	public Modelo()
	{
	}

	public void denominador(double pA, double pB, double pC) throws AigualA0, RaizNegativa
	{
		a = pA;
		b = pB;
		c = pC;

		if(pA == 0)
		{
			throw new AigualA0();
		}
		else 
		{
			denominador1 = 2*pA;
		}
		
		double raiz = (b*b)-4*a*c;
		String respuesta = " ";

		if(raiz < 0)
		{
			throw new RaizNegativa();
		}
		else
		{
			double X1 = (-b + Math.sqrt(raiz))/this.denominador1;
			double X2 = (-b - Math.sqrt(raiz))/this.denominador1;	

			System.out.println("El resultado de x1 es = " + X1 + " Y el resultado de x2 es: " + X2 );
		}

	}



}
