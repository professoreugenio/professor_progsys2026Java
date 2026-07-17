package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class CadastroProduto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtProduto;
	private JTextField txtValor;
	private JTextField txtQuantidade;
	private JTable tabelaProdutos;
	private DefaultTableModel modeloTabela;
	private int contador = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProduto frame = new CadastroProduto();
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
	public CadastroProduto() {
		setTitle("Cadastro d eProdutos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Painel de Cadastro de Produtos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(232, 11, 319, 25);
		contentPane.add(lblNewLabel);
		
		txtProduto = new JTextField();
		txtProduto.setBounds(142, 85, 200, 34);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(353, 85, 200, 34);
		contentPane.add(txtValor);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setColumns(10);
		txtQuantidade.setBounds(563, 85, 77, 34);
		contentPane.add(txtQuantidade);
		
		JLabel lblNewLabel_1 = new JLabel("Produto");
		lblNewLabel_1.setBounds(142, 66, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Valor");
		lblNewLabel_1_1.setBounds(353, 66, 77, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Quantidade");
		lblNewLabel_1_1_1.setBounds(563, 66, 88, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adicionarProduto();
				
			}
		});
		btnAdicionar.setBounds(18, 196, 104, 34);
		contentPane.add(btnAdicionar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnLimpar.setBounds(18, 245, 104, 34);
		contentPane.add(btnLimpar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				excluirProduto();
			}
		});
		btnExcluir.setBounds(18, 287, 104, 34);
		contentPane.add(btnExcluir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sair();
			}
		});
		btnSair.setBounds(18, 332, 104, 34);
		contentPane.add(btnSair);
		
		configurarTabela();

	}
	
	private void adicionarProduto() {
		
		String nome = txtProduto.getText().trim();
		String valorTexto = txtValor.getText().trim().replace(",", ".");
		String quantidadeTexto = txtQuantidade.getText().trim();
		
		try {
			
			if(nome.isEmpty() || valorTexto.isEmpty() || quantidadeTexto.isEmpty()) {
				
				JOptionPane.showMessageDialog(null,"Preencha todos os campos");
				
			} else {
				
				double valor = Double.parseDouble(valorTexto);
				int quantidade = Integer.parseInt(quantidadeTexto);
				double total = valor * quantidade;
				
				modeloTabela.addRow(new Object[] { contador, nome, valorTexto, quantidade, total });
				contador++;
				
			}
			
			
		} catch (NumberFormatException e2) {
			// TODO: handle exception
			
		}
		
	}
	
	private void configurarTabela() {
		
		JScrollPane scrollTabelaProdutos = new JScrollPane();
		scrollTabelaProdutos.setBounds(142, 173, 603, 245);
		contentPane.add(scrollTabelaProdutos);
		
		tabelaProdutos = new JTable();
		tabelaProdutos.setColumnSelectionAllowed(true);
		
		scrollTabelaProdutos.setColumnHeaderView(tabelaProdutos);		
		scrollTabelaProdutos.setViewportView(tabelaProdutos);
		
		modeloTabela = new DefaultTableModel();
		modeloTabela.addColumn("Nº");
		modeloTabela.addColumn("Produto");
		modeloTabela.addColumn("Valor");
		modeloTabela.addColumn("Quant.");
		modeloTabela.addColumn("Total");
		tabelaProdutos.setModel(modeloTabela);
		
		tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(10); // primeira coluna
		tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(150); // primeira coluna
		tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(50); // primeira coluna
		tabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(30); // primeira coluna
		tabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(50); // primeira coluna
		//
		//
	}
	
	private void limparCampos() {
		
		txtProduto.setText("");
		txtValor.setText("");
		txtQuantidade.setText("");
		
	}
	
	private void excluirProduto() {
		
		int linhaSelecionada = tabelaProdutos.getSelectedRow();
		if (linhaSelecionada == -1) {
			JOptionPane.showMessageDialog(
				this,
				"Selecione uma linha da tabela para excluir.",
				"Atenção",
				JOptionPane.WARNING_MESSAGE
			);

			return;
		}
		
		int resposta = JOptionPane.showConfirmDialog(
				this,
				"Deseja realmente excluir a linha selecionada?",
				"Confirmar exclusão",
				JOptionPane.YES_NO_OPTION
			);

			if (resposta == JOptionPane.YES_OPTION) {
				modeloTabela.removeRow(linhaSelecionada);
			}
			
	}
	
	private void sair() {
		int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente sair?",
                "Confirmar saída",
                JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
	}
}
