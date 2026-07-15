package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

public class testepassword extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField txtSenha;
	private char caracterePadrao;
	private JTextField txtNome;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testepassword frame = new testepassword();
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
	public testepassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(110, 92, 209, 29);
		contentPane.add(txtSenha);
		
		caracterePadrao = txtSenha.getEchoChar();
		
		JCheckBox checkExibirsenha = new JCheckBox("New check box");
		checkExibirsenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkExibirsenha.isSelected()) {
					
					txtSenha.setEchoChar((char)0);
					
				} else {
					txtSenha.setEchoChar(caracterePadrao);
					
				}
				
			}
		});
		checkExibirsenha.setBounds(108, 128, 211, 23);
		contentPane.add(checkExibirsenha);
		
		txtNome = new JTextField();
		txtNome.setBounds(110, 46, 209, 29);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		
		JButton btEntrar = new JButton("ENTRAR");
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText().trim();
				String senha = new String(txtSenha.getPassword());
				
				if(nome.isBlank()) {
					JOptionPane.showMessageDialog(null,"Digite um nome");
					txtNome.setText("");
					txtNome.requestFocus();
					return;
				} else if(senha.isBlank()) {
					JOptionPane.showMessageDialog(null,"Digite uma senha");
					txtSenha.setText("");
					txtSenha.requestFocus();
				} else {
					JOptionPane.showMessageDialog(null,"Dados conferem");
					txtNome.setText("Ok");
					txtNome.requestFocus();
				}
				
				
			}
		});
		btEntrar.setBounds(113, 172, 89, 29);
		contentPane.add(btEntrar);
		
		JButton btLimpar = new JButton("LIMPAR");
		btLimpar.setBounds(212, 172, 89, 29);
		contentPane.add(btLimpar);

	}
}
