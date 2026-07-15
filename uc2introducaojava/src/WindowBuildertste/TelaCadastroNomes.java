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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Nome");
		
		txtNome = new JTextField();
		txtNome.setColumns(20);
		
		
		
		txtValor = new JTextField();
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
		txtQuantidade.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(40)
							.addComponent(lblNewLabel)
							.addGap(5)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(73)
							.addComponent(lblNewLabel_1)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addComponent(btnRegistrar))
					.addContainerGap(108, Short.MAX_VALUE))
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(9)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnRegistrar))))
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
		modeloTabela.addColumn("Quantidade");
		modeloTabela.addColumn("Total");

		tabelaNomes.setModel(modeloTabela);

	}
}
