package exercises.chapter8;

import java.util.Scanner;

public class PasswordValidator {

    private static String username = "Ricardo!";
    private static String oldPassword = "myCoolDog!";

    public static void main(String []args){

        System.out.println("Insert the password:");
        Scanner input = new Scanner(System.in);
        String password = input.next();
        input.close();

        if (password.length() < 8)
            System.out.println("Password must be at least 8 character long.");
        else if (password.toLowerCase().contains(username.toLowerCase()))
            System.out.println("Password cannot contain the username.");
        else if (password.contains(oldPassword))
            System.out.println("Password cannot contain an old password.");
        else {
            checkUppercaseChar(password);
            checkSpecialChar(password);
        }
    }

    public static void checkUppercaseChar(String password){
        int uppercaseCharCount = 0;
        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                uppercaseCharCount++;
            }
        }
        if (uppercaseCharCount == 0) System.out.println("Password must have at least one uppercase character.");
    }

    public static void checkSpecialChar(String password){
        int specialCharCount = 0;
        for (int i = 0; i < password.length(); i++){
            if (!Character.isAlphabetic(password.charAt(i))){
                specialCharCount++;
            }
        }
        if (specialCharCount == 0) System.out.println("Password must have at least one special character.");
    }
}
