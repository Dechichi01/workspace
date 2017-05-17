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
		
		System.out.println("Graduação inválido!");
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
		
		System.out.println("Instituição inválido!");
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
		
		System.out.println("Curso Pós inválido!");
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
		
		System.out.println("Data de início inválido!");
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
		
		System.out.println("Data de término inválido!");
		return false;
	}

	public void lerDados()
	{
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a graduação do aluno de pós: ");
		while(!setGraduacao(s.nextLine()));
		
		System.out.println("Digite a instituicao de graduação: ");
		while(!setInstituicao(s.nextLine()));
		
		System.out.println("Digite a data de inicio de graduação (yyyy-mm-dd): ");
		while(!setInicioGraduacao(Date.valueOf(s.nextLine()) ) );
		
		System.out.println("Digite a data de término de graduação (yyyy-mm-dd): ");
		while(!setFimGraduacao(Date.valueOf(s.nextLine()) ) );	
	}
	
	public void mostrarDados()
	{
		super.mostrarDados();
		
		String resposta = String.format(
				"Graduado em: %1s\n"
				+ "Instituição: %2s\n"
				+ "Início Graduação: %3s\n"
				+ "Término Graduação: %4s\n"
				+ "\nCurso de Pós graduação:", 
				getGraduacao(), getInstituicao(), getInicioGraduacao(), getFimGraduacao());
		
		System.out.println(resposta);
		cursoPos.mostrarDados();
	}
}
