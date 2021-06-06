package main;

import javax.swing.JOptionPane;

public class Conta 
{
	private double result;
	
	public double soma(double valor1, double valor2)
	{
//		this.valor1 = valor1;
//		this.valor1 = valor2;
		
		result = valor1 + valor2;
		return result;		
	}
	
	public double Sub(double valor1, double valor2)
	{
		return valor1 - valor2;
	}
	
	public double mult(double valor1, double valor2)
	{
		return valor1 * valor2;
	}
	
	public double div(double valor1, double valor2)
	{		
		if(valor1 != 0 && valor2 != 0)
		{
			result = valor1 / valor2;
			return result;
		}else 
		{
			JOptionPane.showMessageDialog(null, "Impossivel dividir por 0");
			return result;
		}
		
	}
}
