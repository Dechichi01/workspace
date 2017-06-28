package com.pratica.oito;

import java.io.IOException;
import java.util.Scanner;

import com.pratica.oito.classes.Aluno;
import com.pratica.oito.classes.AlunoPosGraduacao;
import com.pratica.oito.classes.Curso;
import com.pratica.oito.classes.Disciplina;
import com.pratica.oito.classes.FolhaPagamento;
import com.pratica.oito.classes.Funcionario;
import com.pratica.oito.classes.Professor;
import com.pratica.oito.classes.Tecnico;
import com.pratica.oito.classes.Vigilante;
import com.pratica.oito.database.*;
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
			System.out.println("Não foi possível atribuir variáveis chave do programa. Encerrando...");
			return;
		}

		Funcionario.setPercentBonificacao(.3);
		
		System.out.printf("##### Aluno: \n");
		Aluno a = new Aluno();
		
		System.out.printf("##### Aluno de Pós-graduação: \n");
		AlunoPosGraduacao aPos = new AlunoPosGraduacao();
		
		System.out.printf("##### Professor: \n");
		Professor p = new Professor();
		System.out.printf("##### Tecnico: \n");
		Tecnico t = new Tecnico();
		System.out.printf("##### Vigilante: \n");
		Vigilante v = new Vigilante();
		
		System.out.println("Fim do programa...");
	}
}
