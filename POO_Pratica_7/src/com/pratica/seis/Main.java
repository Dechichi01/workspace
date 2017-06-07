package com.pratica.seis;

import java.io.IOException;
import java.util.Scanner;

import com.pratica.seis.classes.Aluno;
import com.pratica.seis.classes.AlunoPosGraduacao;
import com.pratica.seis.classes.Curso;
import com.pratica.seis.classes.Disciplina;
import com.pratica.seis.classes.FolhaPagamento;
import com.pratica.seis.classes.Funcionario;
import com.pratica.seis.classes.Professor;
import com.pratica.seis.classes.Tecnico;
import com.pratica.seis.classes.Vigilante;
import com.pratica.seis.database.*;

public class Main {
	
	public static void main(String args[])
	{	
		Funcionario.setPisoSalarial(1000);
		Professor.setValorHoraAula(20);
		Tecnico.setValorHoraExtra(10);
		Funcionario.setPercentBonificacao(.3);
		
		for (int i = 1; i< 2; i++)
		{
			System.out.printf("##### Professor %d: \n", i);
			Professor p = new Professor();
			System.out.printf("##### Tecnico %d: \n", i);
			Tecnico t = new Tecnico();
			System.out.printf("##### Vigilante %d: \n", i);
			Vigilante v = new Vigilante();
			
			DadosFuncionarios.cadastrar(p);
			DadosFuncionarios.cadastrar(t);
			DadosFuncionarios.cadastrar(v);
		}
		
		FolhaPagamento.somaFolha(DadosFuncionarios.getFuncionarios());
		System.out.printf("\n O total da folha de pagamento �: R$%.2f\n",FolhaPagamento.getTotalFolha());
		System.out.printf("\nO total de encargos �: R$%.2f\n", FolhaPagamento.getTotalEncargos());
		
		FolhaPagamento.gerarRelatorio(DadosFuncionarios.getFuncionarios());
	}
}
