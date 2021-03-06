package com.pratica.dois;

import java.util.Scanner;

public class Aluno extends Pessoa {
	
	String matricula;
	Curso curso;
	
	public void lerDados()
	{		
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a matrícula do aluno: ");
		matricula = s.nextLine();
		
		curso = new Curso();
		
		curso.lerDados();		
	}
	
	public void mostrarDados()
	{
		super.mostrarDados();
		
		String resposta = String.format(
				"Matricula: %1s\n"
				+ "\nCurso:", 
				matricula);
		
		System.out.println(resposta);
		curso.mostrarDados();
	}
	
}
