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

	//JFrame frame = new JFrame();
	JFrame fram = new JFrame();
	public LoginController(JFrame frame){

		fram = frame;
        	panel = new JPanel();
       		AllView.addPanel(frame, panel);
      
		image = new JLabel();
		AllView.addImage(frame, image, "LoginFrame.png");
			
		JLabel usernameLabel = new JLabel();
		AllView.addLabel(usernameLabel, panel, "USERNAME", 271,110,200,25,11);

		usernameTField = new JTextField("USERNAME");
		AllView.addTextField(usernameTField, panel, 271,130,185,25,12, "USERNAME");
	
		JLabel passLabel = new JLabel();
		AllView.addLabel(passLabel, panel, "PASSWORD", 271,170,200,25,11);

		passTField = new JPasswordField();
		AllView.addPassField(passTField, panel, 271,190,185,25,12);

		loginBtn = new JButton();
		AllView.addButton(loginBtn, panel, "LOGIN", 291, 260, 150, 35, 12);
		
		loginBtn.addActionListener(this);

		registerBtn = new JButton();
		AllView.addButton(registerBtn, panel, "REGISTER", 291, 300, 150, 35, 12);
		registerBtn.addActionListener(this);

	}
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource()==loginBtn){
			String fullName = usernameTField.getText();
			char[] passwordChars = passTField.getPassword();
            		String password = new String(passwordChars);

           		LoginModel loginModel = new LoginModel();
           		boolean loginSuccessful = loginModel.successfulLogin(fullName, password);

           	if(loginSuccessful){

           		AllView.removeFrame(fram);
           		new UserController(fram);
           		JOptionPane.showMessageDialog(panel, "REGISTERED SUCCESSFULLY");
           	} else{
           		JOptionPane.showMessageDialog(panel, "Registration Failed! Invalid input or username already exists");
           	}
		}
		if(event.getSource()==registerBtn){
			
			passengerBtn = new JButton();
			AllView.addButton(passengerBtn, panel, "REGISTER AS PASSENGER", 271,360, 185, 35, 12);
			passengerBtn.addActionListener(this);
			
			driverBtn = new JButton();
			AllView.addButton(driverBtn, panel, "REGISTER AS DRIVER", 271,400, 185, 35, 12);
			driverBtn.addActionListener(this);

			panel.revalidate();
			panel.repaint();
		}
		if(event.getSource()==passengerBtn){
			
			AllView.removeFrame(fram);
			new RegisterController(fram);
		}
		if(event.getSource()==driverBtn){
			
			AllView.removeFrame(fram);
			new DriverRegisterController(fram);
		}
	}

}
