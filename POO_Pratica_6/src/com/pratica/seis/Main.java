package com.pratica.seis;

import java.io.IOException;
import java.util.Scanner;

import com.pratica.seis.classes.Aluno;
import com.pratica.seis.classes.AlunoPosGraduacao;
import com.pratica.seis.classes.Curso;
import com.pratica.seis.classes.Disciplina;
import com.pratica.seis.classes.Funcionario;
import com.pratica.seis.classes.Professor;
import com.pratica.seis.classes.Tecnico;
import com.pratica.seis.database.*;

public class Main {
	
	public static void main(String args[])
	{	
		System.out.println("Static test: Funcion�rios\nPiso Salarial = R$ 1000,00");
		Funcionario.setPisoSalarial(1000);
		
		System.out.println("Novo professor (Valor hora aula = 20)");
		Professor.setValorHoraAula(20);
		Professor p = new Professor();
		
		System.out.println("Novo t�cnico (Valor hora extra = 10)");
		Tecnico.setValorHoraExtra(10);
		Tecnico t = new Tecnico();
		
		Funcionario.setPercentBonificacao(.3);
		System.out.println("Dado percentBonificacao = .3\n");
		System.out.println("Sal�rio Professor: " + p.calcSalario()
		+ "\nSal�rio T�nico (10 horas extras): " + t.calcSalario(10) + "\n");
		
		Funcionario.setPercentBonificacao(.9);
		System.out.println("Dado percentBonificacao = .9\n");
		System.out.println("Sal�rio Professor: " + p.calcSalario()
		+ "\nSal�rio T�nico (10 horas extras): " + t.calcSalario(10) + "\n");
		
		System.out.println("Pressione qualquer tecla para continuar...");
		try 
		{
			while(System.in.read() < 0){}
		} 
		catch (IOException e) {
			e.printStackTrace();
		};
		
		System.out.println("\nTeste: static databases");
		
		DadosFuncionarios.cadastrar(p);
		DadosFuncionarios.cadastrar(t);
		DadosFuncionarios.listar();
		
		System.out.println("Curso:\n");
		Curso c = new Curso();
		System.out.println("Curso P�s-gradua��o:\n");
		Curso cPos = new Curso();
		DadosCursos.cadastrar(c);
		DadosCursos.cadastrar(cPos);
		
		Aluno a = new Aluno(c);
		AlunoPosGraduacao aPos = new AlunoPosGraduacao(c, cPos);
		DadosAlunos.cadastrar(a);
		DadosAlunos.cadastrar(aPos);
		
		System.out.println("Disciplina: ");
		Disciplina d = new Disciplina();
		
		d.setCurso(DadosCursos.buscar(c.getCodigo()));
		d.setProfessor((Professor) DadosFuncionarios.buscar(p.getCtps())); 
		DadosDisciplinas.cadastrar(d);
		DadosDisciplinas.listar();
	}
}
