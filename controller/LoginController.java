package hatod.controller;

import hatod.view.AllView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginController{

    JTextField email;
    JPasswordField password;
    JButton loginBtn;
    JButton registerBtn;

	JFrame frame;

    public LoginController(){

		frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

        JLabel hatod = new JLabel();
        AllView.label(hatod, frame, "HATOD", 300, 70, 150, 50, 40);

        email = new JTextField();
        AllView.textField(email, frame, "Enter email", 304, 193, 160, 25, 12);

        password = new JPasswordField();
        AllView.passField(password, frame, 304, 244, 160, 25);

        loginBtn = new JButton();
        AllView.button(loginBtn, frame, "LOGIN", 345, 301, 96, 25, 12);

        registerBtn = new JButton();
        AllView.button(registerBtn, frame, "REGISTER", 345, 338, 96, 25, 12);

		frame.setVisible(true);
    }

    

}
