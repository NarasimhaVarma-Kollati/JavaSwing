package p3;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Disco extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Disco frame = new Disco();
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
	public Disco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		Thread t=new Thread(new Runnable() {
			public void run() {
				try {
					while(true) {
						contentPane.setBackground(Color.RED);
						Thread.sleep(100);
						contentPane.setBackground(Color.BLUE);
						Thread.sleep(100);
						contentPane.setBackground(Color.GREEN);
						Thread.sleep(100);
						contentPane.setBackground(Color.YELLOW);
						Thread.sleep(100);
						contentPane.setBackground(Color.ORANGE);
						Thread.sleep(100);
						
						
					}
					
				}
				catch(Exception e){}
			}
		});
		t.start();
	}

}
