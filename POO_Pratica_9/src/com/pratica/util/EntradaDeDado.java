package com.pratica.util;

import java.util.*;

public abstract class EntradaDeDado {
	
	public static int lerInteiro()
	{
		return lerInteiro(new Scanner(System.in));
	}
	
	public static int lerInteiro(Scanner s)
	{
		int i = -1;
		while (true)
		{
			try 
			{
				i = s.nextInt();
				System.out.println("OK!");
				break;
			}
			catch (InputMismatchException e) 
			{
				System.out.println("Erro: "+e.toString());
				System.out.println("Digite novamente.");
			}
		}
		
		return i;
	}
	
	public static double lerDouble()
	{
		return lerDouble(new Scanner(System.in));
	}
	
	public static double lerDouble(Scanner s)
	{
		double d = -1;
		while (true)
		{
			try 
			{
				d = s.nextDouble();
				System.out.println("OK!");
				break;
			}
			catch (InputMismatchException e) 
			{
				System.out.println("Erro: "+e.toString());
				System.out.println("Digite novamente.");
			}
		}
		
		return d;
	}
}
