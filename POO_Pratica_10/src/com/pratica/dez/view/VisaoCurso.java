package com.pratica.dez.view;

import java.util.Scanner;

import com.pratica.dez.model.classes.Curso;
import com.pratica.util.exceptions.SetInvalido;

public abstract class VisaoCurso {
	
	public static void lerDados(Curso c)
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso: ");
		while (true)
		{
			try 
			{
				c.setNome(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite o codigo do curso: ");
		while (true)
		{
			try 
			{
				c.setCodigo(s.nextInt());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite a duracao do curso: ");
		while (true)
		{
			try 
			{
				c.setDuracao(s.nextInt());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}		
	}
	
	public static void mostrarDados(Curso c)
	{
		String resposta = String.format(
				"Codigo: %1d\n"
				+ "Nome: %2s\n"
				+ "Duração: %3d\n", 
				c.getCodigo(), c.getNome(), c.getDuracao());
		
		System.out.println(resposta);
	}
}
