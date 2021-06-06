package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Screen extends JFrame {

	private String strValor1;
	private String strValor2;
	private double valor1;
	private double valor2;
	private double resultado;
	private JPanel contentPane;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    try {
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch(Exception e) {
	        System.out.println("Error setting native LAF: " + e);
	    }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen frame = new Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Screen() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Valores valor = new Valores();
		Conta conta = new Conta();
		
		JButton btnAdicao = new JButton("+");
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				resultado = conta.soma(valor1, valor2);
				txtResult.setText("" + resultado);
			}
		});
		btnAdicao.setBounds(10, 99, 100, 39);
		contentPane.add(btnAdicao);
		
		JButton bntDivisao = new JButton("/");
		bntDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado = conta.div(valor1, valor2);
				txtResult.setText("" + resultado);
			}
		});
		bntDivisao.setBounds(10, 189, 100, 39);
		contentPane.add(bntDivisao);
		
		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado = conta.Sub(valor1, valor2);
				txtResult.setText( "" + resultado);
			}
		});
		btnMenos.setBounds(161, 99, 100, 39);
		contentPane.add(btnMenos);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado = conta.mult(valor1, valor2);
				txtResult.setText("" + resultado);
			}
		});
		btnMult.setBounds(161, 189, 100, 39);
		contentPane.add(btnMult);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setBounds(43, 11, 339, 45);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnDefValor1 = new JButton("Definir Valor 1");
		btnDefValor1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				strValor1 = JOptionPane.showInputDialog("Digite um numero!");
				valor1 = valor.Convert(strValor1);
			}
		});
		btnDefValor1.setBounds(289, 107, 117, 23);
		contentPane.add(btnDefValor1);
		
		JButton btnDefValor2 = new JButton("Definir Valor 2");
		btnDefValor2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				strValor2 = JOptionPane.showInputDialog("Digite um numero!");
				valor2 = valor.Convert(strValor2);		
			}
		});
		btnDefValor2.setBounds(289, 176, 117, 23);
		contentPane.add(btnDefValor2);
	}
}
