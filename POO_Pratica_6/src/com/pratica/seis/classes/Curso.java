package com.pratica.seis.classes;

import java.util.Scanner;

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

	public int getDuracao() {
		return duracao;
	}

	public boolean setDuracao(int duracao) {
		if (duracao > 0)
		{
			this.duracao = duracao;
			return true;
		}
		
		System.out.println("Duração inválido!");
		return false;
	}

	protected void lerDados()
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso: ");
		while(!setNome(s.nextLine()));
		
		System.out.println("Digite o codigo do curso: ");
		while(!setCodigo(s.nextInt()));
		
		System.out.println("Digite a duracao do curso: ");
		while(!setDuracao(s.nextInt()));		
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
