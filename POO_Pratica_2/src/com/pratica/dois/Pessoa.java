package com.pratica.dois;

import java.util.Scanner;

public class Pessoa {
	
	protected String nome;
	protected String cpf;
	
	public void lerDados()
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa: ");
		nome = s.nextLine();
		
		System.out.println("Digite o CPF da pessoa: ");
		cpf = s.nextLine();		
	}
	
	public void mostrarDados()
	{
		String resposta = String.format(
				"Nome: %1s\n"
				+ "CPF: %2s\n", 
				nome, cpf);
		
		System.out.println(resposta);
	}
}
