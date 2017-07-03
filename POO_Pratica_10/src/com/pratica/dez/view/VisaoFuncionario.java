package com.pratica.dez.view;

import java.util.Scanner;

import com.pratica.dez.model.classes.Funcionario;
import com.pratica.util.exceptions.SetInvalido;

public abstract class VisaoFuncionario {

	public static void lerDados(Funcionario f)
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o endere�o do funcion�rio: ");
		while (true)
		{
			try 
			{
				f.setEndereco(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite o telefone do funcion�rio: ");
		while (true)
		{
			try 
			{
				f.setTelefone(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite o CTPS do funcion�rio: ");
		while (true)
		{
			try 
			{
				f.setCtps(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite o Sal�rio Base do funcion�rio: ");
		while (true)
		{
			try 
			{
				f.setSalarioBase(s.nextDouble());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
	}
	
	public static void mostrarDados(Funcionario f)
	{
		VisaoPessoa.mostrarDados(f);
		
		String resposta = String.format(
				"Endere�o: %1s\n"
				+ "Telefone: %2s\n"
				+ "CTPS: %3s\n"
				+ "Sal�rio: R$%.2f\n", 
				f.getEndereco(), f.getTelefone(), f.getCtps(), f.calcSalario());
		
		System.out.println(resposta);
	}

}
