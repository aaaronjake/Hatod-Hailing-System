package hatod.view;

import javax.swing.*;
import java.awt.*;

public class AllView{

	
	public static void addPanel(JFrame frame, JPanel panel){
		panel.setBounds(0,0,500,500);
        panel.setLayout(null);
        panel.setOpaque(false);
        frame.add(panel);
	}
	public static void addLabel(JLabel label, JPanel panel, String text, int x, int y, int width, int height, int fontSize){
		label.setBounds(x,y,width,height);
		label.setText(text);
		label.setFont(new Font("Times New Roman", Font.BOLD, fontSize));
        label.setForeground(new Color(0xC9E7EB));
		panel.add(label);
	}

	public static void addImage(JFrame frame, JLabel label, String nameImage){
		ImageIcon image = new ImageIcon(nameImage);
		label.setBounds(0,-30,500,500);
		label.setIcon(image);
		frame.add(label);
	}

	public static void addTextField(JTextField textField, JPanel panel, int x, int y, int width, int height, int fontSize){
		textField.setBounds(x,y,width,height);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
		panel.add(textField);
	}

	public static void addPassField(JPasswordField passField, JPanel panel, int x, int y, int width, int height, int fontSize){
		passField.setBounds(x,y,width,height);
		passField.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
		panel.add(passField);
	}

	public static void addButton(JButton button, JPanel panel, String text, int x, int y, int width, int height, int fontSize){
		button.setBounds(x,y,width,height);
		button.setText(text);
		button.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
		panel.add(button);
	}
	public static void addButton(JButton button, String text, int x, int y, int width, int height, int fontSize){
		button.setBounds(x,y,width,height);
		button.setText(text);
		button.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
		
	}

	public static void clearFrame(JFrame frame){
		frame.getContentPane().removeAll();
		frame.validate();
		frame.repaint();
	}

}
