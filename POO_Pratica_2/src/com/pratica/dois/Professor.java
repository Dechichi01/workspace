package com.pratica.dois;

import java.util.Scanner;

public class Professor extends Funcionario {
	
	String titulacao;
	String areaPesquisa;
	
	public void lerDados()
	{		
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a titulacao do professor: ");
		titulacao = s.nextLine();
		
		System.out.println("Digite a �rea de pesquisa do professor: ");
		areaPesquisa = s.nextLine();
		
		//s.close();		
	}
	
	public void mostrarDados()
	{
		super.mostrarDados();
		
		String resposta = String.format(
				"Titula��o: %1s\n"
				+ "�rea de pesquisa: %2s\n", 
				titulacao, areaPesquisa);
		
		System.out.println(resposta);
	}
}
