package com.myjava.feereport;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeleteAccountant {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteAccountant window = new DeleteAccountant();
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
	public DeleteAccountant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel AccountantJlb = new JLabel("Delete Accountant");
		AccountantJlb.setForeground(Color.DARK_GRAY);
		AccountantJlb.setFont(new Font("Tahoma", Font.BOLD, 20));
		AccountantJlb.setBounds(130, 5, 251, 42);
		frame.getContentPane().add(AccountantJlb);

		JLabel lblNewLabel = new JLabel("Enter Accountant Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(20, 70, 251, 42);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(180, 70, 200, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sid=textField.getText();
				if(sid==null||sid.trim().equals("")){
					JOptionPane.showMessageDialog( null, DeleteAccountant.this,"Id can't be blank", 0);
				}else{
					int id=Integer.parseInt(sid);
					int i=AccountantDao.delete(id);
					if(i>0){
						JOptionPane.showMessageDialog(null, "Record deleted successfully!");
					}else{
						JOptionPane.showMessageDialog(null,"Unable to delete given id!");
					}
				}
			}
		});

		btnNewButton.setBounds(100, 150, 102, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminSection.main(new String[] {});
				frame.dispose();
			}
			
			
		});
		btnNewButton_1.setBounds(250, 150, 102, 34);
		frame.getContentPane().add(btnNewButton_1);
	}
}
