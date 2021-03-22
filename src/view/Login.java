package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setSize(new Dimension(825, 949));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 1150);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(825, 882));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		txtSenha = new JPasswordField();
		txtSenha.setFont(new Font("Tahoma", Font.BOLD, 34));
		txtSenha.setBounds(292, 646, 265, 51);
		contentPane.add(txtSenha);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblSenha.setBounds(349, 585, 148, 51);
		contentPane.add(lblSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.BOLD, 34));
		txtUsuario.setBounds(292, 514, 265, 51);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblUsuario.setBounds(349, 453, 148, 51);
		contentPane.add(lblUsuario);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBounds(349, 361, 148, 51);
		contentPane.add(lblLogin);
		
		JLabel lblPainelLogin = new JLabel("");
		lblPainelLogin.setSize(new Dimension(825, 882));
		lblPainelLogin.setIcon(new ImageIcon(Login.class.getResource("/view/imagens/painel-login.png")));
		lblPainelLogin.setBounds(126, 307, 570, 512);
		contentPane.add(lblPainelLogin);
		
		JLabel lblTelaDeFundo = new JLabel("");
		lblTelaDeFundo.setLocation(0, 0);
		lblTelaDeFundo.setSize(new Dimension(825, 1150));
		lblTelaDeFundo.setIcon(new ImageIcon(Login.class.getResource("/view/imagens/Logo.jpg")));
		contentPane.add(lblTelaDeFundo);
	}
}
