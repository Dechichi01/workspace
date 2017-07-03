package com.pratica.dez.view;

import java.util.Scanner;

import com.pratica.dez.model.classes.Professor;
import com.pratica.util.exceptions.SetInvalido;

public abstract class VisaoProfessor {
	
	public static void lerDados(Professor p)
	{				
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a titulacao do professor: ");
		while (true)
		{
			try 
			{
				p.setTitulacao(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite a área de pesquisa do professor: ");
		while (true)
		{
			try 
			{
				p.setAreaPesquisa(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}	
		
		System.out.println("Digite o Valor Dedicação Exclusiva do professor: ");
		while (true)
		{
			try 
			{
				p.setValorDedicacaoExclusiva(s.nextFloat());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite a Retribuição a titulação do professor: ");
		while (true)
		{
			try 
			{
				p.setRetribTitulacao(s.nextFloat());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
	}
	
	public static void mostrarDados(Professor p)
	{
		VisaoFuncionario.mostrarDados(p);
		
		String resposta = String.format(
				"Titulação: %1s\n"
				+ "Área de pesquisa: %2s\n", 
				p.getTitulacao(), p.getAreaPesquisa());
		
		System.out.println(resposta);
	}
	
}
