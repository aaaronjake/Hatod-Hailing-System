package hatod.controller;

import hatod.view.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UsersController{

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
	AllView.addLabel(currentDestination, panel, "PICK UP PLACE:", 138,36,206,11,10); 

    fromDestination = new JTextField();
    AllView.addTextField(fromDestination, panel, 138,36,206,20,11);

    JLabel assignedDestination = new JLabel();
    AllView.addLabel(assignedDestination, panel, "DESTINATION:", 138,76,219,11,10);

    toDestination = new JTextField();
    AllView.addTextField(toDestination, panel, 138,76,219,20,11);

    JLabel hatodCredits = new JLabel();
    AllView.addLabel(hatodCredits, panel, "HATOD CREDITS: ", 19,386,70,13, 13);

    bookRide = new JButton();
    AllView.addButton(bookRide, panel, "BOOK A RIDE", 8, 452, 179, 25, 12);


    }



}