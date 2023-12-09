package grade.sheet.controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginController implements ActionListener{

	JTextField usernameTField;
	JPasswordField passTField;
	JButton loginBtn;
	JButton registerBtn;

	//JFrame frame = new JFrame();
	JFrame fram = new JFrame();
	LoginController(JFrame frame){

		fram = frame;
        JPanel panel = new JPanel();
        panel.setBounds(0,0,500,500);
        panel.setLayout(null);
        panel.setOpaque(false);
        
        frame.add(panel);

		ImageIcon image = new ImageIcon("LoginFrame.png");
		JLabel label = new JLabel();
		label.setBounds(0,0,500,500);
		label.setIcon(image);
		frame.add(label);
		
		JLabel usernameLabel = new JLabel();
		AllView.addlabel(usernameLabel, panel, "USERNAME", 290,140,200,30,11);

		usernameTField = new JTextField();
		AllView.addtextField(usernameTField, panel, 290,170,185,30,12);
		
		JLabel passLabel = new JLabel();
		AllView.addlabel(passLabel, panel, "PASSWORD", 290,210,200,30,11);

		passTField = new JPasswordField();
		AllView.addpassField(passTField, panel, 290,240,185,30,12);

		loginBtn = new JButton();
		AllView.addbutton(loginBtn, panel, "LOGIN", 310, 310, 150, 35, 12);
		loginBtn.addActionListener(this);
		registerBtn = new JButton();
		AllView.addbutton(registerBtn, panel, "REGISTER", 310, 350, 150, 35, 12);

        JLabel bottomLabel = new JLabel();
        AllView.addlabel(bottomLabel,panel, "If you don't have an account please approach",292,410,242,11,9);  
        JLabel bottomsLabel = new JLabel(); 
 		AllView.addlabel(bottomsLabel,panel, " Mr.Dwight",355,420,242,11,9);   


		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){

		fram.getContentPane().removeAll();
		fram.validate();
		fram.repaint();

		new RegisterController(fram);
	
	}

}
