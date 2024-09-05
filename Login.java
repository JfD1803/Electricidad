package electricidad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Color;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;

import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import java.awt.Panel;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;


public class Login extends JFrame implements ActionListener {
	
	int xMouse, yMouse;
	private JPanel contentPane;
	private JTextField txtIngreseSuUsuario;
	private JPasswordField passwordField;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hacker-F\\Desktop\\icono barra.png"));
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JPanel Background = new JPanel();
		Background.setBackground(new Color(255, 255, 255));
		Background.setBounds(0, 0, 833, 500);
		contentPane.add(Background);
		Background.setLayout(null);
		
		JLabel Lbl1 = new JLabel("Usuario:");
		Lbl1.setForeground(new Color(0, 0, 255));
		Lbl1.setFont(new Font("Modern No. 20", Font.PLAIN, 31));
		Lbl1.setBounds(186, 198, 175, 43);
		Background.add(Lbl1);
		
		JLabel Lbl2 = new JLabel("Contraseña:");
		Lbl2.setForeground(new Color(0, 0, 255));
		Lbl2.setFont(new Font("Modern No. 20", Font.PLAIN, 31));
		Lbl2.setBounds(186, 252, 175, 43);
		Background.add(Lbl2);
		
		JLabel Lbl3 = new JLabel("Programa De  Electricidad");
		Lbl3.setForeground(new Color(0, 0, 255));
		Lbl3.setFont(new Font("Modern No. 20", Font.PLAIN, 31));
		Lbl3.setBounds(236, 93, 341, 43);
		Background.add(Lbl3);
		
		txtIngreseSuUsuario = new JTextField();
		txtIngreseSuUsuario.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		txtIngreseSuUsuario.setForeground(new Color(120, 187, 32));
		txtIngreseSuUsuario.setBorder(new LineBorder(new Color(120, 187, 32), 1, true));
		txtIngreseSuUsuario.setText("Ingrese su usuario");
		txtIngreseSuUsuario.setBounds(371, 198, 248, 35);
		Background.add(txtIngreseSuUsuario);
		txtIngreseSuUsuario.setColumns(10);
		
		passwordField = new JPasswordField("********");
		passwordField.setBorder(new LineBorder(new Color(120, 187, 32), 1, true));
		passwordField.setForeground(new Color(120, 187, 32));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		passwordField.setBounds(371, 252, 248, 35);
		Background.add(passwordField);
		
		Panel PanelSalir = new Panel();
		PanelSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		PanelSalir.setBackground(new Color(120, 187, 32));
		PanelSalir.setBounds(795, 10, 27, 25);
		Background.add(PanelSalir);
		PanelSalir.setLayout(null);
		
		Label LblSalir = new Label("X");
		LblSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		
			@Override
			public void mouseEntered(MouseEvent e) {
				LblSalir.setBackground(new Color(204, 50, 118));
				LblSalir.setForeground(new Color(120, 187, 32));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				LblSalir.setBackground(new Color(120, 187, 32));
				LblSalir.setForeground(new Color(255, 255, 255));
			}
		});
		LblSalir.setForeground(new Color(255, 255, 255));
		LblSalir.setFont(new Font("Modern No. 20", Font.BOLD | Font.ITALIC, 12));
		LblSalir.setAlignment(Label.CENTER);
		LblSalir.setBounds(0, 0, 27, 25);
		PanelSalir.add(LblSalir);
		
		Panel BotonEntrar = new Panel();
		BotonEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BotonEntrar.setBackground(new Color(120, 187, 32));
		BotonEntrar.setBounds(335, 381, 119, 25);
		Background.add(BotonEntrar);
		BotonEntrar.setLayout(null);
		
		Label LblEntrar = new Label("Entrar");
		LblEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				LblEntrar.setBackground(new Color(23, 104, 14));
				LblEntrar.setForeground(new Color(120, 187, 32));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				LblEntrar.setBackground(new Color(120, 187, 32));
				LblEntrar.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				String Usuario = txtIngreseSuUsuario.getText();
				String Contraseña = String.valueOf(passwordField.getPassword());
				if (Usuario.equals("Juan") && Contraseña.equals("1803") ) {
					ErrorLogin1 ob1 = new ErrorLogin1();
					ob1.setVisible(true);
				    dispose();
					
				}
				if(Usuario.isEmpty() || Contraseña.isEmpty()) {
					ErrorLogin2 ob1 = new ErrorLogin2();
					ob1.setVisible(true);
					dispose();
					ob1.setVisible(false);
				}
			}
		});
		LblEntrar.setFont(new Font("Modern No. 20", Font.BOLD, 16));
		LblEntrar.setForeground(new Color(255, 255, 255));
		LblEntrar.setBounds(0, 0, 119, 25);
		BotonEntrar.add(LblEntrar);
		LblEntrar.setAlignment(Label.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/Átomo_Fondo.png")));
		lblNewLabel.setBounds(0, 0, 833, 500);
		Background.add(lblNewLabel);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
