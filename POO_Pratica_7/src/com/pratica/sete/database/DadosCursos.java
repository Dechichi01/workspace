package com.pratica.sete.database;

import java.util.ArrayList;

import com.pratica.sete.classes.Curso;

public class DadosCursos {
	
	private static ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	public static void cadastrar(Curso c) 
	{
		cursos.add(c);
		System.out.println(String.format(
				"\nTotal de cursos inseridos: %1s", cursos.size()));
	}
	
	public static void listar()
	{
		for (Curso curso: cursos) 
		{
			curso.mostrarDados();
		}		
	}
	
	public static Curso buscar(int codigo) 
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

	public static boolean excluir(int codigo)
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
