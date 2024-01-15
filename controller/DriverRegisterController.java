package hatod.controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import hatod.view.*;
import hatod.model.*;

public class DriverRegisterController implements ActionListener{

	JLabel image;
	JPanel panel;
	JTextField usernameTField;
	JTextField emailTField;
	JTextField numberTField;
	JTextField plateNumberTField;
	JPasswordField passTField;
	JButton registerBtn;
	JButton cancelBtn;
	JFrame fram = new JFrame();
	public DriverRegisterController(JFrame frame){
		fram = frame;
        	panel = new JPanel();
        	AllView.addPanel(frame, panel);
		
		image = new JLabel();
		AllView.addImage(frame, image, "Hatod New.png");

		JLabel emailLabel = new JLabel();
		AllView.addLabel(emailLabel, panel, "EMAIL", 271,110,200,20,11);
		emailTField = new JTextField("EMAIL");
		AllView.addTextField(emailTField, panel, 271,130,185,20,12, "EMAIL");
		
		JLabel usernameLabel = new JLabel();
		AllView.addLabel(usernameLabel, panel, "USERNAME", 271,160,200,20,11);
		usernameTField = new JTextField("USERNAME");
		AllView.addTextField(usernameTField, panel, 271,180,185,20,12, "USERNAME");

		JLabel numberLabel = new JLabel();
		AllView.addLabel(numberLabel, panel, "PHONE NUMBER", 271,210,200,20,11);
		numberTField = new JTextField("PHONE NUMBER");
		AllView.addTextField(numberTField, panel, 271,230,185,20,12, "PHONE NUMBER");

		JLabel plateNumberLabel = new JLabel();
		AllView.addLabel(plateNumberLabel, panel, "MOTORVEHICLE PLATE", 271,260,200,20,11);
		plateNumberTField = new JTextField("MOTORVEHICLE PLATE");
		AllView.addTextField(plateNumberTField, panel, 271,280,185,20,12, "MOTORVEHICLE PLATE");

		JLabel passLabel = new JLabel();
		AllView.addLabel(passLabel, panel, "PASSWORD", 271,310,200,20,11);
		passTField = new JPasswordField();
		AllView.addPassField(passTField, panel, 271,330,185,20,12);
		
		registerBtn = new JButton();
		AllView.addButton(registerBtn, panel, "REGISTER", 361, 390, 100, 35, 12);
		registerBtn.addActionListener(this);

		cancelBtn = new JButton();
		AllView.addButton(cancelBtn, panel, "CANCEL", 266, 390, 90, 35, 12);
		cancelBtn.addActionListener(this);  
		
	}
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource()==cancelBtn){
			AllView.removeFrame(fram);
	
			new LoginController(fram);
		}
		if(event.getSource()==registerBtn) {
	            String fullName = usernameTField.getText();
	            char[] passwordChars = passTField.getPassword();
	            String password = new String(passwordChars);
	
	            RegisterModel registerModel = new RegisterModel();
	
	            boolean registrationSuccessful = registerModel.registerUser(fullName, password);
	
	            if (registrationSuccessful) {
	                usernameTField.setText("");
	                emailTField.setText("");
	                passTField.setText("");
	                numberTField.setText("");
	                plateNumberTField.setText("");
	                JOptionPane.showMessageDialog(panel, "REGISTERED SUCCESSFULLY");
	            } else 
	                JOptionPane.showMessageDialog(panel, "Registration Failed! Invalid input or username already exists");
	        }
	}

}