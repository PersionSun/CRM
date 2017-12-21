package com.crm.view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyJPanel extends JPanel{
	String url;
	int w;
	int h;
	
	public MyJPanel(String url,int w,int h){
		this.url = url;
		this.w = w;
		this.h = h;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img = null;
		try {
			img = ImageIO.read(new File(url));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		g.drawImage(img, 0, 0, w, h, null);
	}
}
