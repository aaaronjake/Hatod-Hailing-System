package hatod.controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import hatod.view.*;
import hatod.model.*;

public class LoginController implements ActionListener{
	JLabel image;
	JPanel panel;
	JTextField usernameTField;
	JPasswordField passTField;
	JButton loginBtn;
	JButton registerBtn;
	JButton passengerBtn;
	JButton driverBtn;

	JFrame frame = new JFrame();

	public LoginController(JFrame mainFrame){

		frame = mainFrame;

        panel = new JPanel();
        AllView.addPanel(mainFrame, panel);
      
		image = new JLabel();
		AllView.addImage(mainFrame, image, "LoginFrame.png");
			
		JLabel usernameLabel = new JLabel();
		AllView.addLabel(usernameLabel, panel, "USERNAME", 290,120,200,30,11);

		usernameTField = new JTextField();
		AllView.addTextField(usernameTField, panel, 290,140,185,30,12);
		
		JLabel passLabel = new JLabel();
		AllView.addLabel(passLabel, panel, "PASSWORD", 290,180,200,30,11);

		passTField = new JPasswordField();
		AllView.addPassField(passTField, panel, 290,200,185,30,12);

		loginBtn = new JButton();
		AllView.addButton(loginBtn, panel, "LOGIN", 310, 260, 150, 35, 12);
		loginBtn.addActionListener(this);

		registerBtn = new JButton();
		AllView.addButton(registerBtn, panel, "REGISTER", 310, 300, 150, 35, 12);
		registerBtn.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource()==loginBtn){
			AllView.clearFrame(frame);
			new UsersController(frame);
		}
		if(event.getSource()==registerBtn){
			driverBtn = new JButton();
			passengerBtn = new JButton();

			AllView.addButton(passengerBtn, "REGISTER AS PASSENGER", 292,360, 185, 35, 12);
			passengerBtn.addActionListener(this);
			panel.add(passengerBtn);

			AllView.addButton(driverBtn, "REGISTER AS DRIVER", 292,400, 185, 35, 12);
			panel.add(driverBtn);

			panel.revalidate();
			panel.repaint();
		}
		if(event.getSource()==passengerBtn){
			AllView.clearFrame(frame);	
			new RegisterController(frame);
		}
	}

}
