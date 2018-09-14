package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	private String numero;
	
	public Interfaz()
	{
		
	}
	
	public int ingresarArgumento()
	{
		numero =JOptionPane.showInputDialog("Ingrese un numero:");
		int pNumero = Integer.parseInt(numero);
		
		return pNumero;
	}
	public double ingresarArgumento2()
	{
		numero = JOptionPane.showInputDialog("Ingrese el numero 2: ");
		Double pNumero = Double.parseDouble(numero);
		
		return pNumero;
	}
	
	public void mostrar(String n, String p)
	{
		JOptionPane.showMessageDialog(null, p);;
	}
}
