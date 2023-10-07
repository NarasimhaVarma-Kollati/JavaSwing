package p5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;

public class combo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					combo frame = new combo();
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
	public combo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 20));
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					if(!comboBox.getSelectedItem().toString().equals("Choose")) {
						JOptionPane.showMessageDialog(null,comboBox.getSelectedItem().toString()+" is Selected");
					}
				}
				
			}
		});
		comboBox.setBounds(230, 103, 235, 48);
		contentPane.add(comboBox);
		comboBox.addItem("Choose");
		comboBox.addItem("London");
		comboBox.addItem("Australia");
		comboBox.addItem("London");
		comboBox.addItem("Japan");
		
	}
}
