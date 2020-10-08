package chapter5;

import java.util.Scanner;

public class CalculateSum {

    public static void main(String[]args){

        // Get the user name
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();

        greetUser(name);
    }

    public  static void greetUser(String name) {
        System.out.println("Hi there, " + name);
    }
}
