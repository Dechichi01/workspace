package com.pratica.um;

import java.util.Scanner;

public class Curso {
	
	int codigo;
	String nome;
	int duracao;
	
	public void lerDados()
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso: ");
		nome = s.nextLine();
		
		System.out.println("Digite o codigo do curso: ");
		codigo = s.nextInt();
		
		System.out.println("Digite a duracao do curso: ");
		duracao = s.nextInt();
		
		//s.close();		
	}
	
	public void mostrarDados()
	{
		String resposta = String.format(
				"Curso:\n"
				+ "Codigo: %1d\n"
				+ "Nome: %2s\n"
				+ "Duração: %3d\n", 
				codigo, nome, duracao);
		
		System.out.println(resposta);
	}
}
