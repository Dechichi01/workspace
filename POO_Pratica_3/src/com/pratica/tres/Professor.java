package com.pratica.tres;

import java.util.Scanner;

public class Professor extends Funcionario {
	
	private String titulacao;
	private String areaPesquisa;
	
	public String getTitulacao() {
		return titulacao;
	}

	public boolean setTitulacao(String titulacao) {
		if (titulacao.length() > 0)
		{
			this.titulacao = titulacao;
			return true;
		}
		
		System.out.println("Titulação inválido!");
		return false;
	}

	public String getAreaPesquisa() {
		return areaPesquisa;
	}

	public boolean setAreaPesquisa(String areaPesquisa) {
		if (areaPesquisa.length() > 0)
		{
			this.areaPesquisa = areaPesquisa;
			return true;
		}
		
		System.out.println("Área de pesquisa inválido!");
		return false;
	}

	public void lerDados()
	{		
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a titulacao do professor: ");
		while(!setTitulacao(s.nextLine()));
		
		System.out.println("Digite a área de pesquisa do professor: ");
		while(!setAreaPesquisa(s.nextLine()));	
	}
	
	public void mostrarDados()
	{
		super.mostrarDados();
		
		String resposta = String.format(
				"Titulação: %1s\n"
				+ "Área de pesquisa: %2s\n", 
				getTitulacao(), getAreaPesquisa());
		
		System.out.println(resposta);
	}
}
