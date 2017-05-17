package com.pratica.cinco.database;

import java.util.ArrayList;

import com.pratica.cinco.Curso;

public class DadosCursos {
	
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	public void cadastrar(Curso c) 
	{
		cursos.add(c);
		System.out.println(String.format(
				"\nTotal de cursos inseridos: %1s", cursos.size()));
	}
	
	public void listar()
	{
		for (Curso curso: cursos) 
		{
			curso.mostrarDados();
		}		
	}
	
	public Curso buscar(int codigo) 
	{

		for (Curso curso: cursos) 
		{
			if (curso.getCodigo() == codigo)
			{
				return curso;
			}
		}
		return null;
	}

	public boolean excluir(int codigo)
	{
		Curso c = buscar(codigo);
		if (c != null) 
		{
			cursos.remove(c);
			return true;
		}
		
		return false;
	}

}
