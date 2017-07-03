package com.pratica.dez.database;

import java.util.ArrayList;

import com.pratica.dez.model.classes.Aluno;
import com.pratica.dez.view.VisaoAluno;
import com.pratica.util.persistence.Persist;

public class DadosAlunos {
	
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private static String filePath = "alunos.dat";
	
	static
	{
		alunos = Persist.recuperar(filePath);
		if (alunos == null)
		{
			alunos = new ArrayList<Aluno>();
			Persist.gravar(alunos, filePath);
		}
	}
	
	public static void cadastrar(Aluno a) 
	{
		alunos.add(a);
		Persist.gravar(alunos, filePath);
		System.out.println(String.format(
				"\nTotal de alunos inseridos: %1s", alunos.size()));
	}
	
	public static void listar()
	{
		for (Aluno aluno: alunos) 
		{
			VisaoAluno.mostrarDados(aluno);
		}		
	}
	
	public static Aluno buscar(String matricula) 
	{
		for (Aluno aluno: alunos) 
		{
			if (aluno.getMatricula().equals(matricula))
			{
				return aluno;
			}
		}
		return null;
	}

	public static boolean excluir(String matricula)
	{
		Aluno a = buscar(matricula);
		if (a != null) 
		{
			alunos.remove(a);
			Persist.gravar(alunos, filePath);
			return true;
		}
		
		return false;
	}
	
	public static Aluno[] getAlunos()
	{
		if (alunos == null)
		{
			return null;
		}
		
		return alunos.toArray(new Aluno[0]);
	}
}
