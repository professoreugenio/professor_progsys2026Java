package wb_aula1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class Tela01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNota1;
	private Telamodel modelo;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtNota4;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela01 frame = new Tela01();
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
	public Tela01() {
		
		
		modelo = new Telamodel();
		setTitle("Sistema Painel de Controle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		
		JLabel lblNewLabel = new JLabel("Painel de Controle");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(140, 39, 313, 36);
		contentPane.add(lblNewLabel);
		
		txtNota1 = new JTextField();
		txtNota1.setMargin(new Insets(2, 10, 2, 10));
		txtNota1.setToolTipText("Digite um nome de produto");
		txtNota1.setBounds(140, 177, 84, 36);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Produto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(140, 158, 53, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Desenvolvido por Eugênio - 2026");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(583, 436, 191, 14);
		contentPane.add(lblNewLabel_2);
		

		JLabel jlNomeAluno = new JLabel("");
		jlNomeAluno.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlNomeAluno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jlNomeAluno.setBounds(140, 301, 208, 29);
		contentPane.add(jlNomeAluno);
		
		JLabel jlNota1 = new JLabel("");
		jlNota1.setHorizontalAlignment(SwingConstants.CENTER);
		jlNota1.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlNota1.setBackground(new Color(0, 0, 0));
		jlNota1.setBounds(178, 350, 53, 25);
		contentPane.add(jlNota1);
		
		JLabel jlNota2 = new JLabel("");
		jlNota2.setHorizontalAlignment(SwingConstants.CENTER);
		jlNota2.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlNota2.setBounds(292, 350, 46, 25);
		contentPane.add(jlNota2);
		
		JLabel jlMedia = new JLabel("");
		jlMedia.setHorizontalAlignment(SwingConstants.CENTER);
		jlMedia.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlMedia.setBounds(612, 350, 46, 25);
		contentPane.add(jlMedia);
		
		
		txtNota2 = new JTextField();
		txtNota2.setToolTipText("Digite um nome de produto");
		txtNota2.setMargin(new Insets(2, 10, 2, 10));
		txtNota2.setColumns(10);
		txtNota2.setBounds(254, 177, 84, 36);
		contentPane.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setToolTipText("Digite um nome de produto");
		txtNota3.setMargin(new Insets(2, 10, 2, 10));
		txtNota3.setColumns(10);
		txtNota3.setBounds(369, 177, 84, 36);
		contentPane.add(txtNota3);
		
		txtNota4 = new JTextField();
		txtNota4.setToolTipText("Digite um nome de produto");
		txtNota4.setMargin(new Insets(2, 10, 2, 10));
		txtNota4.setColumns(10);
		txtNota4.setBounds(478, 177, 84, 36);
		contentPane.add(txtNota4);
		
		txtNome = new JTextField();
		txtNome.setToolTipText("Digite um nome de produto");
		txtNome.setMargin(new Insets(2, 10, 2, 10));
		txtNome.setColumns(10);
		txtNome.setBounds(140, 105, 227, 36);
		contentPane.add(txtNome);
		
		JLabel lblNewLabel_1_1 = new JLabel("Aluno");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(140, 86, 53, 14);
		contentPane.add(lblNewLabel_1_1);
		
		
		JLabel jlNota3 = new JLabel("");
		jlNota3.setHorizontalAlignment(SwingConstants.CENTER);
		jlNota3.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlNota3.setBounds(391, 350, 46, 25);
		contentPane.add(jlNota3);
		
		JLabel jlNota4 = new JLabel("");
		jlNota4.setHorizontalAlignment(SwingConstants.CENTER);
		jlNota4.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlNota4.setBounds(494, 350, 46, 25);
		contentPane.add(jlNota4);
		
		JButton btRegistar = new JButton("REGISTRAR");
		btRegistar.setForeground(SystemColor.desktop);
		btRegistar.setBackground(SystemColor.activeCaption);
		btRegistar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btRegistar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				
				
				String produto = txtNota1.getText().trim();	
				String nome = txtNome.getText().trim();	
				String nota1 = txtNota1.getText().trim();	
				String nota2 = txtNota2.getText().trim();	
				String nota3 = txtNota3.getText().trim();	
				String nota4 = txtNota4.getText().trim();	
				
				if(!nome.isEmpty()) {
					
					double nt1 = Double.parseDouble(nota1);
					double nt2 = Double.parseDouble(nota2);
					double nt3 = Double.parseDouble(nota3);
					double nt4 = Double.parseDouble(nota4);
					
					double media = (nt1+nt2+nt3+nt4)/4;
					
					jlNomeAluno.setText(produto);
					jlNota1.setText(String.valueOf(nt1));
					jlNota2.setText(String.valueOf(nt2));
					jlNota3.setText(String.valueOf(nt3));
					jlNota4.setText(String.valueOf(nt4));
					jlMedia.setText(String.format("R$ %.1f%n",media));
					jlNomeAluno.setText(nome);
										
				} else {					
					JOptionPane.showMessageDialog(null,"Campo produto vazio"
							+ "Fazer");
				}		
				
			
			}
		});
		btRegistar.setBounds(140, 233, 122, 29);
		contentPane.add(btRegistar);
		
		JButton btLimpar = new JButton("LIMPAR");
		btLimpar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String produto = txtNota1.getText().trim();	
				int resposta = JOptionPane.showConfirmDialog(btLimpar,"Deseja realmente Limpar","Ação",JOptionPane.YES_NO_OPTION);
				
				if(resposta == JOptionPane.YES_OPTION) {
					txtNota1.setText("");
					txtNota2.setText("");
					txtNota3.setText("");
					txtNota4.setText("");
					txtNota1.requestFocus();
				}
				
			}
		});
		btLimpar.setBounds(272, 233, 95, 29);
		contentPane.add(btLimpar);
		
		JButton btSair = new JButton("SAIR");
		btSair.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resposta = JOptionPane.showConfirmDialog(btSair, "Deseja realmente Sair", "Ação",
						JOptionPane.YES_NO_OPTION);
				
				if(resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btSair.setBounds(377, 233, 85, 29);
		contentPane.add(btSair);
		
		JLabel lblNewLabel_3 = new JLabel("Nome do Aluno");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(140, 273, 146, 36);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nota 1");
		lblNewLabel_4.setBounds(140, 355, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Nota 2");
		lblNewLabel_4_1.setBounds(249, 355, 46, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Média");
		lblNewLabel_4_1_1.setBounds(575, 355, 46, 14);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Nota 2");
		lblNewLabel_4_1_2.setBounds(348, 355, 46, 14);
		contentPane.add(lblNewLabel_4_1_2);
		
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("Nota 2");
		lblNewLabel_4_1_2_1.setBounds(451, 355, 46, 14);
		contentPane.add(lblNewLabel_4_1_2_1);
		
		
		
		
		
		
		
		
		

	}
}
