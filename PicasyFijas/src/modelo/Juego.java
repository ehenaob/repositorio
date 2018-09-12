package modelo;

public class Juego 
{
	private int n1;
	private int n2;
	private int n3;
	private int n4;
	

	public Juego()
	{
		this.n1 = 3;
		this.n2 = 8;
		this.n3 = 1;
		this.n4 = 4;
	}
	
	public String picasOfijas(int nd1, int nd2, int nd3,int nd4)
	{
		int picas = 0;
		int fijas = 0;

		if ((n1 == nd1) && (n2 == nd2) && (n3 == nd3) && (n4 == nd4))
		{
			return ("TIENE 4 FIJAS, ganó");
		}
		else 
		{
			if(n1 == nd1)
			{
				fijas = fijas + 1;
			}
			if(n2 == nd2)
			{
				fijas = fijas + 1;
			}
			if(n3 == nd3)
			{
				fijas = fijas + 1;
			}
			if(n4 == nd4)
			{
				fijas = fijas + 1 ;
			}
			if((n1 == nd2) || (n1 == nd3) || (n1 == nd4))
			{
				picas = picas + 1;
			}
			if((n2 == nd1) || (n2 == nd3) || (n2 == nd4))
			{
				picas = picas + 1;
			}
			if((n3 == nd1) || (n3 == nd2) || (n3 == nd4))
			{
				picas = picas + 1;
			}
			if((n4 == nd1) || (n4 == nd2) || (n4 == nd3))
			{
				picas = picas + 1;
			}
		}
		return ("Picas " + picas + " Fijas " + fijas);
	}




}
