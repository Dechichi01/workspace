package com.pratica.dez.model.classes;

import java.util.Scanner;

import com.pratica.dez.view.VisaoCurso;
import com.pratica.util.exceptions.SetInvalido;

public class Curso {
	
	private int codigo;
	private String nome;
	private int duracao;
	
	public Curso()
	{
		VisaoCurso.lerDados(this);
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) throws SetInvalido {
		if (codigo < 0)
			 throw new SetInvalido("Código");
		else
			 this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws SetInvalido {
		if (nome.equals(""))
			 throw new SetInvalido("Nome do curso");
		else
			 this.nome = nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) throws SetInvalido {
		if (duracao < 0)
			 throw new SetInvalido("Duração");
		else
			 this.duracao = duracao;
	}
}
