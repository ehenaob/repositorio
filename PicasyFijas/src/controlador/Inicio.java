package controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import modelo.Juego;

public class Inicio 
{
	public static void main(String[]args)throws IOException 
	{
		Juego pF = new Juego();
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

		int n1;
		int n2;
		int n3;
		int n4;

			System.out.println("Ingrese numero 1: ");
			n1 = Integer.parseInt(lectura.readLine());
			
			System.out.println("Ingrese numero 2: ");
			n2 = Integer.parseInt(lectura.readLine());
			
			System.out.println("Ingrese numero 3: ");
			n3 = Integer.parseInt(lectura.readLine());
			
			System.out.println("Ingrese numero 4: ");
			n4 = Integer.parseInt(lectura.readLine());
			
			System.out.println(pF.picasOfijas(n1, n2, n3,n4));

		
	}

}
