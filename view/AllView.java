package hatod.view;

import javax.swing.*;
import java.awt.*;

public class AllView{

    public static void label(JLabel label, JPanel panel, String text, int x, int y, int width, int fontSize){
        label.setBounds(x,y,width,height);
        label.setText(text);
        label.setFont(new Font("Times New Roman", Font.BOLD, fontSize));
        panel.add(label);
    }

    public static void textField(JTextField textField, JPanel panel, int x, int y, int width, int height, int fontSize){
        textField.setBounds(x,y,width,height);
        textField.setFont(new Font("Times New Roman", Font.BOLD, fontSize));
        panel.add(textField);
    }

    public static void passField(JPasswordField passField, JPanel panel, int x, int y, int width, int height){
        passField.setBounds(x,y,width,height);
        panel.add(passField);
    }

    public static void button(JButton button, JPanel panel, String text, int x, int y, int width, int height, int fontSize){
        button.setBounds(x,y,width,height);
        button.setText(text);
        button.setFont(new Font("Times New Roman", Font.BOLD, fontSize));
        panel.add(button);
    }

    public static void addBackground()
    

}