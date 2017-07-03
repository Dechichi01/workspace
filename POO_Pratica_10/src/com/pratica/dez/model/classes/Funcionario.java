package com.pratica.dez.model.classes;

import java.util.Scanner;

import com.pratica.dez.view.VisaoFuncionario;
import com.pratica.util.exceptions.SetInvalido;

public abstract class Funcionario extends Pessoa {
	
	private static double pisoSalarial;
	private static double percentBonificacao;
	
	private String endereco;
	private String telefone;
	private String ctps;
	private double salarioBase;
	
	public Funcionario()
	{
		VisaoFuncionario.lerDados(this);
	}
	
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
			 throw new SetInvalido("Duração");
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
			System.out.println("Percentuação de bonificação deve estar entre"
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
			 throw new SetInvalido("Endereço");
		else
			 this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws SetInvalido {
		if (telefone.equals(""))
			 throw new SetInvalido("Duração");
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
			 throw new SetInvalido("Salário");
		else
			 this.salarioBase= salario;
	}
}
