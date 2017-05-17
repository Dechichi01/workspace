package com.pratica.quatro.database;

import java.util.ArrayList;
import com.pratica.quatro.Aluno;

public class DadosAlunos {
	
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public void cadastrar(Aluno a) 
	{
		alunos.add(a);
		System.out.println(String.format(
				"\nTotal de alunos inseridos: %1s", alunos.size()));
	}
	
	public void listar()
	{
		for (Aluno aluno: alunos) 
		{
			aluno.mostrarDados();
		}		
	}
	
	public Aluno buscar(String matricula) 
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

	public boolean excluir(String matricula)
	{
		Aluno a = buscar(matricula);
		if (a != null) 
		{
			alunos.remove(a);
			return true;
		}
		
		return false;
	}
}
