import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Pantalla{
	private Tablero tablero = new Tablero();
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla window = new Pantalla();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantalla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		tablero.inicializarTablero();
		frame = new JFrame();
		frame.setBounds(100, 100, 321, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton(" ");
		btnNewButton.setBounds(10, 11, 89, 71);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (tablero.getTablero(0,0).equals(" ")) {
					btnNewButton.setText("X");
					tablero.setTablero(0, 0, "X");
				}
				
				
			}
			
		});
		
		JButton btnNewButton_1 = new JButton(" ");
		btnNewButton_1.setBounds(10, 93, 89, 71);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(" ");
		btnNewButton_2.setBounds(10, 175, 89, 75);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(" ");
		btnNewButton_3.setBounds(109, 11, 89, 71);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton(" ");
		btnNewButton_4.setBounds(109, 93, 89, 71);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton(" ");
		btnNewButton_5.setBounds(109, 175, 89, 75);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton(" ");
		btnNewButton_6.setBounds(208, 11, 89, 71);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton(" ");
		btnNewButton_7.setBounds(208, 93, 89, 71);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton(" ");
		btnNewButton_8.setBounds(208, 175, 89, 75);
		frame.getContentPane().add(btnNewButton_8);
	}

}
