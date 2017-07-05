package com.pratica.dez.database;

import java.util.ArrayList;

import com.pratica.dez.model.classes.Curso;
import com.pratica.dez.model.classes.Disciplina;
import com.pratica.dez.view.VisaoDisciplina;
import com.pratica.util.persistence.Persist;

public class DadosDisciplinas {
	
	private static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private static String filePath = "disciplinas.dat";
	
	static
	{
		disciplinas = Persist.recuperar(filePath);
		if (disciplinas == null)
		{
			disciplinas = new ArrayList<Disciplina>();
			Persist.gravar(disciplinas, filePath);
		}
	}
	
	public static void cadastrar(Disciplina d) 
	{
		disciplinas.add(d);
		Persist.gravar(disciplinas, filePath);
		System.out.println(String.format(
				"\nTotal de disciplinas inseridas: %1s", disciplinas.size()));
	}
	
	public static void listar()
	{
		for (Disciplina disciplina: disciplinas) 
		{
			VisaoDisciplina.mostrarDados(disciplina);
		}		
	}
	
	public static Disciplina buscar(int codigo) 
	{

		for (Disciplina disciplina: disciplinas) 
		{
			if (disciplina.getCodigo() == codigo)
			{
				return disciplina;
			}
		}
		return null;
	}

	public static boolean excluir(int codigo)
	{
		Disciplina d = buscar(codigo);
		if (d != null) 
		{
			disciplinas.remove(d);
			return true;
		}
		
		return false;
	}
	
}
