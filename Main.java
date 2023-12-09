package hatod;

import javax.swing.*;
class Main{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		new LoginController(frame);
	}
}
