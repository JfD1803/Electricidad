package electricidad;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class ErrorLogin2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorLogin2 frame = new ErrorLogin2();
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
	public ErrorLogin2() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		FondoPanel panel = new FondoPanel();
		panel.setBounds(0, 0, 400, 250);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Faltan Datos ");
		lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(97, 70, 202, 103);
		panel.add(lblNewLabel);
		
		Login ob1 = new Login();
		ob1.setVisible(true);
		this.setVisible(false);
		
		
		
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


