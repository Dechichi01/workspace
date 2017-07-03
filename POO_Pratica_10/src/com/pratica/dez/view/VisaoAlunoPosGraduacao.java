package com.pratica.dez.view;

import java.util.Scanner;

import com.pratica.dez.model.classes.AlunoPosGraduacao;
import com.pratica.util.exceptions.SetInvalido;

public abstract class VisaoAlunoPosGraduacao extends VisaoAluno {
	
	public static void lerDados(AlunoPosGraduacao aPos)
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a gradua��o do aluno de p�s: ");
		while (true)
		{
			try 
			{
				aPos.setGraduacao(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite a instituicao de gradua��o: ");
		while (true)
		{
			try 
			{
				aPos.setInstituicao(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite a data de inicio de gradua��o (yyyy-mm-dd): ");
		while (true)
		{
			try 
			{
				aPos.setInicioGraduacao(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
			catch (IllegalArgumentException e)
			{
				System.out.println("Data inv�lida. Tente novamente");
			}
		}
		
		System.out.println("Digite a data de t�rmino de gradua��o (yyyy-mm-dd): ");
		while (true)
		{
			try 
			{
				aPos.setFimGraduacao(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
			catch (IllegalArgumentException e)
			{
				System.out.println("Data inv�lida. Tente novamente");
			}
		}
	}
	
	public static void mostrarDados(AlunoPosGraduacao aPos)
	{	
		VisaoAluno.mostrarDados(aPos);
		
		String resposta = String.format(
				"Graduado em: %1s\n"
				+ "Institui��o: %2s\n"
				+ "In�cio Gradua��o: %3s\n"
				+ "T�rmino Gradua��o: %4s\n"
				+ "\nCurso de P�s gradua��o:", 
				aPos.getGraduacao(), aPos.getInstituicao(), aPos.getInicioGraduacao(), aPos.getFimGraduacao());
		
		System.out.println(resposta);
		if (aPos.getCursoPos() != null)
		{
			VisaoCurso.mostrarDados(aPos.getCursoPos());
		}
	}
	
}
