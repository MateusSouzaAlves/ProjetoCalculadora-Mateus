package br.com.calculadora.mateus.projetopessoal;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberPanel extends JPanel implements ActionListener {

	private JTextField text;//Referência para ser usada no método setTexto

	// Possibilitando que os métodos de evento de clique possam acessar esse texto e
	// fazer alterações no texto da caixa.

	public NumberPanel(JTextField text) {
		this.text = text;

		setLayout(new GridLayout(4, 3));

		JButton btn1 = new JButton("1");
		btn1.addActionListener(this);
		add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(this);
		add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(this);
		add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(this);
		add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(this);
		add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(this);
		add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(this);
		add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(this);
		add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(this);
		add(btn9);

		JButton emptyBtn = new JButton();
		emptyBtn.setEnabled(false);
		add(emptyBtn);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(this);
		add(btn0);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Proibindo de digitar mais de 10 números na caixa de texto
		
		if (text.getText().length() == 10) {
			return;
		}
		
		JButton btn = (JButton) e.getSource();// Retorna o objeto que disparou o evento
		String Number = btn.getText();//Retorna o texto do botão que foi apertado.
		text.setText(text.getText() + Number);//Concatenando o texto do botão apertado com o número apertado
	}

}
