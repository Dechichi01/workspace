package com.pratica.dez.view;

import java.util.Scanner;

import com.pratica.dez.model.classes.Tecnico;
import com.pratica.util.exceptions.SetInvalido;

public abstract class VisaoTecnico {
	
	public static void lerDados(Tecnico t)
	{			
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o cargo do t�cnico: ");
		while (true)
		{
			try 
			{
				t.setCargo(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}	
		
		System.out.println("Digite o departamento do t�cnico: ");
		while (true)
		{
			try 
			{
				t.setDepartamento(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}		
	}
	
	public static void mostrarDados(Tecnico t)
	{
		VisaoFuncionario.mostrarDados(t);
		
		String resposta = String.format(
				"Cargo: %1s\n"
				+ "Departamento: %2s\n", 
				t.getCargo(), t.getDepartamento());
		
		System.out.println(resposta);
	}
}
