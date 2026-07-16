package WindowBuildertste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.Rectangle;


public class TelaCadastroNomes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTable tabelaNomes;
	private DefaultTableModel modeloTabela;
	private JTextField txtValor;
	private JTextField txtQuantidade;
	private int contadorCadastro = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroNomes frame = new TelaCadastroNomes();
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
	public TelaCadastroNomes() {
		
		setTitle("Cadastro de Nomes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txtNome = new JTextField();
		txtNome.setBounds(129, 70, 220, 30);
		txtNome.setMargin(new Insets(2, 10, 2, 10));
		txtNome.setColumns(20);
		
		
		
		txtValor = new JTextField();
		txtValor.setMargin(new Insets(2, 10, 2, 10));
		
		txtValor.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				String nome = txtNome.getText().trim();
				String valorTexto = txtValor.getText().trim().replace(",", ".");
				String quantidadeTexto = txtQuantidade.getText().trim();
				
				
				try {
					
					double valor =Double.parseDouble(valorTexto); 
					int quantidade = Integer.parseInt(quantidadeTexto);
					double total = valor * quantidade;
					
					
					modeloTabela.addRow(new Object[] { contadorCadastro, nome, valorTexto,quantidade, total });
					contadorCadastro++;
					
					
					txtNome.setText("");
					txtQuantidade.setText("");
					txtValor.setText("");
					txtNome.requestFocus();
							
					
				} catch (NumberFormatException e2) {
					// TODO: handle exception
				}
				
				if (nome.isEmpty()|| valorTexto.isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Digite um nome antes de registrar.");
				    txtNome.requestFocus();
				    return;
				}
				
				
				
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Produto");
		
		JLabel lblNewLabel_2 = new JLabel("Valor");
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade");
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(new Rectangle(0, 0, 0, 25));
		txtQuantidade.setMargin(new Insets(2, 10, 2, 10));
		txtQuantidade.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(73)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
					.addGap(60)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(btnRegistrar))
						.addComponent(lblNewLabel_3))
					.addGap(247))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_2)
							.addComponent(lblNewLabel_3))
						.addComponent(lblNewLabel_1))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRegistrar)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		tabelaNomes = new JTable();
		scrollPane.setViewportView(tabelaNomes);
		modeloTabela = new DefaultTableModel();
		modeloTabela.addColumn("Nº");
		modeloTabela.addColumn("Nome");
		modeloTabela.addColumn("Valor");
		modeloTabela.addColumn("Qt.");
		modeloTabela.addColumn("Total");

		tabelaNomes.setModel(modeloTabela);
		tabelaNomes.getColumnModel().getColumn(0).setPreferredWidth(20); // Nome
		tabelaNomes.getColumnModel().getColumn(1).setPreferredWidth(200); // Nome
		tabelaNomes.getColumnModel().getColumn(2).setPreferredWidth(50); // Nome
		tabelaNomes.getColumnModel().getColumn(3).setPreferredWidth(50); // Nome
		tabelaNomes.getColumnModel().getColumn(4).setPreferredWidth(100); // Nome
		

	}
}
