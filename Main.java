package hatod;

import javax.swing.*;
import hatod.controller.*;

class Main{
	public static void main(String[] args){
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(500,500);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(null);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);

		new LoginController(mainFrame);
		mainFrame.setVisible(true);
	}
}
