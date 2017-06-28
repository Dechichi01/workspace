package com.pratica.oito.classes;

import java.util.Scanner;

import com.pratica.util.exceptions.SetInvalido;

public class Curso {
	
	private int codigo;
	private String nome;
	private int duracao;
	
	public Curso()
	{
		lerDados();
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) throws SetInvalido {
		if (codigo < 0)
			 throw new SetInvalido("Código");
		else
			 this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws SetInvalido {
		if (nome.equals(""))
			 throw new SetInvalido("Nome do curso");
		else
			 this.nome = nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) throws SetInvalido {
		if (duracao < 0)
			 throw new SetInvalido("Duração");
		else
			 this.duracao = duracao;
	}

	protected void lerDados()
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso: ");
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
		
		System.out.println("Digite o codigo do curso: ");
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
		
		System.out.println("Digite a duracao do curso: ");
		while (true)
		{
			try 
			{
				setDuracao(s.nextInt());
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
				+ "Duração: %3d\n", 
				getCodigo(), getNome(), getDuracao());
		
		System.out.println(resposta);
	}
}
