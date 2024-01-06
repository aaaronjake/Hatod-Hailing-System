package hatod.controller;

//import javafx.scene.control.TextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import hatod.view.*;
import hatod.model.*;

public class RegisterController implements ActionListener{

	JLabel image;
	JPanel panel;
	JTextField emailTField;
	JTextField usernameTField;
	JTextField numberTField;
	JPasswordField passTField;
	JButton registerBtn;
	JButton cancelBtn;
	JFrame fram = new JFrame();
	public RegisterController(JFrame frame){
		fram = frame;
        panel = new JPanel();
        AllView.addPanel(frame, panel);
		
		image = new JLabel();
		AllView.addImage(frame, image, "1.png");
		
		JLabel emailLabel = new JLabel();
		AllView.addLabel(emailLabel, panel, "EMAIL", 290,115,200,25,11);

		emailTField = new JTextField("EMAIL");
		AllView.addTextField(emailTField, panel, 290,135,185,25,12, "EMAIL");

		JLabel usernameLabel = new JLabel();
		AllView.addLabel(usernameLabel, panel, "USERNAME", 290,165,200,25,11);
		usernameTField = new JTextField("USERNAME");
		AllView.addTextField(usernameTField, panel, 290,185,185,25,12, "USERNAME");
		// usernameTField.setBorder(BorderFactory.createEmptyBorder());
		//usernameTField.setPromptText("Enter");

		JLabel numberLabel = new JLabel();
		AllView.addLabel(numberLabel, panel, "PHONE NUMBER", 290,215,200,25,11);
		numberTField = new JTextField("PHONE NUMBER");
		AllView.addTextField(numberTField, panel, 290,235,185,25,12, "PHONE NUMBER");
		
		JLabel passLabel = new JLabel();
		AllView.addLabel(passLabel, panel, "PASSWORD", 290,265,200,25,11);
		passTField = new JPasswordField();
		AllView.addPassField(passTField, panel, 290,285,185,25,12);

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

                
                JOptionPane.showMessageDialog(panel, "REGISTERED SUCCESSFULLY");
            } else {
                JOptionPane.showMessageDialog(panel, "Registration Failed! Invalid input or username already exists");
            }
        }
	}

	public void addFocusListener(FocusEvent event){

	}

}