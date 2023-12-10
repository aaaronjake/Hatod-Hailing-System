package hatod.controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import hatod.view.*;
import hatod.model.*;

public class RegisterController implements ActionListener{

	JLabel image;
	JPanel panel;
	JTextField usernameTField;
	JPasswordField passTField;
	JButton registerBtn;
	JButton cancelBtn;
	JFrame frame = new JFrame();
	public RegisterController(JFrame mainFrame){
		frame = mainFrame;
        panel = new JPanel();
        AllView.addPanel(mainFrame, panel);
		
		image = new JLabel();
		AllView.addImage(mainFrame, image, "LoginFrame.png");
		
		JLabel usernameLabel = new JLabel();
		AllView.addLabel(usernameLabel, panel, "USERNAME", 290,140,200,30,11);

		usernameTField = new JTextField();
		AllView.addTextField(usernameTField, panel, 290,170,185,30,12);
		
		JLabel passLabel = new JLabel();
		AllView.addLabel(passLabel, panel, "PASSWORD", 290,210,200,30,11);

		passTField = new JPasswordField();
		AllView.addPassField(passTField, panel, 290,240,185,30,12);

		registerBtn = new JButton();
		AllView.addButton(registerBtn, panel, "REGISTER", 310, 310, 150, 35, 12);
		registerBtn.addActionListener(this);

		cancelBtn = new JButton();
		AllView.addButton(cancelBtn, panel, "CANCEL", 310, 350, 150, 35, 12);
		cancelBtn.addActionListener(this);  
		
	}


	public void actionPerformed(ActionEvent event){
	if(event.getSource()==cancelBtn){
		
		frame.getContentPane().removeAll();
		frame.validate();
		frame.repaint();

		new LoginController(frame);
	}
	if(event.getSource()==registerBtn) {
            String fullName = usernameTField.getText();
            // String emailAddress = emailAddressTextField.getText();
            char[] passwordChars = passTField.getPassword();
            String password = new String(passwordChars);

            RegisterModel registerModel = new RegisterModel();

            boolean registrationSuccessful = registerModel.registerUser(fullName, password);

            if (registrationSuccessful) {
                usernameTField.setText("");
                // emailAddressTextField.setText("");
                passTField.setText("");

                
                JOptionPane.showMessageDialog(panel, "REGISTERED SUCCESSFULLY");
            } else {
                JOptionPane.showMessageDialog(panel, "Registration Failed! Invalid input or username already exists");
            }
        }
	}

}