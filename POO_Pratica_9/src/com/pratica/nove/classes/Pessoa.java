package com.pratica.nove.classes;

import java.util.Scanner;

import com.pratica.util.Verificador;
import com.pratica.util.exceptions.SetInvalido;

public class Pessoa {
	
	private String nome;
	private String cpf;
	
	public Pessoa()
	{
		lerDados();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws SetInvalido{
		if (nome.equals(""))
			 throw new SetInvalido("Nome");
		else
			 this.nome =nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws SetInvalido {
		if (!Verificador.CPFValido(cpf))
			 throw new SetInvalido("CPF");
		else
			 this.cpf = cpf;
	}

	protected void lerDados()
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa: ");
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
		
		System.out.println("Digite o CPF da pessoa: ");
		while (true)
		{
			try 
			{
				setCpf(s.nextLine());
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
				"Nome: %1s\n"
				+ "CPF: %2s\n", 
				getNome(), getCpf());
		
		System.out.println(resposta);
	}
}
