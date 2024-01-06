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
		AllView.addImage(frame, image, "1.png");

		JLabel emailLabel = new JLabel();
		AllView.addLabel(emailLabel, panel, "EMAIL", 290,110,200,20,11);
		emailTField = new JTextField("EMAIL");
		AllView.addTextField(emailTField, panel, 290,130,185,20,12, "EMAIL");
		

		JLabel usernameLabel = new JLabel();
		AllView.addLabel(usernameLabel, panel, "USERNAME", 290,155,200,20,11);
		usernameTField = new JTextField("USERNAME");
		AllView.addTextField(usernameTField, panel, 290,175,185,20,12, "USERNAME");

		JLabel numberLabel = new JLabel();
		AllView.addLabel(numberLabel, panel, "PHONE NUMBER", 290,205,200,20,11);
		numberTField = new JTextField("PHONE NUMBER");
		AllView.addTextField(numberTField, panel, 290,225,185,20,12, "PHONE NUMBER");

		JLabel plateNumberLabel = new JLabel();
		AllView.addLabel(plateNumberLabel, panel, "MOTORVEHICLE PLATE", 290,255,200,20,11);
		plateNumberTField = new JTextField("MOTORVEHICLE PLATE");
		AllView.addTextField(plateNumberTField, panel, 290,275,185,20,12, "MOTORVEHICLE PLATE");

		JLabel passLabel = new JLabel();
		AllView.addLabel(passLabel, panel, "PASSWORD", 290,305,200,20,11);
		passTField = new JPasswordField();
		AllView.addPassField(passTField, panel, 290,325,185,20,12);

		
		registerBtn = new JButton();
		AllView.addButton(registerBtn, panel, "REGISTER", 380, 360, 100, 35, 12);
		registerBtn.addActionListener(this);

		cancelBtn = new JButton();
		AllView.addButton(cancelBtn, panel, "CANCEL", 285, 360, 90, 35, 12);
		cancelBtn.addActionListener(this);  
		
	}


	public void actionPerformed(ActionEvent event){
	if(event.getSource()==cancelBtn){
		AllView.removeFrame(fram);

		new LoginController(fram);
	}
	if(event.getSource()==registerBtn) {
            String fullName = usernameTField.getText();
            String emailAddress = emailTField.getText();
            char[] passwordChars = passTField.getPassword();
            String password = new String(passwordChars);

            RegisterModel registerModel = new RegisterModel();

            boolean registrationSuccessful = registerModel.registerUser(fullName, password, emailAddress);

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
