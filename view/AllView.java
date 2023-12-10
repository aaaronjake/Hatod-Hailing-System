package hatod.view;

import javax.swing.*;
import java.awt.*;

public class AllView{

    public static void addPanel(JPanel panel, JFrame frame, int x, int y, int width, int height){
        panel.setBounds(x, y, width, height);
        frame.add(panel);
    }

    public static void addImage(ImageIcon image, JPanel panel, int x, int y){
        JLabel label = new JLabel(img);
      	label.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
      	panel.add(label);
    }

	public static void addlabel(JLabel label, JPanel panel, String text, int x, int y, int width, int height, int fontSize){
		label.setBounds(x,y,width,height);
		label.setText(text);
		label.setFont(new Font("Times New Roman", Font.BOLD, fontSize));
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

	public static void clearFrame(JFrame frame){
      frame.getContentPane().removeAll();
      frame.repaint();
      frame.validate();
    }

}
