package hatod.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AllView{

	public AllView(){
		
	}
	public static void addPanel(JFrame frame, JPanel panel){
		panel.setBounds(0,0,500,500);
        	panel.setLayout(null);
        	panel.setOpaque(false);
        	frame.add(panel);
	}
	public static void addLabel(JLabel label, JPanel panel, String text, int x, int y, int width, int height, int fontSize){
		label.setBounds(x,y,width,height);
		label.setText(text);
		label.setFont(new Font("Inter", Font.BOLD, fontSize));
        label.setForeground(new Color(0x000000));
		panel.add(label);
	}
	public static void addLabel(JLabel label, JPanel panel, String text, int x, int y, int width, int height, int fontSize, int color){
		label.setBounds(x,y,width,height);
		label.setText(text);
		label.setFont(new Font("Inter", Font.BOLD, fontSize));
        label.setForeground(new Color(color));
		panel.add(label);
	}

	public static void addImage(JFrame frame, JLabel label, String imageName){
		ImageIcon image = new ImageIcon(imageName);
		label.setBounds(0,-20,500,500);
		label.setIcon(image);
		frame.add(label);
	}

	public static void addTextField(JTextField textField, JPanel panel, int x, int y, int width, int height, int fontSize, String text){
		textField.setBounds(x,y,width,height);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
		textField.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		textField.setBackground(new Color(0xEB8B48));
		
		textField.addFocusListener(new FocusListener(){
			public void focusGained(FocusEvent event){
				if (textField.getText().equals(text))
					textField.setText("");
			}
			public void focusLost(FocusEvent event){
				if (textField.getText().isEmpty())
					textField.setText(text);
			}
		});
		panel.add(textField);
	}

	public static void addTextField(JTextField textField, JPanel panel, int x, int y, int width, int height, int fontSize){
		textField.setBounds(x,y,width,height);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
		textField.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		textField.setBackground(new Color(0xEB8B48));
		panel.add(textField);
	}

	public static void addPassField(JPasswordField passField, JPanel panel, int x, int y, int width, int height, int fontSize){
		passField.setBounds(x,y,width,height);
		passField.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
		passField.setBorder(BorderFactory.createLineBorder(Color.RED));
		passField.setToolTipText("Password must contain at least 8 characters");
		passField.setBorder(BorderFactory.createLoweredBevelBorder());
		passField.setBackground(new Color(0xEB8B48));
		panel.add(passField);
	}

	public static void addButton(JButton button, JPanel panel, String text, int x, int y, int width, int height, int fontSize){
		button.setBounds(x,y,width,height);
		button.setText(text);
		button.setFont(new Font("Inter", Font.BOLD, fontSize));
		//button.setBackground(new Color(0x503830));
		//button.setForeground(new Color(0x000000));
		button.setFocusPainted(false);
		button.setBorder(BorderFactory.createEmptyBorder());
		panel.add(button);
	}
	public static void addButton(JButton button, JPanel panel, String text, int x, int y, int width, int height, int fontSize, int color){
		button.setBounds(x,y,width,height);
		button.setText(text);
		button.setFont(new Font("Inter", Font.BOLD, fontSize));
		//button.setBackground(new Color(color));
		//button.setForeground(new Color(0x000000));
		button.setFocusPainted(false);
		button.setBorder(BorderFactory.createEmptyBorder());
		panel.add(button);
	}
	public static void addButton(JButton button, String text, int x, int y, int width, int height, int fontSize){
		button.setBounds(x,y,width,height);
		button.setText(text);
		button.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
		button.setFocusPainted(false);
		button.setBorder(BorderFactory.createEmptyBorder());

	}

	public static void removeFrame(JFrame frame){
		frame.getContentPane().removeAll();
		frame.validate();
		frame.repaint();	
	}

}
