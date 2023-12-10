package hatod.controller;

import hatod.view.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UsersController implements ActionListener{

    JPanel panel;
    JLabel image;
    JTextField fromDestination;
    JTextField toDestination;
    JLabel hatodCredits;
    JButton bookRide;

    JFrame frame = new JFrame();


    public UsersController(JFrame mainFrame){
    
    frame = mainFrame;

    panel = new JPanel();
    AllView.addPanel(mainFrame, panel);

    image = new JLabel();
	AllView.addImage(mainFrame, image, "UserFrame1.png");

    JLabel currentDestination = new JLabel();
	AllView.addLabel(currentDestination, panel, "PICK UP PLACE:", 135,25,206,11,10); 

    fromDestination = new JTextField();
    AllView.addTextField(fromDestination, panel, 133,35,220,20,11);

    JLabel assignedDestination = new JLabel();
    AllView.addLabel(assignedDestination, panel, "DESTINATION:", 135,63,219,11,10);

    toDestination = new JTextField();
    AllView.addTextField(toDestination, panel, 133, 73,220,20,11);

    JLabel hatodCredits = new JLabel();
    AllView.addLabel(hatodCredits, panel, "HATOD CREDITS: ", 22,364,200,13, 11);

    bookRide = new JButton();
    AllView.addButton(bookRide, panel, "BOOK A RIDE", 11, 425, 179, 25, 12);

    }


    public void actionPerformed(ActionEvent event){
        if(event.getSource() == bookRide){
            
        }
    }


}