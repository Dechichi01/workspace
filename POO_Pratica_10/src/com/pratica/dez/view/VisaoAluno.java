package com.pratica.dez.view;

import java.util.Scanner;

import com.pratica.dez.model.classes.Aluno;
import com.pratica.util.exceptions.SetInvalido;

public abstract class VisaoAluno {
	
	public static void lerDados(Aluno a)
	{				
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a matrícula do aluno: ");
		while (true)
		{
			try 
			{
				a.setMatricula(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite a situação do aluno ('M', 'T' ou 'D'): ");
		while (true)
		{
			try 
			{
				a.setSituacao(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
	}
	
	public static void mostrarDados(Aluno a)
	{
		VisaoPessoa.mostrarDados(a);
		
		String resposta = String.format(
				"Matricula: %1s\n"
				+ "Situação: %2s\n"
				+ "\nCurso:", 
				a.getMatricula(), a.getSituacao());
		
		System.out.println(resposta);
		VisaoCurso.mostrarDados(a.getCurso());
	}
	
}
