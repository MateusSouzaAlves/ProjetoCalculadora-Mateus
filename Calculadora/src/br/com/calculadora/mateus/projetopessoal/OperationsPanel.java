package br.com.calculadora.mateus.projetopessoal;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OperationsPanel extends JPanel implements ActionListener {

	private JTextField text;

	// Armazenando as ações realizadas na calculadora

	private char op;
	private double value1;
	private double value2;

	// Botões como atributos para verificar no método que vai fazer o teste dos
	// eventos
	// qual botão foi apertado
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnEq;
	private JButton btnClear;

	public OperationsPanel(JTextField text) {
		this.text = text;

		setLayout(new GridLayout(3, 2));

		btnAdd = new JButton("+");// Criando o objeto
		btnAdd.addActionListener(this);// Aplicando o método actionlistener
		add(btnAdd);// Adicionando o botão

		btnSub = new JButton("-");
		btnSub.addActionListener(this);
		add(btnSub);

		btnMult = new JButton("x");
		btnMult.addActionListener(this);
		add(btnMult);

		btnDiv = new JButton("/");
		btnDiv.addActionListener(this);
		add(btnDiv);

		btnEq = new JButton("=");
		btnEq.addActionListener(this);
		add(btnEq);

		btnClear = new JButton("C");
		btnClear.addActionListener(this);
		add(btnClear);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Eventos que devem ser ignorados
		if (text.getText().isEmpty()) {
			return;
		}
		// Verificando qual botão foi apertado
		JButton btn = (JButton) e.getSource();
		// se eu tivesse feito os botões dentro do construtor eu não teria acesso no
		// método abaixo
		if (btn == btnClear) {
			op = '\u0000';// Definindo objeto null
			text.setText("");// Definindo o vazio como resposto ao pressionar o Clear
		} else if (btn == btnEq) {
			value2 = Double.parseDouble(text.getText());// Convertendo o texto da String para um
			// double via parse
			
			double result = 0.0;
			
			if (op == '+') {
				result = value1 + value2;
			} else if (op == '-') {
				result = value1 - value2;
			} else if (op == '/') {
				result = value1 / value2;
			} else if (op == 'x') {
				result = value1 * value2;
			}
			
			//Colocando o resultado na caixa de texto fazendo uma conversão para uma string via
			//valueof (Transformando um primitivo em uma String)
			text.setText(String.valueOf(result));
			op = '\u0000';
			value1 = result;
			value2 = 0;// Isso permitirá aninhar operações
			
		} else {
			op = btn.getText().charAt(0); //atribuindo o primeiro caracterer ao op
			value1 = Double.parseDouble(text.getText());
			text.setText("");//Voltando ao texto vazio para a próxima inserção de texto
		}

	}
}
