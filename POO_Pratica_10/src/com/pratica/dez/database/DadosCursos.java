package com.pratica.dez.database;

import java.util.ArrayList;

import com.pratica.dez.model.classes.Aluno;
import com.pratica.dez.model.classes.Curso;
import com.pratica.dez.view.VisaoCurso;
import com.pratica.util.persistence.Persist;

public class DadosCursos {
	
	private static ArrayList<Curso> cursos = new ArrayList<Curso>();
	private static String filePath = "cursos.dat";
	
	static
	{
		cursos = Persist.recuperar(filePath);
		if (cursos == null)
		{
			cursos = new ArrayList<Curso>();
			Persist.gravar(cursos, filePath);
		}
	}
	
	public static void cadastrar(Curso c) 
	{
		cursos.add(c);
		Persist.gravar(cursos, filePath);
		System.out.println(String.format(
				"\nTotal de cursos inseridos: %1s", cursos.size()));
	}
	
	public static void listar()
	{
		for (Curso curso: cursos) 
		{
			VisaoCurso.mostrarDados(curso);
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
