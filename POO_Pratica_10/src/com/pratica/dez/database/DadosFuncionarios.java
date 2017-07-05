package com.pratica.dez.database;

import java.util.ArrayList;

import com.pratica.dez.model.classes.Curso;
import com.pratica.dez.model.classes.Funcionario;
import com.pratica.dez.view.VisaoFuncionario;
import com.pratica.util.persistence.Persist;

public class DadosFuncionarios {
	
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private static String filePath = "funcionarios.dat";
	
	static
	{
		funcionarios = Persist.recuperar(filePath);
		if (funcionarios == null)
		{
			funcionarios = new ArrayList<Funcionario>();
			Persist.gravar(funcionarios, filePath);
		}
	}
	
	public static Funcionario[] getFuncionarios()
	{
		if (funcionarios == null)
		{
			return null;
		}
		
		return funcionarios.toArray(new Funcionario[0]);
	}
	
	public static void cadastrar(Funcionario f) 
	{
		funcionarios.add(f);
		Persist.gravar(funcionarios, filePath);
		System.out.println(String.format(
				"\nTotal de funcionarios inseridos: %1s", funcionarios.size()));
	}
	
	public static void listar()
	{
		for (Funcionario funcionario: funcionarios) 
		{
			VisaoFuncionario.mostrarDados(funcionario);
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
