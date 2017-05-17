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
		
		System.out.println("Digite o endereço do funcionário: ");
		endereco = s.nextLine();
		
		System.out.println("Digite o telefone do funcionário: ");
		telefone = s.nextLine();
		
		System.out.println("Digite o CTPS do funcionário: ");
		ctps = s.nextLine();
		
		System.out.println("Digite o salário do funcionário: ");
		salario = s.nextDouble();	
		
		//s.close();		
	}
	
	public void mostrarDados()
	{
		super.mostrarDados();
		
		String resposta = String.format(
				"Endereço: %1s\n"
				+ "Telefone: %2s\n"
				+ "CTPS: %3s\n"
				+ "Salário: %4$.2f", 
				endereco, telefone, ctps, salario);
		
		System.out.println(resposta);
	}

}
