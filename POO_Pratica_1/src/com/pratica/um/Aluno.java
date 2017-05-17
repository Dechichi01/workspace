package com.pratica.um;

import java.util.Scanner;

public class Aluno {
	
	String nome;
	String matricula;
	String cpf;
	Curso curso;
	
	public void lerDados()
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		nome = s.nextLine();
		
		System.out.println("Digite a matrícula do aluno: ");
		matricula = s.nextLine();
		
		System.out.println("Digite o CPF do aluno: ");
		cpf = s.nextLine();
		
		//s.close();
		
		curso = new Curso();
		
		curso.lerDados();		
	}
	
	public void mostrarDados()
	{
		String resposta = String.format(
				"Aluno:\n"
				+ "Nome: %1s\n"
				+ "Matricula: %2s\n"
				+ "CPF: %3s\n"
				+ "Curso:\n", 
				nome, matricula, cpf);
		
		System.out.println(resposta);
		curso.mostrarDados();
	}
	
}
