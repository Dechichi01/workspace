package com.pratica.sete.classes;

import java.util.Scanner;

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
	
	public static boolean setValorHoraExtra(double valor)
	{
		if (valor > 0)
		{
			valorHoraExtra = valor;
			return true;
		}
		return false;
	}
	
	public String getCargo() {
		return cargo;
	}

	public boolean setCargo(String cargo) {
		if (cargo.length() > 0)
		{
			this.cargo = cargo;
			return true;
		}
		
		System.out.println("Cargo inválido!");
		return false;
	}

	public String getDepartamento() {
		return departamento;
	}

	public boolean setDepartamento(String departamento) {
		if (departamento.length() > 0)
		{
			this.departamento = departamento;
			return true;
		}
		
		System.out.println("Departamento inválido!");
		return false;
	}
	
	public float getAuxTransporte() {
		return auxTransporte;
	}

	public boolean setAuxTransporte(float auxTransporte) {
		if (auxTransporte > 0)
		{
			this.auxTransporte = auxTransporte;
			return true;
		}
		
		System.out.println("Auxílio transporte inválido!");
		return false;
	}

	public float getAuxAlimentacao() {
		return auxAlimentacao;
	}

	public boolean setAuxAlimentacao(float auxAlimentacao) {
		if (auxAlimentacao > 0)
		{
			this.auxAlimentacao = auxAlimentacao;
			return true;
		}
		
		System.out.println("Auxílio alimentação inválido!");
		return false;
	}

	protected void lerDados()
	{		
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o cargo do técnico: ");
		while(!setCargo(s.nextLine()));
		
		System.out.println("Digite o departamento do técnico: ");
		while(!setDepartamento(s.nextLine()));		
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
