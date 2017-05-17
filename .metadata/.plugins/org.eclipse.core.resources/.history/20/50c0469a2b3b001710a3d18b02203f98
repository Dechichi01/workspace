package com.pratica.quatro.database;

import java.util.ArrayList;

import com.pratica.quatro.Disciplina;

public class DadosDisciplinas {
	
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void cadastrar(Disciplina d) 
	{
		disciplinas.add(d);
		System.out.println(String.format(
				"\nTotal de disciplinas inseridas: %1s", disciplinas.size()));
	}
	
	public void listar()
	{
		for (Disciplina disciplina: disciplinas) 
		{
			disciplina.mostrarDados();
		}		
	}
	
	public Disciplina buscar(int codigo) 
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

	public boolean excluir(int codigo)
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
