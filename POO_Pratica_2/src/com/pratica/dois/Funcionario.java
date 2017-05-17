package com.pratica.dois;

import java.util.Scanner;

public class Funcionario extends Pessoa {
	
	String endereco;
	String telefone;
	String ctps;
	double salario;
	
	public void lerDados()
	{
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o endere�o do funcion�rio: ");
		endereco = s.nextLine();
		
		System.out.println("Digite o telefone do funcion�rio: ");
		telefone = s.nextLine();
		
		System.out.println("Digite o CTPS do funcion�rio: ");
		ctps = s.nextLine();
		
		System.out.println("Digite o sal�rio do funcion�rio: ");
		salario = s.nextDouble();	
		
		//s.close();		
	}
	
	public void mostrarDados()
	{
		super.mostrarDados();
		
		String resposta = String.format(
				"Endere�o: %1s\n"
				+ "Telefone: %2s\n"
				+ "CTPS: %3s\n"
				+ "Sal�rio: %4$.2f", 
				endereco, telefone, ctps, salario);
		
		System.out.println(resposta);
	}

}
