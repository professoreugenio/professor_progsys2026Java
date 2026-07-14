package wb_aula1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class Tela01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtProduto;

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
		setResizable(false);
		setTitle("Sistema Painel de Controle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setLocationRelativeTo(null);
		
		
		JLabel lblNewLabel = new JLabel("Painel de Controle");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(228, 35, 313, 36);
		contentPane.add(lblNewLabel);
		
		txtProduto = new JTextField();
		txtProduto.setMargin(new Insets(2, 10, 2, 10));
		txtProduto.setToolTipText("Digite um nome de produto");
		txtProduto.setBounds(228, 107, 322, 36);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Produto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(228, 82, 53, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Desenvolvido por Eugênio - 2026");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(583, 436, 191, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btRegistar = new JButton("REGISTRAR");
		btRegistar.setForeground(SystemColor.desktop);
		btRegistar.setBackground(SystemColor.activeCaption);
		btRegistar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btRegistar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				String produto = txtProduto.getText().trim();				
				if(!produto.isEmpty()) {					
					JOptionPane.showMessageDialog(null,""
							+ "Nome do produto\n\n"
							+ produto);
					txtProduto.setText("");
					txtProduto.requestFocus();					
				} else {					
					JOptionPane.showMessageDialog(null,"Campo produto vazio"
							+ "Fazer");
				}		
				
			
			}
		});
		btRegistar.setBounds(228, 163, 122, 29);
		contentPane.add(btRegistar);
		
		JButton btLimpar = new JButton("LIMPAR");
		btLimpar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String produto = txtProduto.getText().trim();	
				int resposta = JOptionPane.showConfirmDialog(btLimpar,"Deseja realmente Limpar","Ação",JOptionPane.YES_NO_OPTION);
				
				if(resposta == JOptionPane.YES_OPTION) {
					txtProduto.setText("");
					txtProduto.requestFocus();
				}
				
			}
		});
		btLimpar.setBounds(360, 163, 95, 29);
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
		btSair.setBounds(465, 163, 85, 29);
		contentPane.add(btSair);

	}
}
