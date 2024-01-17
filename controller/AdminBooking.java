package hatod.controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import hatod.view.*;
import hatod.model.*;


public class AdminBooking implements ActionListener{

    JLabel image;
	JPanel panel;
    JButton logoutBtn;
    JButton createAdminBtn;
    JButton activeBookingsBtn;

    JFrame frame = new JFrame();


    public AdminBooking(JFrame mainFrame){

        frame = mainFrame;

        panel = new JPanel();
        AllView.addPanel(mainFrame, panel);
		
		image = new JLabel();
		AllView.addImage(mainFrame, image, "AdminBook.png");
		
        logoutBtn = new JButton();
        AllView.addButton(logoutBtn, panel, "LOGOUT", 24, 437, 120, 25, 12);
		logoutBtn.addActionListener(this);

        createAdminBtn = new JButton();
        AllView.addButton(createAdminBtn, panel, "CREATE ADMIN", 187, 437, 120, 25, 12);
		createAdminBtn.addActionListener(this);

        activeBookingsBtn = new JButton();
        AllView.addButton(activeBookingsBtn, panel, "ACTIVE BOOKINGS", 345, 437, 120, 25, 12);
		activeBookingsBtn.addActionListener(this);


    }


    public void actionPerformed(ActionEvent event){
     
        if(event.getSource() == logoutBtn){
            AllView.removeFrame(frame);
            new LoginController(frame);
        }

        if(event.getSource() == createAdminBtn){

        }

        if(event.getSource() == activeBookingsBtn){

        }



    }
}