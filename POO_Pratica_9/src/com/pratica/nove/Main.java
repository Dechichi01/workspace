package com.pratica.nove;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import com.pratica.nove.classes.Aluno;
import com.pratica.nove.classes.AlunoPosGraduacao;
import com.pratica.nove.classes.Curso;
import com.pratica.nove.classes.Disciplina;
import com.pratica.nove.classes.FolhaPagamento;
import com.pratica.nove.classes.Funcionario;
import com.pratica.nove.classes.Professor;
import com.pratica.nove.classes.ProjetoPesquisa;
import com.pratica.nove.classes.Tecnico;
import com.pratica.nove.classes.Vigilante;
import com.pratica.nove.database.*;
import com.pratica.nove.database.DadosFuncionarios;
import com.pratica.nove.interfaces.IPesquisador;
import com.pratica.util.exceptions.SetInvalido;

public class Main {
	
	public static void main(String args[])
	{	
		
		try 
		{
			Funcionario.setPisoSalarial(1000);
			Professor.setValorHoraAula(20);
			Tecnico.setValorHoraExtra(10);
		} 
		catch (SetInvalido e) 
		{
			System.out.println(e.getMessage());
			System.out.println("N�o foi poss�vel atribuir vari�veis chave do programa. Encerrando...");
			return;
		}

		Funcionario.setPercentBonificacao(.3);
		
		for (int i = 1; i< 2; i++)
		{
			System.out.printf("##### Professor %d: \n", i);
			Professor p = new Professor();
			System.out.printf("##### Aluno %d: \n", i);
			Aluno a = new Aluno();
			
			DadosFuncionarios.cadastrar(p);
			DadosAlunos.cadastrar(a);
		}
		
		Funcionario[] funcionarios = DadosFuncionarios.getFuncionarios();
		Aluno[] alunos = DadosAlunos.getAlunos();	
		
		try 
		{
			ProjetoPesquisa proj = new ProjetoPesquisa(1000,"Projeto Teste", 
					Date.valueOf(LocalDateTime.now().toLocalDate()), (Professor)funcionarios[0], alunos);
			
			for (Funcionario prof : funcionarios)
			{
				proj.adicionaPesquisador((IPesquisador) prof);
			}
			
			proj.listaPesquisadores();
		} 
		catch (SetInvalido e) 
		{
			e.printStackTrace();
		}
	}
}
