package com.pratica.cinco;

import java.sql.Date;
import java.util.Scanner;

public class AlunoPosGraduacao extends Aluno {
	
	private String graduacao;
	private String instituicao;
	private Curso cursoPos;
	private Date inicioGraduacao;
	private Date fimGraduacao;
	
	
	public String getGraduacao() {
		return graduacao;
	}

	public boolean setGraduacao(String graduacao) {
		if (graduacao.length() > 0)
		{
			this.graduacao = graduacao;
			return true;
		}
		
		System.out.println("Gradua��o inv�lido!");
		return false;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public boolean setInstituicao(String instituicao) {
		if (instituicao.length() > 0)
		{
			this.instituicao = instituicao;
			return true;
		}
		
		System.out.println("Institui��o inv�lido!");
		return false;
	}

	public Curso getCursoPos() {
		return cursoPos;
	}

	public boolean setCursoPos(Curso cursoPos) {
		if (cursoPos != null)
		{
			this.cursoPos = cursoPos;
			return true;
		}
		
		System.out.println("Curso P�s inv�lido!");
		return false;
	}

	public Date getInicioGraduacao() {
		return inicioGraduacao;
	}

	public boolean setInicioGraduacao(Date inicioGraduacao) {
		if (inicioGraduacao != null)
		{
			this.inicioGraduacao = inicioGraduacao;
			return true;
		}
		
		System.out.println("Data de in�cio inv�lido!");
		return false;
	}

	public Date getFimGraduacao() {
		return fimGraduacao;
	}

	public boolean setFimGraduacao(Date fimGraduacao) {
		if (fimGraduacao != null)
		{
			this.fimGraduacao = fimGraduacao;
			return true;
		}
		
		System.out.println("Data de t�rmino inv�lido!");
		return false;
	}

	public void lerDados()
	{
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a gradua��o do aluno de p�s: ");
		while(!setGraduacao(s.nextLine()));
		
		System.out.println("Digite a instituicao de gradua��o: ");
		while(!setInstituicao(s.nextLine()));
		
		System.out.println("Digite a data de inicio de gradua��o (yyyy-mm-dd): ");
		while(!setInicioGraduacao(Date.valueOf(s.nextLine()) ) );
		
		System.out.println("Digite a data de t�rmino de gradua��o (yyyy-mm-dd): ");
		while(!setFimGraduacao(Date.valueOf(s.nextLine()) ) );	
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
		cursoPos.mostrarDados();
	}
}
