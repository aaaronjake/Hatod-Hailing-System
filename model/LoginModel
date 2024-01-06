package hatod.model;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.*;

public class LoginModel{
	public boolean successfulLogin(String username, String password){
		return (isValidInput(username,password) && isExist(username, password)) ? true : false;
			
	}
	static boolean isExist(String username, String password)
    {
        try{
            Scanner scan = new Scanner(new File("user.dat"));
            scan.useDelimiter("\\Z");

            if(scan.next().contains("Username: " + username + "\t\t" + "Password: " + password + "\t\t"))
                return true;
        } catch(Exception e){}
        
        return false;
    }
    private boolean isValidInput(String username, String password) {
        return !username.isEmpty() && !password.isEmpty();
    }
}
