package com.pratica.util.exceptions;

public class SetInvalido extends Exception {
	
	public SetInvalido()
	{
		super();
	}
	
	public SetInvalido(String msg)
	{
		super(msg);
	}
	
	public String toString()
	{
		return "Informa��o inv�lida: " + getMessage();
	}
}
