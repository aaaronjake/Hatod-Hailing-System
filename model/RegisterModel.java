package hatod.model;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.*;
class RegisterModel {

    private static final String FILE_PATH = "user.dat";

    public boolean registerUser(String username, String password) {
        if (isValidInput(username, password)&&!isExist(username,password)) {
            appendUserDataToTextArea("Registered User:");
            appendUserDataToTextArea("Full Name: " + username);
            saveUserDataToFile(username, password);
            return true;
        } else {
            return false;
        }
    }
    static boolean isExist(String username, String password)
    {
        try{
            Scanner scan = new Scanner(new File("user.dat"));
            scan.useDelimiter("\\Z");

            if(scan.next().contains("Username: " + username +"\n" + "Password: "+ password))
                return true;
        } catch(Exception e){}
        
        return false;
    }

    private boolean isValidInput(String username, String password) {
        return !username.isEmpty() && !password.isEmpty();
    }

    private void appendUserDataToTextArea(String text) {
        System.out.println(text);
    }

    private void saveUserDataToFile(String username, String password) {
        try {
            String userData = "Username: " + username + "\n" +
            "Password: " + password + "\n\n";

            Files.write(Paths.get(FILE_PATH), userData.getBytes(), java.nio.file.StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}