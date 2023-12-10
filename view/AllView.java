package hatod.view;

import javax.swing.*;
import java.awt.*;

public class AllView{

    public static void label(JLabel label, JFrame frame, String text, int x, int y, int width, int height, int fontSize){
        label.setBounds(x,y,width,height);
        label.setText(text);
        label.setFont(new Font("Times New Roman", Font.BOLD, fontSize));
        frame.add(label);
    }

    public static void textField(JTextField textField, JFrame frame, String text, int x, int y, int width, int height, int fontSize){
        textField.setBounds(x,y,width,height);
        textField.setText(text);
        textField.setFont(new Font("Times New Roman", Font.BOLD, fontSize));
        frame.add(textField);
    }

    public static void passField(JPasswordField passField, JFrame frame, int x, int y, int width, int height){
        passField.setBounds(x,y,width,height);
        frame.add(passField);
    }

    public static void button(JButton button, JFrame frame, String text, int x, int y, int width, int height, int fontSize){
        button.setBounds(x,y,width,height);
        button.setText(text);
        button.setFont(new Font("Times New Roman", Font.BOLD, fontSize));
        frame.add(button);
    }

    public static void clearFrame(JFrame frame){
		frame.getContentPane().removeAll();
		frame.repaint();
		frame.validate();
	}
    

}