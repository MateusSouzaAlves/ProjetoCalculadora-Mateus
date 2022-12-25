package br.com.calculadora.mateus.projetopessoal;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
//Classe para criação do layout(Painel)
public class TextPanel extends JPanel {
	
	
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	
	
	private JTextField Number;

	public TextPanel() {
		setLayout(new FlowLayout());
		
		Number = new JTextField(15);
		Number.setBackground(new Color(255, 255, 255));
		Number.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Number.setHorizontalAlignment(JTextField.RIGHT);
		Number.setEnabled(false);
		add(Number);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JTextField getNumber() {
		return Number;
	}
	
	
}
