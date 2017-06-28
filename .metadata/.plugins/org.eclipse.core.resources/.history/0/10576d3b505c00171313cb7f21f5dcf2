package com.pratica.oito.classes;

import java.util.Scanner;

import com.pratica.util.exceptions.SetInvalido;

public class Aluno extends Pessoa {
	
	private String matricula;
	private Curso curso;
	private byte situacao;
	
	public Aluno(Curso c)
	{
		super();
		try 
		{
			setCurso(c);
		} 
		catch (SetInvalido e) 
		{
			System.out.println(e);
			System.out.println("Curso não atribuído");
		}
	}
	
	public Aluno()
	{
		super();
		Curso c = new Curso();
		try 
		{
			setCurso(c);
		} 
		catch (SetInvalido e) 
		{
			System.out.println(e);
			System.out.println("Curso não atribuído");
		}
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) throws SetInvalido {
		if (matricula.equals("") )
			 throw new SetInvalido("Matrícula");
		else
			 this.matricula = matricula;
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

	public String getSituacao() {
		String[] situacaoRespostas= new String[] { 
				"Não indicado", "Matriculado", "Trancado", "Desligado" };
		
		if (situacao > situacaoRespostas.length - 1)
		{
			situacao = 0;
		}
		
		return situacaoRespostas[situacao];
	}

	public void setSituacao(char situacao) throws SetInvalido {
		char[] situacaoSiglas = new char[] { 'M', 'T', 'D'};
		this.situacao = 0;
		for (int i = 0; i < situacaoSiglas.length; i++)
		{
			if (situacaoSiglas[i] == situacao)
			{
				this.situacao = (byte) (i+1);
				return;
			}
		}
		
		throw new SetInvalido("Situação");
	}
	
	public void setSituacao(String situacao) throws SetInvalido
	{
		if (situacao.equals(""))
			 throw new SetInvalido("Situação");
		else
			 setSituacao(situacao.charAt(0));		
	}

	protected void lerDados()
	{		
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a matrícula do aluno: ");
		while (true)
		{
			try 
			{
				setMatricula(s.nextLine());
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
				setSituacao(s.nextLine());
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
		super.mostrarDados();
		
		String resposta = String.format(
				"Matricula: %1s\n"
				+ "Situação: %2s\n"
				+ "\nCurso:", 
				getMatricula(), getSituacao());
		
		System.out.println(resposta);
		curso.mostrarDados();
	}
	
}
