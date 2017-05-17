package com.pratica.dois;

public class Main {
	
	public static void main(String args[])
	{
		AlunoPosGraduacao ap = new AlunoPosGraduacao();
		ap.lerDados();
		System.out.println("\nMostrando aluno de pós graduação: ");
		ap.mostrarDados();
		
		Aluno a = new Aluno();
		
		a.lerDados();	
		System.out.println("\nMostrando aluno: ");
		a.mostrarDados();
		
		Professor p = new Professor();
		p.lerDados();
		System.out.println("\nMostrando professor: ");
		p.mostrarDados();
		
		Tecnico t = new Tecnico();
		t.lerDados();
		System.out.println("\nMostrando técnico: ");
		t.mostrarDados();
		
	}
}
