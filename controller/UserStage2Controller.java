package hatod.controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import hatod.view.*;
import hatod.model.*;

public class UserStage2Controller{

		JLabel image;
		JLabel costLabel;
		JPanel panel;
		JTextField pickUpField;
		JTextField dropOffField;
		JButton motorcycleBtn;
		JButton taxiBtn;
		JButton bikeBtn;
		JButton bookBtn;

		JFrame frame = new JFrame();

	public UserStage2Controller(JFrame mainFrame){

		frame = mainFrame;
        panel = new JPanel();
        AllView.addPanel(mainFrame, panel);
      
		image = new JLabel();
		AllView.addImage(mainFrame, image, "UserFrame2.png");

		JLabel onLook = new JLabel();
		AllView.addLabel(onLook, panel, "LOOKING FOR RIDER...", 70, 395, 400, 40, 30, 0xF9732D);
	}
}