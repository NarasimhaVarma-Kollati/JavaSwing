package proj2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calci extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci frame = new Calci();
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
	public Calci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb1 = new JLabel("First Number");
		lb1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lb1.setBounds(115, 103, 198, 40);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("Second Number");
		lb2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lb2.setBounds(115, 206, 198, 40);
		contentPane.add(lb2);
		
		textField = new JTextField();
		textField.setBounds(447, 112, 274, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(447, 215, 274, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    int num1 = Integer.parseInt(textField.getText()); // Parse text from textField
                    int num2 = Integer.parseInt(textField_1.getText()); // Parse text from textField_1
                    int sum = num1 + num2;
                    JOptionPane.showMessageDialog(null, "The sum is " + sum);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
                }
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton.setBounds(213, 290, 163, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUBTRACT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    int num1 = Integer.parseInt(textField.getText()); // Parse text from textField
                    int num2 = Integer.parseInt(textField_1.getText()); // Parse text from textField_1
                    int sum = num1 - num2;
                    JOptionPane.showMessageDialog(null, "The difference is " + sum);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
                }
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_1.setBounds(540, 290, 213, 50);
		contentPane.add(btnNewButton_1);
	}
}
