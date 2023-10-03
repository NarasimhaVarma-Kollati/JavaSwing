package p4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Checkbox extends JFrame {
	boolean p=false,f=false,m=false,c=false;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkbox frame = new Checkbox();
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
	public Checkbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please choose the dishes you like!!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(187, 26, 455, 35);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("POTATO");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					p=true;
				}
				else {
					p=false;
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 25));
		chckbxNewCheckBox.setBounds(187, 107, 230, 39);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("FISH");
		chckbxNewCheckBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					f=true;
				}
				else {
					f=false;
				}
			}
		});
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		chckbxNewCheckBox_1.setBounds(187, 167, 130, 35);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("MEAT");
		chckbxNewCheckBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					m=true;
				}
				else {
					m=false;
				}
			}
		});
		chckbxNewCheckBox_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		chckbxNewCheckBox_2.setBounds(187, 228, 147, 29);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("CARROT");
		chckbxNewCheckBox_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					c=true;
				}
				else {
					c=false;
				}
			}
		});
		chckbxNewCheckBox_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		chckbxNewCheckBox_3.setBounds(187, 280, 147, 47);
		contentPane.add(chckbxNewCheckBox_3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="You like ";
				if(p==true) {
					msg+="POTATO ";
				}
				if(f==true) {
					msg+="FISH ";
				}
				if(m==true) {
					msg+="MEAT ";
				}
				if(c==true) {
					msg+="CARROT ";
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton.setBounds(573, 306, 193, 35);
		contentPane.add(btnNewButton);
	}
}
