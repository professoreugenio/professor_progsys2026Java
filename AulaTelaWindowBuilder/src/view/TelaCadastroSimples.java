package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroSimples extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtProduto;
	private JTextField txtValor;
	private JTextField txtQuantidade;
	private String msg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroSimples frame = new TelaCadastroSimples();
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
	public TelaCadastroSimples() {
		setResizable(false);
		setTitle("Cadastro Simples de Produto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cadastro Simples de Produto");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(122, 11, 239, 17);
		contentPane.add(lblNewLabel);

		JLabel lbProduto = new JLabel("Produto");
		lbProduto.setHorizontalAlignment(SwingConstants.RIGHT);
		lbProduto.setBounds(49, 75, 70, 14);
		contentPane.add(lbProduto);

		JLabel lblValor = new JLabel("Valor");
		lblValor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValor.setBounds(49, 124, 70, 14);
		contentPane.add(lblValor);

		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidade.setBounds(49, 171, 70, 14);
		contentPane.add(lblQuantidade);

		txtProduto = new JTextField();
		txtProduto.setToolTipText("Digite o nome do produto");
		txtProduto.setBounds(129, 70, 220, 25);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);

		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(129, 119, 100, 25);
		contentPane.add(txtValor);

		txtQuantidade = new JTextField();
		txtQuantidade.setColumns(10);
		txtQuantidade.setBounds(129, 166, 100, 25);
		contentPane.add(txtQuantidade);

		JButton btCadastrar = new JButton("Cadastrar");

		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				exibir();

			}
		});
		btCadastrar.setBounds(129, 222, 91, 25);
		contentPane.add(btCadastrar);

		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();

			}
		});
		btLimpar.setBounds(228, 222, 91, 25);
		contentPane.add(btLimpar);

		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sair();
			}
		});
		btSair.setBounds(327, 222, 57, 25);
		contentPane.add(btSair);
		setLocationRelativeTo(null);

	}

	public void exibir() {

		String produto = txtProduto.getText().trim();
		String quantidade = txtQuantidade.getText().trim();
		String valor = txtValor.getText();

		msg += produto + "\n";
		msg += quantidade + "\n";
		msg += valor + "\n";

		JOptionPane.showMessageDialog(null, msg);
	}

	public void sair() {
		int confirma = JOptionPane.showConfirmDialog(txtProduto, contentPane)
		System.exit(0);
	}

	public void limpar() {
		txtProduto.setText("");
		txtQuantidade.setText("");
		txtValor.setText("");

	}

}
