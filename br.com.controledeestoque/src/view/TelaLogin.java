	package view;
	
	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import java.awt.Font;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JCheckBox;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.SwingConstants;
	import javax.swing.JPasswordField;
	
	public class TelaLogin extends JFrame {
	
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextField txtLogin;
		private JPasswordField txtSenha;
		private char caracterePadrao;
		
	
		/**
		 * Launch the application.
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
		 * Create the frame.
		 */
		public TelaLogin() {
			setResizable(false);
			setTitle("Sistema de Conrole de Estoque");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel idTitulo = new JLabel(" CONTROLE DE ESTOQUE");
			idTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			idTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
			idTitulo.setBounds(86, 22, 261, 21);
			contentPane.add(idTitulo);
			
			JLabel lblNewLabel = new JLabel("Login");
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(67, 88, 49, 14);
			contentPane.add(lblNewLabel);
			
			JLabel lblSenha = new JLabel("Senha");
			lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
			lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSenha.setBounds(67, 130, 49, 14);
			contentPane.add(lblSenha);
			
			
			
			
			
			
			JCheckBox chkMostrarSenha = new JCheckBox("Mostrar Senha");
			chkMostrarSenha.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chkMostrarSenha.isSelected()) {
						txtSenha.setEchoChar((char) 0);
					} else {
						txtSenha.setEchoChar(caracterePadrao);
						
					}
				}
			});
			
			chkMostrarSenha.setBounds(124, 160, 204, 23);
			contentPane.add(chkMostrarSenha);
			JButton btnSair = new JButton("SAIR");
			btnSair.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						
					
			
				}
			});
			btnSair.setBounds(231, 190, 97, 32);
			contentPane.add(btnSair);
			
			
			
			JButton btEntrar = new JButton("ENTRAR");
			btEntrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					String login = txtLogin.getText().trim();
					String senha = new String(txtSenha.getPassword());
					
					if(login.isEmpty() || senha.isEmpty()) {
						
						
						
					}
					
				}
			});
			btEntrar.setBounds(124, 190, 97, 32);
			contentPane.add(btEntrar);
			
			
			
			
			txtSenha = new JPasswordField();
			txtSenha.setHorizontalAlignment(SwingConstants.CENTER);
			txtSenha.setBounds(126, 121, 204, 26);
			contentPane.add(txtSenha);
	
			caracterePadrao = txtSenha.getEchoChar();
			
			txtLogin = new JTextField();
			txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
			txtLogin.setBounds(124, 84, 204, 26);
			contentPane.add(txtLogin);
			txtLogin.setColumns(10);
			
			
			setLocationRelativeTo(null);
	
		}
	}
