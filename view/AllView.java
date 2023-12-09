package grade.sheet.controller;

import javax.swing.*;
import java.awt.*;

class AllView{

	AllView(){
		

	}
	// public static void addpanel()
	public static void addlabel(JLabel label, JPanel panel, String text, int x, int y, int width, int height, int fontSize){
		label.setBounds(x,y,width,height);
		label.setText(text);
		label.setFont(new Font("Times New Roman", Font.BOLD, fontSize));
        label.setForeground(new Color(0xC9E7EB));
		panel.add(label);
	}

	public static void addtextField(JTextField textField, JPanel panel, int x, int y, int width, int height, int fontSize){
		textField.setBounds(x,y,width,height);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
		panel.add(textField);
	}

	public static void addpassField(JPasswordField passField, JPanel panel, int x, int y, int width, int height, int fontSize){
		passField.setBounds(x,y,width,height);
		passField.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
		panel.add(passField);
	}

	public static void addbutton(JButton button, JPanel panel, String text, int x, int y, int width, int height, int fontSize){
		button.setBounds(x,y,width,height);
		button.setText(text);
		button.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
		panel.add(button);
	}

}
