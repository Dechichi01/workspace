package com.pratica.dez.model.classes;

import java.sql.Date;
import java.util.Scanner;

import com.pratica.util.exceptions.SetInvalido;

public class AlunoPosGraduacao extends Aluno {
	
	private String graduacao;
	private String instituicao;
	private Curso cursoPos;
	private Date inicioGraduacao;
	private Date fimGraduacao;
	
	public AlunoPosGraduacao()
	{
		super();
		try 
		{
			setCursoPos(new Curso());
		} 
		catch (SetInvalido e) 
		{
			System.out.println(e);
			System.out.println("Curso não atribuído");
		}
	}
	
	public AlunoPosGraduacao(Curso curso, Curso cursoPos)
	{
		super(curso);
		try 
		{
			setCursoPos(cursoPos);
		} 
		catch (SetInvalido e) 
		{
			System.out.println(e);
			System.out.println("Curso não atribuído");
		}
	}
	
	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) throws SetInvalido{
		if (graduacao.equals("") )
			 throw new SetInvalido("Graduação");
		else
			 this.graduacao = graduacao;	
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) throws SetInvalido {
		if (instituicao.equals("") )
			 throw new SetInvalido("Instituição");
		else
			 this.instituicao = instituicao;	
	}

	public Curso getCursoPos() {
		return cursoPos;
	}

	public void setCursoPos(Curso cursoPos) throws SetInvalido {
		if (cursoPos == null)
			 throw new SetInvalido("Curso Pós");
		else
			 this.cursoPos = cursoPos;	
	}

	public Date getInicioGraduacao() {
		return inicioGraduacao;
	}
	
	public void setInicioGraduacao(String date) throws SetInvalido, IllegalArgumentException
	{
		setInicioGraduacao(Date.valueOf(date));
	}
	
	public void setInicioGraduacao(Date inicioGraduacao) throws SetInvalido {
		if (inicioGraduacao == null)
			 throw new SetInvalido("Data de início graduação");
		else
			 this.inicioGraduacao = inicioGraduacao;
	}

	public Date getFimGraduacao() {
		return fimGraduacao;
	}
	
	public void setFimGraduacao(String date) throws SetInvalido, IllegalArgumentException
	{
		setFimGraduacao(Date.valueOf(date));
	}
	
	public void setFimGraduacao(Date fimGraduacao) throws SetInvalido {
		
		if (fimGraduacao == null)
			 throw new SetInvalido("Data de fim graduação");
		else
			 this.fimGraduacao = fimGraduacao;
	}
}
