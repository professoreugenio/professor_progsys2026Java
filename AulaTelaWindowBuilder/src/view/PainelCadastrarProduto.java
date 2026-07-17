package view;

import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import model.Produto;




public class PainelCadastrarProduto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtProduto;
	private JTextField txtValor;
	private JTextField txtQuantidade;
	private JTable tabelaProdutos;
	private DefaultTableModel modeloTabela;
	private int contador = 1;



	/**
	 * Create the panel.
	 */
	public PainelCadastrarProduto() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel painelCampos = new JPanel();
		add(painelCampos, BorderLayout.NORTH);
		
		
		
		txtProduto = new JTextField();
		txtProduto.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		
		JLabel lblValor = new JLabel("Valor");
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		GroupLayout gl_painelCampos = new GroupLayout(painelCampos);
		gl_painelCampos.setHorizontalGroup(
			gl_painelCampos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelCampos.createSequentialGroup()
					.addGap(15)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtProduto, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(lblValor, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(lblQuantidade, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(184, Short.MAX_VALUE))
		);
		gl_painelCampos.setVerticalGroup(
			gl_painelCampos.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelCampos.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_painelCampos.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(lblValor)
						.addComponent(lblQuantidade))
					.addContainerGap())
		);
		painelCampos.setLayout(gl_painelCampos);
		
		JScrollPane scrollPaneTabela = new JScrollPane();
		add(scrollPaneTabela, BorderLayout.CENTER);
		
		tabelaProdutos = new JTable();
		scrollPaneTabela.setViewportView(tabelaProdutos);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JButton btEnviar = new JButton("Enviar");
		btEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enviarProduto();
			}
		});
		panel.add(btEnviar);
		
		JButton btLimpar = new JButton("Limpar");
		panel.add(btLimpar);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluirProduto();
			}
		});
		panel.add(btExcluir);
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sair();
			}
		});
		panel.add(btSair);
		configurarTabela();
		

	}
	
	 private void sair() {

	        int resposta = JOptionPane.showConfirmDialog(
	                this,
	                "Deseja realmente sair?",
	                "Confirmar saída",
	                JOptionPane.YES_NO_OPTION
	        );

	        if (resposta == JOptionPane.YES_OPTION) {
	            Window janela = SwingUtilities.getWindowAncestor(this);

	            if (janela != null) {
	                janela.dispose();
	            }
	        }
	    }
	private void configurarTabela() {

	    modeloTabela = new DefaultTableModel() {
	        private static final long serialVersionUID = 1L;

	        @Override
	        public boolean isCellEditable(int row, int column) {
	            return false;
	        }
	    };

	    modeloTabela.addColumn("Nº");
	    modeloTabela.addColumn("Produto");
	    modeloTabela.addColumn("Valor");
	    modeloTabela.addColumn("Quantidade");
	    modeloTabela.addColumn("Total");

	    tabelaProdutos.setModel(modeloTabela);
	    tabelaProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    
	}
	
    private void excluirProduto() {

        int linhaSelecionada = tabelaProdutos.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto na tabela para excluir.");
            return;
        }

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente excluir o produto selecionado?",
                "Confirmar exclusão",
                JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            modeloTabela.removeRow(linhaSelecionada);
            JOptionPane.showMessageDialog(this, "Produto excluído com sucesso.");
        }
    }
	private void limparCampos() {
        txtProduto.setText("");
        txtValor.setText("");
        txtQuantidade.setText("");
        txtProduto.requestFocus();
    }
	private void enviarProduto() {

        String nome = txtProduto.getText().trim();
        String valorTexto = txtValor.getText().trim().replace(",", ".");
        String quantidadeTexto = txtQuantidade.getText().trim();

        if (nome.isBlank()) {
            JOptionPane.showMessageDialog(this, "Informe o nome do produto.");
            txtProduto.requestFocus();
            return;
        }

        if (valorTexto.isBlank()) {
            JOptionPane.showMessageDialog(this, "Informe o valor do produto.");
            txtValor.requestFocus();
            return;
        }

        if (quantidadeTexto.isBlank()) {
            JOptionPane.showMessageDialog(this, "Informe a quantidade do produto.");
            txtQuantidade.requestFocus();
            return;
        }

        try {
            double valor = Double.parseDouble(valorTexto);
            int quantidade = Integer.parseInt(quantidadeTexto);

            if (valor <= 0) {
                JOptionPane.showMessageDialog(this, "O valor deve ser maior que zero.");
                txtValor.requestFocus();
                return;
            }

            if (quantidade <= 0) {
                JOptionPane.showMessageDialog(this, "A quantidade deve ser maior que zero.");
                txtQuantidade.requestFocus();
                return;
            }

            Produto produto = new Produto(nome, valor, quantidade);

            modeloTabela.addRow(new Object[] {
                    contador,
                    produto.getProduto(),
                    produto.getValorFormatado(),
                    produto.getQuantidade(),
                    produto.getTotalFormatado()
            });

            contador++;

            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso.");
            limparCampos();

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(this, "Valor ou quantidade inválidos.");
            txtValor.requestFocus();
        }
    }
	
	
}
