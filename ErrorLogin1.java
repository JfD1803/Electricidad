package electricidad;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;

public class ErrorLogin1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	FondoPanel fondo = new FondoPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorLogin1 frame = new ErrorLogin1();
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
	public ErrorLogin1() {
		setBackground(new Color(0, 0, 255));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		
		
		FondoPanel panel_Imagen = new FondoPanel();
		panel_Imagen.setBackground(new Color(0, 0, 255));
		panel_Imagen.setBounds(0, 0, 400, 250);
		contentPane.add(panel_Imagen);
		panel_Imagen.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setForeground(new Color(0, 200, 255));
		lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(97, 70, 202, 103);
		panel_Imagen.add(lblNewLabel);
		
		
	}
	
	class FondoPanel extends JPanel {
		private Image Imagen;
		
		@Override
		public void paint (Graphics g) {
			Imagen = new ImageIcon(getClass().getResource("/Imagenes/Átomo_Fondo.png")).getImage();
			g.drawImage(Imagen, 0, 0, getWidth(), getHeight(), this);
			setOpaque(false);
			super.paint(g);
		}
		
	}
	
}
