package com.pratica.dez.model.classes;

import java.sql.Date;
import java.util.ArrayList;

import com.pratica.dez.database.DadosFuncionarios;
import com.pratica.dez.model.interfaces.IPesquisador;
import com.pratica.util.exceptions.SetInvalido;

public class ProjetoPesquisa {
	private int codigo;
	private String titulo;
	private Date dataInicio;
	private Date dataFim;
	private Professor profResponsavel;
	private ArrayList<IPesquisador> pesquisadores =new ArrayList<IPesquisador>();
	
	public ProjetoPesquisa(int codigo, String titulo, Date dataInicio, Professor profResponsavel) throws SetInvalido
	{
		setCodigo(codigo);
		setTitulo(titulo);
		setDataInicio(dataInicio);
		setProfResponsavel(profResponsavel);
	}
	
	public ProjetoPesquisa(int codigo, String titulo, Date dataInicio, Professor profResponsavel, IPesquisador[] pesquisadores) throws SetInvalido
	{
		this(codigo, titulo, dataInicio, profResponsavel);
		for (IPesquisador pesquisador : pesquisadores)
		{
			if (adicionaPesquisador(pesquisador))
			{
				System.out.println("Pesquisador " + pesquisador.getNome() + " adicionado com sucesso!");
			}
			else
			{
				System.out.println("Alerta: Pesquisador " + pesquisador.getNome() + " n�o p�de ser adicionado.");
			}
		}
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) throws SetInvalido {
		if (codigo < 0)
			throw new SetInvalido("C�digo");
		else
			this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws SetInvalido {
		if (titulo.equals(""))
			throw new SetInvalido("T�tulo");
		else
			this.titulo = titulo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) throws SetInvalido {
		if (dataInicio == null)
			throw new SetInvalido("Data de in�cio");
		else
			this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) throws SetInvalido {
		if (dataFim == null)
			throw new SetInvalido("Data de fim");
		else
			this.dataFim = dataFim;
	}

	public Professor getProfResponsavel() {
		return profResponsavel;
	}

	public void setProfResponsavel(Professor profResponsavel) throws SetInvalido {
		if (profResponsavel == null || DadosFuncionarios.buscar(profResponsavel.getCtps()) == null)
			throw new SetInvalido("Professor inexistente ou n�o cadastrado.");
		else
			this.profResponsavel = profResponsavel;
	}

	public IPesquisador[] getPesquisadores() {
		return (IPesquisador[]) new ArrayList<IPesquisador>(pesquisadores).toArray();
	}

	public boolean adicionaPesquisador(IPesquisador pesquisador)
	{
		if (pesquisador != null && 
			pesquisador != profResponsavel &&
			!pesquisadores.contains(pesquisador))
		{
			pesquisadores.add(pesquisador);
			return true;
		}
		
		System.out.println("Pesquisador inv�lido ou j� adicionado.");
		return false;
	}
	
	public void listaPesquisadores()
	{
		System.out.println("Pesquisadores no projeto: " + titulo);
		for (IPesquisador pesquisador : pesquisadores)
		{
			System.out.println(pesquisador.getTipo() + ": " + pesquisador.getNome());
		}
	}
}
