package com.pratica.sete.database;

import java.util.ArrayList;

import com.pratica.sete.classes.Funcionario;

public class DadosFuncionarios {
	
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public static ArrayList<Funcionario> getFuncionarios()
	{
		if (funcionarios == null)
		{
			return null;
		}
		
		return (ArrayList<Funcionario>) funcionarios.clone();
	}
	
	public static void cadastrar(Funcionario f) 
	{
		funcionarios.add(f);
		System.out.println(String.format(
				"\nTotal de funcionarios inseridos: %1s", funcionarios.size()));
	}
	
	public static void listar()
	{
		for (Funcionario funcionario: funcionarios) 
		{
			funcionario.mostrarDados();
		}		
	}
	
	public static Funcionario buscar(String ctps) 
	{
		for (Funcionario funcionario: funcionarios) 
		{
			if (funcionario.getCtps().equals(ctps))
			{
				return funcionario;
			}
		}
		return null;
	}

	public static boolean excluir(String ctps)
	{
		Funcionario f = buscar(ctps);
		if (f != null) 
		{
			funcionarios.remove(f);
			return true;
		}
		
		return false;
	}
}