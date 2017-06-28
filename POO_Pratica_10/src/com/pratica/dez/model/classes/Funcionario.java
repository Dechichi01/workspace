package com.pratica.dez.model.classes;

import java.util.Scanner;

import com.pratica.util.exceptions.SetInvalido;

public abstract class Funcionario extends Pessoa {
	
	private static double pisoSalarial;
	private static double percentBonificacao;
	
	private String endereco;
	private String telefone;
	private String ctps;
	private double salarioBase;
	
	public double calcSalario()
	{
		return getSalarioBase() + calculaBonificacao();
	}
	
	public double calculaBonificacao()
	{
		return salarioBase*percentBonificacao;
	}
	
	public static double getPisoSalarial()
	{
		return pisoSalarial;
	}
	
	public static void setPisoSalarial(double valorPiso) throws SetInvalido
	{
		if (valorPiso < 0)
			 throw new SetInvalido("Dura��o");
		else
			 pisoSalarial = valorPiso;
	}
	
	public static double getPercentBonificacao()
	{
		return percentBonificacao;
	}
	
	public static void setPercentBonificacao(double percent)
	{
		if (percent < 0 || percent > 1)
		{
			System.out.println("Percentua��o de bonifica��o deve estar entre"
					+ " 0 e 1. Clamping...");
			percent = Math.max(0, Math.min(1, percent));
		}
		
		percentBonificacao = percent;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) throws SetInvalido 
	{
		if (endereco.equals(""))
			 throw new SetInvalido("Endere�o");
		else
			 this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws SetInvalido {
		if (telefone.equals(""))
			 throw new SetInvalido("Dura��o");
		else
			 this.telefone = telefone;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) throws SetInvalido {
		if (ctps.equals(""))
			 throw new SetInvalido("CTPS");
		else
			 this.ctps = ctps;
	}

	protected double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salario) throws SetInvalido {
		if (salario < pisoSalarial)
			 throw new SetInvalido("Sal�rio");
		else
			 this.salarioBase= salario;
	}

	protected void lerDados()
	{
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o endere�o do funcion�rio: ");
		while (true)
		{
			try 
			{
				setEndereco(s.nextLine());
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
				setTelefone(s.nextLine());
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
				setCtps(s.nextLine());
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
				setSalarioBase(s.nextDouble());
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
				"Endere�o: %1s\n"
				+ "Telefone: %2s\n"
				+ "CTPS: %3s\n"
				+ "Sal�rio: R$%.2f\n", 
				getEndereco(), getTelefone(), getCtps(), calcSalario());
		
		System.out.println(resposta);
	}

}
