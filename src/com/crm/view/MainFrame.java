package com.crm.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/res/icon/shangpin_guanli.png")));
		setTitle("\u7ECF\u9500\u5B58\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 514);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 782, 21);
		getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u8FDB\u8D27\u7BA1\u7406(J)");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem = new JMenuItem("\u8FDB\u8D27\u5355");
		menuItem.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/jinhuodan.png")));
		mnNewMenu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u8FDB\u8D27\u9000\u8D27");
		menuItem_1.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/jinhuo_tuihuo.png")));
		mnNewMenu.add(menuItem_1);
		
		JMenu mnx = new JMenu("\u9500\u552E\u7BA1\u7406(X)");
		menuBar.add(mnx);
		
		JMenuItem menuItem_2 = new JMenuItem("\u9500\u552E\u5355");
		menuItem_2.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/xiaoshoudan.png")));
		mnx.add(menuItem_2);
		
		JMenu mnk = new JMenu("\u5E93\u5B58\u7BA1\u7406(K)");
		menuBar.add(mnk);
		
		JMenuItem menuItem_3 = new JMenuItem("\u5E93\u5B58\u76D8\u70B9");
		menuItem_3.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/kucun_pandian.png")));
		mnk.add(menuItem_3);
		
		JMenu mnc = new JMenu("\u4FE1\u606F\u67E5\u8BE2(C)");
		menuBar.add(mnc);
		
		JMenuItem menuItem_4 = new JMenuItem("\u9500\u552E\u67E5\u8BE2");
		menuItem_4.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/xiaoshou_chaxun.png")));
		mnc.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("\u5546\u54C1\u67E5\u8BE2");
		menuItem_5.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/shangpin_chaxun.png")));
		mnc.add(menuItem_5);
		
		JMenu mnb = new JMenu("\u57FA\u672C\u8D44\u6599(B)");
		menuBar.add(mnb);
		
		JMenuItem menuItem_6 = new JMenuItem("\u5546\u54C1\u7BA1\u7406");
		menuItem_6.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/shangpin_guanli.png")));
		mnb.add(menuItem_6);
		
		JMenuItem menuItem_7 = new JMenuItem("\u5BA2\u6237\u7BA1\u7406");
		menuItem_7.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/kehu_guanli.png")));
		mnb.add(menuItem_7);
		
		JMenuItem menuItem_8 = new JMenuItem("\u7ECF\u9500\u5546\u7BA1\u7406");
		menuItem_8.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/gys_guanli.png")));
		mnb.add(menuItem_8);
		
		JMenu mns = new JMenu("\u7CFB\u7EDF\u7EF4\u62A4(S)");
		menuBar.add(mns);
		
		JMenuItem menuItem_9 = new JMenuItem("\u4FEE\u6539\u5BC6\u7801");
		menuItem_9.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/mima_xiugai.png")));
		mns.add(menuItem_9);
		
		JMenuItem menuItem_10 = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		menuItem_10.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/tuichu_xitong.png")));
		mns.add(menuItem_10);
		
		JMenu mnh = new JMenu("\u5E2E\u52A9(H)");
		menuBar.add(mnh);
		
		JMenuItem menuItem_11 = new JMenuItem("\u5173\u4E8E");
		menuItem_11.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/guanyu.png")));
		mnh.add(menuItem_11);
		
		JMenuItem menuItem_12 = new JMenuItem("\u8BBF\u95EE\u6280\u672F\u7F51\u7AD9");
		menuItem_12.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/jishu_wangzhan.png")));
		mnh.add(menuItem_12);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 20, 782, 38);
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JButton button = new JButton("\u8FDB\u8D27\u5355");
		button.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/jinhuodan.png")));
		button.setBounds(0, 10, 93, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("\u9500\u552E\u5355");
		button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/xiaoshoudan.png")));
		button_1.setBounds(99, 10, 93, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u5E93\u5B58\u76D8\u70B9");
		button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/kucun_pandian.png")));
		button_2.setBounds(196, 10, 108, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("\u5546\u54C1\u67E5\u8BE2");
		button_3.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/shangpin_chaxun.png")));
		button_3.setBounds(310, 10, 108, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("\u5546\u54C1\u7BA1\u7406");
		button_4.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/shangpin_guanli.png")));
		button_4.setBounds(424, 10, 108, 23);
		panel.add(button_4);
		
		JButton button_5 = new JButton("\u5BA2\u6237\u7BA1\u7406");
		button_5.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/kehu_guanli.png")));
		button_5.setBounds(537, 10, 108, 23);
		panel.add(button_5);
		
		JButton button_6 = new JButton("\u4F9B\u5E94\u5546\u7BA1\u7406");
		button_6.setIcon(new ImageIcon(MainFrame.class.getResource("/res/icon/gys_guanli.png")));
		button_6.setBounds(650, 10, 122, 23);
		panel.add(button_6);
		
		MyJPanel panel_1 = new MyJPanel("src/res/back.jpg",782,390);
		panel_1.setBounds(0, 55, 782, 390);
		getContentPane().add(panel_1);
		
		JLabel label = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u672C\u7CFB\u7EDF");
		label.setBounds(22, 445, 126, 31);
		getContentPane().add(label);
		setVisible(true);
	}
}
