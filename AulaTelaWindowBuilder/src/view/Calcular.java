package view;

import java.awt.EventQueue;
import java.math.BigDecimal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Calcular extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValor;
	private JList<String> listaValores;

	private BigDecimal totalAcumulado = BigDecimal.ZERO;
	private DefaultListModel<String> modeloValores = new DefaultListModel<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcular frame = new Calcular();
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
	public Calcular() {
		setTitle("Calcular despesas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(30, 21, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtValor = new JTextField();
		txtValor.setBounds(30, 36, 159, 30);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JButton btSomar = new JButton("New button");
		btSomar.setBounds(199, 36, 89, 30);
		contentPane.add(btSomar);
		
		JLabel lblValoreAdicionados = new JLabel("Valore adicionados");
		lblValoreAdicionados.setBounds(30, 78, 134, 14);
		contentPane.add(lblValoreAdicionados);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 103, 276, 135);
		contentPane.add(scrollPane);

	}
}
