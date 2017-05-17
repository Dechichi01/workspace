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
		
		System.out.println("Titula��o inv�lido!");
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
		
		System.out.println("�rea de pesquisa inv�lido!");
		return false;
	}

	public void lerDados()
	{		
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a titulacao do professor: ");
		while(!setTitulacao(s.nextLine()));
		
		System.out.println("Digite a �rea de pesquisa do professor: ");
		while(!setAreaPesquisa(s.nextLine()));	
	}
	
	public void mostrarDados()
	{
		super.mostrarDados();
		
		String resposta = String.format(
				"Titula��o: %1s\n"
				+ "�rea de pesquisa: %2s\n", 
				getTitulacao(), getAreaPesquisa());
		
		System.out.println(resposta);
	}
}
