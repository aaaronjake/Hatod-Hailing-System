package hatod.controller;



import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import hatod.view.*;

import hatod.model.*;



public class AdminController implements ActionListener{



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

	

	public AdminController(JFrame frame){

		fram = frame;

        	panel = new JPanel();

        	AllView.addPanel(frame, panel);

		

		image = new JLabel();

		AllView.addImage(frame, image);



		JLabel emailLabel = new JLabel();

		AllView.addLabel(emailLabel, panel, "EMAIL", 290,110,200,20,11);

		emailTField = new JTextField();

		AllView.addTextField(emailTField, panel, 290,130,185,20,12);



		JLabel nameLabel = new JLabel();

		AllView.addLabel(nameLabel, panel, "NAME", 290,155,200,20,11);

		nameTField = new JTextField();

		AllView.addTextField(nameTField, panel, 290,175,185,20,12);



		JLabel numberLabel = new JLabel();

		AllView.addLabel(numberLabel, panel, "PHONE NUMBER", 290,205,200,20,11);

		numberTField = new JTextField();

		AllView.addTextField(numberTField, panel, 290,225,185,20,12);



		JLabel passLabel = new JLabel();

		AllView.addLabel(passLabel, panel, "PASSWORD", 290,255,200,20,11);

		passTField = new JPasswordField();

		AllView.addPassField(passTField, panel, 290,275,185,20,12);



	


		confirmBtn = new JButton();

		AllView.addButton(registerBtn, panel, "REGISTER", 290,305,200,20,11

		registerBtn.addActionListener(this);

		


	}

	public void actionPerformed(ActionEvent event){

		if(event.getSource()==cancelBtn){

			fram.getContentPane().removeAll();

			fram.validate();

			fram.repaint();

			new LoginController(fram);

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

    
