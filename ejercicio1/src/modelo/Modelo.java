package modelo;

public class Modelo 
{
	String[] unidades = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
	String[] diez = {"diez","once","doce","trece","catorce","quince","dieciséis","diecisiete","dieciocho","diecinueve"};
	String[] veinte = {"veinte", "veintiuno","veintidos","veintitres","venticuatro","veinticinco","veintiseis","veintisiete","veintiocho","veintinueve"};
	String[] decenas = {"","","","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
		
	public Modelo()
	{

	}
	
	public String darMonto(int pNumero)
	
		{
			int operacion =(int)(pNumero*10/100);
			
			switch (operacion)
			{
			case 0:
				return unidades[pNumero];
			case 1:
				return diez[pNumero-10];
			case 2:
				return veinte[pNumero-20];	
			default:
				break;
		}
		
		if (operacion>=3)
		{
			int monto = (pNumero%10);
			return decenas[operacion]+" y "+unidades[monto];
		}
		else
		{
			return "";
		}
		
	}
}