package hatod.controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import hatod.view.*;
import hatod.model.*;

public class UserController implements ActionListener{
	JLabel image;
	JLabel costLabel;
	JPanel panel;
	JTextField pickUpField;
	JTextField dropOffField;
	JButton motorcycleBtn;
	JButton taxiBtn;
	JButton bikeBtn;
	JButton bookBtn;

	//JFrame frame = new JFrame();
	JFrame fram = new JFrame();
	public UserController(JFrame frame){

		fram = frame;
        panel = new JPanel();
        AllView.addPanel(frame, panel);
      
		image = new JLabel();
		AllView.addImage(frame, image, "UserRiderFrame.png");

		motorcycleBtn = new JButton();
		AllView.addButton(motorcycleBtn, panel, "MOTORCYCLE", 30, 345, 125, 25, 12, 0xE9AD6C);
		motorcycleBtn.addActionListener(this);

		taxiBtn = new JButton();
		AllView.addButton(taxiBtn, panel, "TAXI", 182, 345, 125, 25, 12, 0xE9AD6C);
		taxiBtn.addActionListener(this);

		bikeBtn = new JButton();
		AllView.addButton(bikeBtn, panel, "BIKE", 343, 345, 125, 25, 12, 0xE9AD6C);
		bikeBtn.addActionListener(this);
		
		pickUpField = new JTextField("Pick up place...");
		AllView.addTextField(pickUpField, panel, 75,400,177,20,12, "Pick up place...");

		dropOffField = new JTextField("Drop off...");
		AllView.addTextField(dropOffField, panel, 75,425,177,20,12, "Drop off...");

		JLabel discountLabel = new JLabel();
		AllView.addLabel(discountLabel, panel, "Discount:", 300,390,57,15,12, 0xF9732D);

		costLabel = new JLabel();
		AllView.addLabel(costLabel, panel, "Booking Cost: ", 300,400,104,30,12, 0xF9732D);

		bookBtn = new JButton();
		AllView.addButton(bookBtn, panel, "BOOK NOW", 315, 425, 130, 25, 12, 0xF9732D);
		bookBtn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource()==motorcycleBtn){
			costLabel.setText("Booking Cost: 100");
		}
		if(event.getSource()==taxiBtn){
			costLabel.setText("Booking Cost: 150");
		}
		if(event.getSource()==bikeBtn){
			costLabel.setText("Booking Cost: 200");
		}
		if(event.getSource()==bookBtn){
			
			AllView.removeFrame(fram);
      		new UserStage2Controller(fram);
		}
	}
}
