package main;

import javax.swing.JOptionPane;

public class Valores
{
	private String strValor;
	private double conVal;
	private double valor1;
	private double valor2;
	
	public double getValor1()
	{
		return valor1;
	}
	
	public double getValor2()
	{
		return valor2;
	}
	
	public void setValor1(double valor1)
	{
		this.valor1 = valor1;	
	}
	
	public void setValor2(double valor2)
	{
		this.valor2 = valor2;	
	}
	
	public double Convert(String strvalor)
	{		
			this.strValor = strvalor;
			try {				
				conVal = Integer.parseInt(strValor);
				return conVal;
			}catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null,e);
				return conVal;
			}

	}
		
}


