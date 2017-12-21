package com.crm.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.crm.bean.User;
import com.crm.dao.UserDao;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField uname;
	private JPasswordField upwd;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginFrame.class.getResource("/res/icon/mima_xiugai.png")));
		setTitle("\u767B\u9646\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 300, 200);
		getContentPane().setLayout(null);
		
		MyJPanel panel = new MyJPanel("src/res/login.jpg",300,160);
		panel.setBounds(0, 0, 284, 162);
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(99, 34, 54, 15);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6  \u7801");
		label_1.setBounds(99, 59, 54, 15);
		panel.add(label_1);
		
		uname = new JTextField();
		uname.setBounds(157, 31, 66, 21);
		panel.add(uname);
		uname.setColumns(10);
		
		upwd = new JPasswordField();
		upwd.setBounds(157, 56, 66, 21);
		panel.add(upwd);
		
		JButton loginBtn = new JButton("");
		loginBtn.setIcon(new ImageIcon(LoginFrame.class.getResource("/res/loginButton.jpg")));
		loginBtn.setBounds(99, 98, 48, 23);
		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String name = uname.getText();
				String pwd = upwd.getText();
				User user = new UserDao().checkLogin(name, pwd);
				if(user==null){
					JOptionPane.showConfirmDialog(null, "用户名或密码错误！！");
				}else{
					JOptionPane.showConfirmDialog(null, "登陆成功！");
					LoginFrame.this.dispose();//关闭登录页面
					new MainFrame();//显示主界面
				}
			}
		});
		panel.add(loginBtn);
		
		JButton exitBtn = new JButton("");
		exitBtn.setIcon(new ImageIcon(LoginFrame.class.getResource("/res/exitButton.jpg")));
		exitBtn.setBounds(180, 98, 48, 23);
		panel.add(exitBtn);
	    
		
	}
}
