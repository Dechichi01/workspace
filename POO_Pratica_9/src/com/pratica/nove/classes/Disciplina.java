package com.pratica.nove.classes;

import java.util.Scanner;

import com.pratica.util.exceptions.SetInvalido;

public class Disciplina {
	
	private int codigo;
	private String nome;
	private int carga_horaria;
	private Curso curso;
	private Professor professor;
	
	public Disciplina(Curso c)
	{
		lerDados();
		try 
		{
			setCurso(c);
		} 
		catch (SetInvalido e) 
		{
			System.out.println(e);
			System.out.println("Curso n�o atribu�do");
		}
	}
	
	public Disciplina()
	{
		lerDados();
		Curso c = new Curso();
		c.lerDados();
		try 
		{
			setCurso(c);
		} 
		catch (SetInvalido e) 
		{
			System.out.println(e);
			System.out.println("Curso n�o atribu�do");
		}
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo)  throws SetInvalido {
		if (codigo < 0)
			 throw new SetInvalido("C�digo da disciplina");
		else
			 this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws SetInvalido {
		if (nome.equals(""))
			 throw new SetInvalido("Nome da disciplina");
		else
			 this.nome = nome;
	}

	public int getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(int carga_horaria) throws SetInvalido {
		if (carga_horaria < 0)
			 throw new SetInvalido("Carga hor�ria");
		else
			 this.carga_horaria = carga_horaria;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) throws SetInvalido {
		if (curso == null)
			 throw new SetInvalido("Curso");
		else
			 this.curso = curso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) throws SetInvalido  {
		if (professor == null)
			 throw new SetInvalido("Professor");
		else
			 this.professor = professor;
	}

	protected void lerDados()
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome da disciplina: ");
		while (true)
		{
			try 
			{
				setNome(s.nextLine());
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
				setCodigo(s.nextInt());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite a carga hor�ria da disciplina: ");
		while (true)
		{
			try 
			{
				setCarga_horaria(carga_horaria);
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
	}
	
	public void mostrarDados()
	{
		String resposta = String.format(
				"Codigo: %1d\n"
				+ "Nome: %2s\n"
				+ "Carga hor�ria: %3d\n"
				+ "\nCurso: ", 
				getCodigo(), getNome(), getCarga_horaria());
		
		System.out.println(resposta);
		curso.mostrarDados();
		System.out.println("\nProfessor: ");
		professor.mostrarDados();
	}
}
