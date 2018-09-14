package vista;

import javax.swing.JOptionPane;

public class Interfaz
{	
	public Interfaz()
	{
		
	}
	
	public void imprimir(String linea)
	{
		JOptionPane.showMessageDialog(null, linea, "Polimorfismo", JOptionPane.INFORMATION_MESSAGE);
	}
}
