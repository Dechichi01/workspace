package com.pratica.util.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public abstract class Persist {
	
	public static <T extends Serializable> boolean gravar(T a, String arquivo)
	{
		try
		{
			 FileOutputStream arquivoGrav = new FileOutputStream(arquivo);

			 ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);

			 objGravar.writeObject(a);
			 objGravar.flush();
			 objGravar.close();
			 arquivoGrav.flush();
			 arquivoGrav.close();
			 return true;
		}
		catch(Exception e)
		{
			System.out.println("ERRO: Falha ao gravar o objeto do tipo: " + a.getClass().getTypeName());
			return false;
		}
	}
		 
	public static <T extends Serializable> T recuperar(String arquivo)
	{
		 T obj = null;
		 FileInputStream arquivoLeitura = null;
		 ObjectInputStream objLeitura = null;
		 try
		 {
			 arquivoLeitura = new FileInputStream(arquivo);
			 objLeitura = new ObjectInputStream(arquivoLeitura);
			 obj =(T) objLeitura.readObject();
			 objLeitura.close();
			 arquivoLeitura.close(); 
		 }
		 catch( Exception e )
		 {
			 return null;
		 }
		 
		 return obj;
	} 
}
