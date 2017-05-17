package com.pratica.quatro;

import java.util.Scanner;

public class Disciplina {
	
	private int codigo;
	private String nome;
	private int carga_horaria;
	private Curso curso;
	private Professor professor;
	
	public int getCodigo() {
		return codigo;
	}

	public boolean setCodigo(int codigo) {
		if (codigo > 0)
		{
			this.codigo = codigo;
			return true;
		}
		
		System.out.println("Código inválido!");
		return false;
	}

	public String getNome() {
		return nome;
	}

	public boolean setNome(String nome) {
		if (nome.length() > 0)
		{
			this.nome = nome;
			return true;
		}
		
		System.out.println("Nome inválido!");
		return false;
	}

	public int getCarga_horaria() {
		return carga_horaria;
	}

	public boolean setCarga_horaria(int carga_horaria) {
		if (carga_horaria > 0)
		{
			this.carga_horaria = carga_horaria;
			return true;
		}
		
		System.out.println("Carga horária inválido!");
		return false;
	}

	public Curso getCurso() {
		return curso;
	}

	public boolean setCurso(Curso curso) {
		if (curso != null)
		{
			this.curso = curso;
			return true;
		}
		
		System.out.println("Curso inválido!");
		return false;
	}

	public Professor getProfessor() {
		return professor;
	}

	public boolean setProfessor(Professor professor) {
		if (professor != null)
		{
			this.professor = professor;
			return true;
		}
		
		System.out.println("Professor inválido!");
		return false;
	}

	public void lerDados()
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome da disciplina: ");
		while(!setNome(s.nextLine()));
		
		System.out.println("Digite o codigo da disciplina: ");
		while(!setCodigo(s.nextInt()));
		
		System.out.println("Digite a carga horária da disciplina: ");
		while(!setCarga_horaria(s.nextInt()));
	}
	
	public void mostrarDados()
	{
		String resposta = String.format(
				"Codigo: %1d\n"
				+ "Nome: %2s\n"
				+ "Carga horária: %3d\n"
				+ "\nCurso: ", 
				getCodigo(), getNome(), getCarga_horaria());
		
		System.out.println(resposta);
		curso.mostrarDados();
		System.out.println("\nProfessor: ");
		professor.mostrarDados();
	}
}
