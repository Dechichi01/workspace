package com.pratica.dez.view;

import java.util.Scanner;

import com.pratica.dez.model.classes.Disciplina;
import com.pratica.util.exceptions.SetInvalido;

public abstract class VisaoDisciplina {
	
	public static void lerDados(Disciplina d)
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome da disciplina: ");
		while (true)
		{
			try 
			{
				d.setNome(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite o codigo da disciplina: ");
		while (true)
		{
			try 
			{
				d.setCodigo(s.nextInt());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite a carga horária da disciplina: ");
		while (true)
		{
			try 
			{
				d.setCarga_horaria(d.getCarga_horaria());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
	}
	
	public static void mostrarDados(Disciplina d)
	{
		String resposta = String.format(
				"Codigo: %1d\n"
				+ "Nome: %2s\n"
				+ "Carga horária: %3d\n"
				+ "\nCurso: ", 
				d.getCodigo(), d.getNome(), d.getCarga_horaria());
		
		System.out.println(resposta);
		VisaoCurso.mostrarDados(d.getCurso());
		System.out.println("\nProfessor: ");
		VisaoProfessor.mostrarDados(d.getProfessor());
	}
}
