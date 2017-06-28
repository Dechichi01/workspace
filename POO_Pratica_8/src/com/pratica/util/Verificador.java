package com.pratica.util;

public abstract class Verificador {
	
	public static boolean CPFValido(String cpf)
	{
		cpf = removerCaracteresCPF(cpf);
		if (cpf.length() != 11)
		{
			return false;
		}
		
		return !cpfComMesmoDigito(cpf);
	}
	
	private static String removerCaracteresCPF(String cpf)
	{    
	   cpf = cpf.replace("-","");
	   return cpf.replace(".","");    
	}
	
	private static boolean cpfComMesmoDigito(String cpf)
	{
		char primDig = cpf.charAt(0);
	    char[] charCpf = cpf.toCharArray();    
	    
	    for( char c: charCpf  )
	    {
	    	if (c != primDig)
	    	{
	    		return false;
	    	}
	    }
	    
	    return true;
	}
}
