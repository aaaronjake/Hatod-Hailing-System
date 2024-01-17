package hatod.controller;

import java.swing.*;
import java.awt.*;
import java.awt.event.*;

import hatod.view.*;
import hatod.model.*;

public class AdminCreateAdmin implements ActionListener{

        JLabel image;
		JPanel panel;
		JTextField emailTField;
		JTextField usernameTField;
		JTextField numberTField;
		JPasswordField passTField;

        JFrame frame = new JFrame();


    public AdminCreateAdmin(JFrame mainFrame){

        frame = mainFrame;

        panel = new JPanel();
        AllView.addPanel(mainFrame, panel);
		
		image = new JLabel();
		AllView.addImage(mainFrame, image, "AdminCreate.png");

        JLabel emailLabel = new JLabel();
		AllView.addLabel(emailLabel, panel, "EMAIL", 271,125,200,25,11);

		emailTField = new JTextField("EMAIL");
		AllView.addTextField(emailTField, panel, 271,145,185,25,12, "EMAIL");

		JLabel usernameLabel = new JLabel();
		AllView.addLabel(usernameLabel, panel, "USERNAME", 271,175,200,25,11);
		usernameTField = new JTextField("USERNAME");
		AllView.addTextField(usernameTField, panel, 271,195,185,25,12, "USERNAME");

		JLabel numberLabel = new JLabel();
		AllView.addLabel(numberLabel, panel, "PHONE NUMBER", 271,225,200,25,11);
		numberTField = new JTextField("PHONE NUMBER");
		AllView.addTextField(numberTField, panel, 271,245,185,25,12, "PHONE NUMBER");
		
		JLabel passLabel = new JLabel();
		AllView.addLabel(passLabel, panel, "PASSWORD", 271,275,200,25,11);
		passTField = new JPasswordField();
		AllView.addPassField(passTField, panel, 271,295,185,25,12);


    }


}