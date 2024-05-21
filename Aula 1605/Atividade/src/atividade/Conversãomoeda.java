package atividade;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;



public class Conversãomoeda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfDolar;
	private JTextField tfDinheiro;
	private JTextField tfDolarR;
	private JTextField tfRealR;
	private final ButtonGroup BtnRd = new ButtonGroup();
	private JButton btnSair_1;

	/**
	 * Launch the application.
	 */
	
	DecimalFormat df = new DecimalFormat();
	
	double cotacao = 0;
	double valorD =0;
	double resultado = 0;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversãomoeda frame = new Conversãomoeda();
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
	public Conversãomoeda() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1052, 627);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(UIManager.getBorder("RadioButton.border"));
		panel.setBounds(27, 11, 984, 189);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitle = new JLabel("Conversor de Coins");
		lblTitle.setForeground(Color.CYAN);
		lblTitle.setFont(new Font("Arial Black", Font.BOLD, 31));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(168, 53, 554, 80);
		panel.add(lblTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(87, 211, 866, 325);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbldolar = new JLabel("Insira a cotação do Dolar");
		lbldolar.setForeground(Color.CYAN);
		lbldolar.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lbldolar.setHorizontalAlignment(SwingConstants.CENTER);
		lbldolar.setBounds(10, 49, 372, 42);
		panel_1.add(lbldolar);
		
		JLabel lblDinheiro = new JLabel("Insira o Valor em DInheiro");
		lblDinheiro.setForeground(Color.CYAN);
		lblDinheiro.setHorizontalAlignment(SwingConstants.CENTER);
		lblDinheiro.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lblDinheiro.setBounds(10, 127, 372, 42);
		panel_1.add(lblDinheiro);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 180, 866, 2);
		panel_1.add(separator);
		
		tfDolar = new JTextField();
		tfDolar.setBounds(420, 49, 236, 37);
		panel_1.add(tfDolar);
		tfDolar.setColumns(10);
		
		tfDinheiro = new JTextField();
		tfDinheiro.setColumns(10);
		tfDinheiro.setBounds(420, 127, 236, 37);
		panel_1.add(tfDinheiro);
		
		JLabel lblNewLabel_2 = new JLabel("Dolar");
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(45, 201, 77, 38);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Real");
		lblNewLabel_2_1.setForeground(Color.CYAN);
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 21));
		lblNewLabel_2_1.setBounds(45, 262, 77, 38);
		panel_1.add(lblNewLabel_2_1);
		
		tfDolarR = new JTextField();
		tfDolarR.setEditable(false);
		tfDolarR.setColumns(10);
		tfDolarR.setBounds(115, 201, 236, 37);
		panel_1.add(tfDolarR);
		
		tfRealR = new JTextField();
		tfRealR.setEditable(false);
		tfRealR.setColumns(10);
		tfRealR.setBounds(115, 263, 236, 37);
		panel_1.add(tfRealR);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDolar.setText("");
				tfDinheiro.setText("");
				tfDolarR.setText("");
				tfRealR.setText("");
				BtnRd.clearSelection();
				
			}
		});
		btnLimpar.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnLimpar.setBounds(652, 240, 102, 42);
		panel_1.add(btnLimpar);
		
		JButton btnSair_1 = new JButton("Sair");
		btnSair_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnSair_1.setForeground(Color.black);
		btnSair_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(null, "Deseja Sair do Programa?", "Confirmação", JOptionPane.YES_NO_OPTION);
				if (confirm ==JOptionPane.YES_OPTION) {
					System.exit(1);	
				}
				
			}
		});
		btnSair_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnSair_1.setBounds(451, 240, 102, 42);
		panel_1.add(btnSair_1);
	

		
		JRadioButton rdbtnDolar = new JRadioButton("");
		rdbtnDolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dolar();
			}
		});
		BtnRd.add(rdbtnDolar);
		rdbtnDolar.setBackground(Color.GRAY);
		rdbtnDolar.setBounds(13, 214, 26, 23);
		panel_1.add(rdbtnDolar);
		
		JRadioButton rdbtnReal = new JRadioButton("");
		rdbtnReal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				real();
			}
		});
		BtnRd.add(rdbtnReal);
		rdbtnReal.setBackground(Color.GRAY);
		rdbtnReal.setBounds(13, 275, 26, 23);
		panel_1.add(rdbtnReal);
}
        public void dados() {
        	
        }
        
        public void real() {
        	tfDolarR.setText("");
        	cotacao = Double.parseDouble(tfDolar.getText());
        	valorD = Double.parseDouble(tfDinheiro.getText());
        	resultado = (cotacao*valorD);
        	df.applyPattern("R$ #,##0.00");
        	tfRealR.setText(df.format(resultado));
        	
        	
        	
        }
        
        public void dolar() {
        	tfRealR.setText("");
        	cotacao = Double.parseDouble(tfDolar.getText());
        	valorD = Double.parseDouble(tfDinheiro.getText());
        	resultado = (valorD/cotacao);
        	df.applyPattern("U$ #,##0.00");
            tfDolarR.setText(df.format(resultado));
        	
        }

}