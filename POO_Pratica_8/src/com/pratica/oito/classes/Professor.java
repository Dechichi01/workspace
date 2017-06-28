package com.pratica.oito.classes;

import java.util.Scanner;

import com.pratica.util.exceptions.SetInvalido;

public class Professor extends Funcionario {
	
	private static double valorHoraAula;
	
	private String titulacao;
	private String areaPesquisa;
	private float valorDedicacaoExclusiva;
	private float retribTitulacao;
	
	public static double getValorHoraAula()
	{
		return valorHoraAula;
	}
	
	public static void setValorHoraAula(double valor) throws SetInvalido 
	{
		if (valor < 0)
			 throw new SetInvalido("Valor hora aula");
		else
			 valorHoraAula = valor;
	}
	
	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) throws SetInvalido {
		if (titulacao.equals(""))
			 throw new SetInvalido("Titula��o");
		else
			 this.titulacao = titulacao;	
	}

	public String getAreaPesquisa() {
		return areaPesquisa;
	}

	public void setAreaPesquisa(String areaPesquisa) throws SetInvalido {
		if (areaPesquisa.equals(""))
			 throw new SetInvalido("�rea de Pesquisa");
		else
			 this.areaPesquisa = areaPesquisa;
	}
	
	public float getValorDedicacaoExclusiva() {
		return valorDedicacaoExclusiva;
	}

	public void setValorDedicacaoExclusiva(float valorDedicacaoExclusiva) throws SetInvalido {
		if (valorDedicacaoExclusiva <= 0)
			 throw new SetInvalido("Valor dedica��o exclusiva");
		else
			 this.valorDedicacaoExclusiva = valorDedicacaoExclusiva;
	}

	public float getRetribTitulacao() {
		return retribTitulacao;
	}

	public void setRetribTitulacao(float retribTitulacao) throws SetInvalido {
		if (retribTitulacao <= 0)
			 throw new SetInvalido("Retribui��o a titula��o");
		else
			 this.retribTitulacao = retribTitulacao;
	}

	protected void lerDados()
	{		
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a titulacao do professor: ");
		while (true)
		{
			try 
			{
				setTitulacao(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite a �rea de pesquisa do professor: ");
		while (true)
		{
			try 
			{
				setAreaPesquisa(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}	
		
		System.out.println("Digite o Valor Dedica��o Exclusiva do professor: ");
		while (true)
		{
			try 
			{
				setValorDedicacaoExclusiva(s.nextFloat());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite a Retribui��o a titula��o do professor: ");
		while (true)
		{
			try 
			{
				setRetribTitulacao(s.nextFloat());
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
				"Titula��o: %1s\n"
				+ "�rea de pesquisa: %2s\n", 
				getTitulacao(), getAreaPesquisa());
		
		System.out.println(resposta);
	}

	@Override
	public double calcSalario() {
		return super.calcSalario() + getValorDedicacaoExclusiva() + getRetribTitulacao();
	}
}
