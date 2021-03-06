package com.pratica.dois;

import java.sql.Date;
import java.util.Scanner;

public class AlunoPosGraduacao extends Aluno {
	
	String graduacao;
	String instituicao;
	Curso cursoPos;
	Date inicioGraduacao;
	Date fimGraduacao;
	
	public void lerDados()
	{
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a gradua��o do aluno de p�s: ");
		graduacao = s.nextLine();
		
		System.out.println("Digite a instituicao de gradua��o: ");
		instituicao = s.nextLine();
		
		cursoPos = new Curso();
		
		cursoPos.lerDados();
		
		System.out.println("Digite a data de inicio de gradua��o (yyyy-mm-dd): ");
		inicioGraduacao = Date.valueOf(s.nextLine());
		
		System.out.println("Digite a data de t�rmino de gradua��o (yyyy-mm-dd): ");
		fimGraduacao = Date.valueOf(s.nextLine());		
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
				graduacao, instituicao, inicioGraduacao, fimGraduacao);
		
		System.out.println(resposta);
		cursoPos.mostrarDados();
	}
}
