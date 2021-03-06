package com.pratica.cinco.database;

import java.util.ArrayList;

import com.pratica.cinco.Funcionario;

public class DadosFuncionarios {
	
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public void cadastrar(Funcionario f) 
	{
		funcionarios.add(f);
		System.out.println(String.format(
				"\nTotal de funcionarios inseridos: %1s", funcionarios.size()));
	}
	
	public void listar()
	{
		for (Funcionario funcionario: funcionarios) 
		{
			funcionario.mostrarDados();
		}		
	}
	
	public Funcionario buscar(String ctps) 
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

	public boolean excluir(String ctps)
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
