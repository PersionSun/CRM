package com.crm.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class UserFrame extends JFrame {

	private JPanel contentPane;
	JPanel panel_1;
	CardLayout card = new CardLayout(0,0);
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserFrame frame = new UserFrame();
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
	public UserFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UserFrame.class.getResource("/res/icon/mima_xiugai.png")));
		setTitle("\u7528\u6237\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 48);
		getContentPane().add(panel);
		
		JButton changepwdBtn = new JButton("\u4FEE\u6539\u5BC6\u7801");
		panel.add(changepwdBtn);
		
		JButton adduserBtn = new JButton("\u6DFB\u52A0\u7528\u6237");
		panel.add(adduserBtn);
		
		JPanel panel_1 = new JPanel(card);
		panel_1.setBounds(0, 47, 434, 215);
		getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_1.add(panel_2,"A");
		
		JLabel label = new JLabel("\u7528\u6237\u540D:");
		label.setBounds(96, 42, 54, 15);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("\u539F\u5BC6\u7801:");
		label_1.setBounds(96, 78, 54, 15);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("\u65B0\u5BC6\u7801:");
		label_2.setBounds(96, 112, 54, 15);
		panel_2.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(182, 39, 151, 21);
		panel_2.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 75, 151, 21);
		panel_2.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(182, 109, 151, 21);
		panel_2.add(passwordField_1);
		
		JButton button = new JButton("\u6E05\u7A7A");
		button.setBounds(96, 157, 93, 35);
		panel_2.add(button);
		
		JButton button_1 = new JButton("\u786E\u5B9A");
		button_1.setBounds(240, 157, 93, 35);
		panel_2.add(button_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_1.add(panel_3, "B");
	}
}
