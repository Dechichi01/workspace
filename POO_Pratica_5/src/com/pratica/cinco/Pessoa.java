package com.pratica.cinco;

import java.util.Scanner;

import com.pratica.util.Verificador;

public class Pessoa {
	
	private String nome;
	private String cpf;
	
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

	public String getCpf() {
		return cpf;
	}

	public boolean setCpf(String cpf) {
		if (Verificador.CPFValido(cpf))
		{
			this.cpf = cpf;
			return true;
		}
		
		System.out.println("CPF inválido!");
		return false;
	}

	public void lerDados()
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa: ");
		while(!setNome(s.nextLine()));
		
		System.out.println("Digite o CPF da pessoa: ");
		while(!setCpf(s.nextLine()));	
	}
	
	public void mostrarDados()
	{
		String resposta = String.format(
				"Nome: %1s\n"
				+ "CPF: %2s\n", 
				getNome(), getCpf());
		
		System.out.println(resposta);
	}
}
