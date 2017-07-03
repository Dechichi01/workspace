package com.pratica.dez.model.classes;

import java.util.Scanner;

import com.pratica.dez.view.VisaoPessoa;
import com.pratica.util.Verificador;
import com.pratica.util.exceptions.SetInvalido;

public class Pessoa {
	
	private String nome;
	private String cpf;
	
	public Pessoa()
	{
		VisaoPessoa.lerDados(this);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws SetInvalido{
		if (nome.equals(""))
			 throw new SetInvalido("Nome");
		else
			 this.nome =nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws SetInvalido {
		if (!Verificador.CPFValido(cpf))
			 throw new SetInvalido("CPF");
		else
			 this.cpf = cpf;
	}
}
