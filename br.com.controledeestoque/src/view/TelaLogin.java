package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private JCheckBox chkMostrarSenha;

	// Guarda o caractere utilizado para ocultar a senha
	private char caracterePadrao;

	/**
	 * Inicia a aplicação.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}
			}
		});
	}

	/**
	 * Construtor da tela.
	 */
	public TelaLogin() {

		setResizable(false);
		setTitle("Sistema de Controle de Estoque");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		/*
		 * Título
		 */
		JLabel lblTitulo = new JLabel("CONTROLE DE ESTOQUE");

		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(86, 22, 261, 21);

		contentPane.add(lblTitulo);

		/*
		 * Label do login
		 */
		JLabel lblLogin = new JLabel("Login");

		lblLogin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogin.setBounds(67, 88, 49, 20);

		contentPane.add(lblLogin);

		/*
		 * Campo do login
		 */
		txtLogin = new JTextField();

		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setBounds(124, 84, 204, 26);
		txtLogin.setColumns(10);

		contentPane.add(txtLogin);

		/*
		 * Label da senha
		 */
		JLabel lblSenha = new JLabel("Senha");

		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(67, 125, 49, 20);

		contentPane.add(lblSenha);

		/*
		 * Campo da senha
		 */
		txtSenha = new JPasswordField();

		txtSenha.setHorizontalAlignment(SwingConstants.CENTER);
		txtSenha.setBounds(124, 121, 204, 26);

		contentPane.add(txtSenha);

		/*
		 * Guarda o caractere padrão utilizado pelo campo de senha.
		 */
		caracterePadrao = txtSenha.getEchoChar();

		/*
		 * Checkbox para mostrar ou ocultar a senha
		 */
		chkMostrarSenha = new JCheckBox("Mostrar senha");

		chkMostrarSenha.setBounds(120, 155, 204, 23);

		chkMostrarSenha.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (chkMostrarSenha.isSelected()) {

					// Remove o caractere de ocultação
					txtSenha.setEchoChar((char) 0);

				} else {

					// Volta a ocultar a senha
					txtSenha.setEchoChar(caracterePadrao);

				}
			}
		});

		contentPane.add(chkMostrarSenha);

		/*
		 * Botão Entrar
		 */
		JButton btnEntrar = new JButton("ENTRAR");

		btnEntrar.setBounds(124, 190, 97, 32);

		btnEntrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				validarLogin();

			}
		});

		contentPane.add(btnEntrar);

		/*
		 * Permite executar o botão Entrar pressionando a tecla Enter.
		 */
		getRootPane().setDefaultButton(btnEntrar);

		/*
		 * Botão Sair
		 */
		JButton btnSair = new JButton("SAIR");

		btnSair.setBounds(231, 190, 97, 32);

		btnSair.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				confirmarSaida();

			}
		});

		contentPane.add(btnSair);

		/*
		 * Centraliza a janela na tela.
		 */
		setLocationRelativeTo(null);

		/*
		 * Coloca o cursor inicialmente no campo de login.
		 */
		txtLogin.requestFocusInWindow();
	}

	/**
	 * Valida os campos e verifica o login.
	 */
	private void validarLogin() {

		String login = txtLogin.getText().trim();
		String senha = new String(txtSenha.getPassword());

		/*
		 * Verifica se os dois campos estão vazios.
		 */
		if (login.isBlank() && senha.isBlank()) {

			JOptionPane.showMessageDialog(
					this,
					"Informe o login e a senha.",
					"Campos obrigatórios",
					JOptionPane.WARNING_MESSAGE
			);

			txtLogin.requestFocus();
			return;
		}

		/*
		 * Verifica somente o login.
		 */
		if (login.isBlank()) {

			JOptionPane.showMessageDialog(
					this,
					"Informe o login.",
					"Campo obrigatório",
					JOptionPane.WARNING_MESSAGE
			);

			txtLogin.requestFocus();
			return;
		}

		/*
		 * Verifica somente a senha.
		 */
		if (senha.isBlank()) {

			JOptionPane.showMessageDialog(
					this,
					"Informe a senha.",
					"Campo obrigatório",
					JOptionPane.WARNING_MESSAGE
			);

			txtSenha.requestFocus();
			return;
		}

		/*
		 * Login utilizado apenas para teste.
		 */
		String loginCorreto = "admin@admin.com";
		String senhaCorreta = "123456";

		if (login.equalsIgnoreCase(loginCorreto)
				&& senha.equals(senhaCorreta)) {

			JOptionPane.showMessageDialog(
					this,
					"Login realizado com sucesso!",
					"Acesso autorizado",
					JOptionPane.INFORMATION_MESSAGE
			);

			/*
			 * Aqui poderá ser aberta a próxima tela.
			 *
			 * TelaPrincipal telaPrincipal = new TelaPrincipal();
			 * telaPrincipal.setVisible(true);
			 * dispose();
			 */

		} else {

			JOptionPane.showMessageDialog(
					this,
					"Login ou senha incorretos.",
					"Acesso negado",
					JOptionPane.ERROR_MESSAGE
			);

			/*
			 * Limpa somente a senha.
			 */
			txtSenha.setText("");
			txtSenha.requestFocus();
		}
	}

	/**
	 * Solicita confirmação antes de fechar o programa.
	 */
	private void confirmarSaida() {

		int resposta = JOptionPane.showConfirmDialog(
				this,
				"Deseja realmente sair do sistema?",
				"Confirmar saída",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE
		);

		if (resposta == JOptionPane.YES_OPTION) {

			System.exit(0);

		}
	}
}