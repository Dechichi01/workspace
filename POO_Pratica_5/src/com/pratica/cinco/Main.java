package com.pratica.cinco;

import com.pratica.cinco.database.*;

public class Main {
	
	public static void main(String args[])
	{
		DadosAlunos alunos = new DadosAlunos();
		DadosCursos cursos = new DadosCursos();
		DadosDisciplinas disciplinas = new DadosDisciplinas();
		DadosFuncionarios funcionarios = new DadosFuncionarios();
		
		Aluno a = new Aluno();
		a.lerDados();
		alunos.cadastrar(a);
		
		Curso c = new Curso();
		c.lerDados();
		cursos.cadastrar(c);

		a.setCurso(c);
		alunos.listar();
		
		Professor p = new Professor();
		p.lerDados();
		
		Tecnico t = new Tecnico();
		t.lerDados();
		
		funcionarios.cadastrar(p);
		funcionarios.cadastrar(t);
		funcionarios.listar();
		
		Disciplina d = new Disciplina();
		d.lerDados();
		
		d.setCurso(cursos.buscar(c.getCodigo()));
		d.setProfessor((Professor) funcionarios.buscar(p.getCtps())); 
		disciplinas.cadastrar(d);
		disciplinas.listar();
	}
}
