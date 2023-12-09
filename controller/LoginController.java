package hatod.controller;


import javax.imageio.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginController{

    Image backgroundImage;
    JTextField email;
    JTextField name;
    JTextField phone;
    JPasswordField password;
    JTextField motorPlate;

    public LoginController(){

        backgroundImage = Toolkit.getDefaultToolkit().createImage("LoginFrame.png");

        


    }

    public void paint(Graphics graphic){
        graphic.drawImage(backgroundImage, 0, 0, null);
    }

}
