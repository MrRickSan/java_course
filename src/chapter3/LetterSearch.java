package chapter3;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String []args){

        // Get Text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;
        // Search text for letter A
        for(int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound) System.out.println("Found!");
        else  System.out.println("Not Found!");
    }
}
