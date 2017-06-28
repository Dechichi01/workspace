package com.pratica.nove.classes;

import java.util.Scanner;

import com.pratica.util.exceptions.SetInvalido;

public class Tecnico extends Funcionario {
	
	private static double valorHoraExtra;
	
	private String cargo;
	private String departamento;
	private float auxTransporte;
	private float auxAlimentacao;
	
	public static double getValorHoraExtra()
	{
		return valorHoraExtra;
	}
	
	public static void setValorHoraExtra(double valor) throws SetInvalido 
	{
		if (valor <= 0)
			 throw new SetInvalido("Valor hora extra");
		else
			 valorHoraExtra = valor;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) throws SetInvalido  {
		if (cargo.equals(""))
			 throw new SetInvalido("Cargo");
		else
			 this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) throws SetInvalido {
		if (departamento.equals(""))
			 throw new SetInvalido("Departamento");
		else
			 this.departamento = departamento;
	}
	
	public float getAuxTransporte() {
		return auxTransporte;
	}

	public void setAuxTransporte(float auxTransporte) throws SetInvalido {
		if (auxTransporte <= 0)
			 throw new SetInvalido("Aux�lio Transporte");
		else
			 this.auxTransporte = auxTransporte;
	}

	public float getAuxAlimentacao() {
		return auxAlimentacao;
	}

	public void setAuxAlimentacao(float auxAlimentacao) throws SetInvalido {
		if (auxAlimentacao <= 0)
			 throw new SetInvalido("Aux�lio Alimenta��o");
		else
			 this.auxAlimentacao = auxAlimentacao;
	}

	protected void lerDados()
	{		
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o cargo do t�cnico: ");
		while (true)
		{
			try 
			{
				setCargo(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}	
		
		System.out.println("Digite o departamento do t�cnico: ");
		while (true)
		{
			try 
			{
				setDepartamento(s.nextLine());
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
				"Cargo: %1s\n"
				+ "Departamento: %2s\n", 
				getCargo(), getDepartamento());
		
		System.out.println(resposta);
	}

	@Override
	public double calcSalario() {
		return super.calcSalario() + getAuxTransporte() + getAuxAlimentacao();
	}
	
	public double calcSalario(float quantHorasExtra)
	{
		return calcSalario() + quantHorasExtra*valorHoraExtra;
	}
}
