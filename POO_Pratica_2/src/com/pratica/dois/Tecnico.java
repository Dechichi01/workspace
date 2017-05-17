package com.pratica.dois;

import java.util.Scanner;

public class Tecnico extends Funcionario {
	
	String cargo;
	String departamento;
	
	public void lerDados()
	{		
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o cargo do técnico: ");
		cargo = s.nextLine();
		
		System.out.println("Digite o departamento do técnico: ");
		departamento = s.nextLine();
		
		//s.close();		
	}
	
	public void mostrarDados()
	{
		super.mostrarDados();
		
		String resposta = String.format(
				"Cargo: %1s\n"
				+ "Departamento: %2s\n", 
				cargo, departamento);
		
		System.out.println(resposta);
	}
}
