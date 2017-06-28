package com.pratica.dez.view;

import java.util.Scanner;

import com.pratica.dez.model.classes.Pessoa;
import com.pratica.util.exceptions.SetInvalido;

public abstract class VisaoPessoa {
	
	public static void lerDados(Pessoa p)
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa: ");
		while (true)
		{
			try 
			{
				p.setNome(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite o CPF da pessoa: ");
		while (true)
		{
			try 
			{
				p.setCpf(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}	
	}
	
	public static void mostrarDados(Pessoa p)
	{
		String resposta = String.format(
				"Nome: %1s\n"
				+ "CPF: %2s\n", 
				p.getNome(), p.getCpf());
		
		System.out.println(resposta);
	}
}
