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
			System.out.println("Curso n�o atribu�do");
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
			System.out.println("Curso n�o atribu�do");
		}
	}
	
	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) throws SetInvalido{
		if (graduacao.equals("") )
			 throw new SetInvalido("Gradua��o");
		else
			 this.graduacao = graduacao;	
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) throws SetInvalido {
		if (instituicao.equals("") )
			 throw new SetInvalido("Institui��o");
		else
			 this.instituicao = instituicao;	
	}

	public Curso getCursoPos() {
		return cursoPos;
	}

	public void setCursoPos(Curso cursoPos) throws SetInvalido {
		if (cursoPos == null)
			 throw new SetInvalido("Curso P�s");
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
			 throw new SetInvalido("Data de in�cio gradua��o");
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
			 throw new SetInvalido("Data de fim gradua��o");
		else
			 this.fimGraduacao = fimGraduacao;
	}

	protected void lerDados()
	{
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a gradua��o do aluno de p�s: ");
		while (true)
		{
			try 
			{
				setGraduacao(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite a instituicao de gradua��o: ");
		while (true)
		{
			try 
			{
				setInstituicao(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
		}
		
		System.out.println("Digite a data de inicio de gradua��o (yyyy-mm-dd): ");
		while (true)
		{
			try 
			{
				setInicioGraduacao(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
			catch (IllegalArgumentException e)
			{
				System.out.println("Data inv�lida. Tente novamente");
			}
		}
		
		System.out.println("Digite a data de t�rmino de gradua��o (yyyy-mm-dd): ");
		while (true)
		{
			try 
			{
				setFimGraduacao(s.nextLine());
				break;
			} 
			catch (SetInvalido e) 
			{
				System.out.println(e);
				System.out.println("Tente novamente...");
			}
			catch (IllegalArgumentException e)
			{
				System.out.println("Data inv�lida. Tente novamente");
			}
		}
	}
	
	public void mostrarDados()
	{	
		super.mostrarDados();
		
		String resposta = String.format(
				"Graduado em: %1s\n"
				+ "Institui��o: %2s\n"
				+ "In�cio Gradua��o: %3s\n"
				+ "T�rmino Gradua��o: %4s\n"
				+ "\nCurso de P�s gradua��o:", 
				getGraduacao(), getInstituicao(), getInicioGraduacao(), getFimGraduacao());
		
		System.out.println(resposta);
		if (cursoPos != null)
		{
			cursoPos.mostrarDados();	
		}
	}
}
