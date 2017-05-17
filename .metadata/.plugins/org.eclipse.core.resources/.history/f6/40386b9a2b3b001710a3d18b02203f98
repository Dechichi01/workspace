package com.pratica.quatro;

import java.util.Scanner;

public class Tecnico extends Funcionario {
	
	private String cargo;
	private String departamento;
		
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

	public void lerDados()
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
}
