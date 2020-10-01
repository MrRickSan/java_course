package chapter3;

import java.util.Scanner;

/*
 * To qualify for a loan a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // Get unknown values
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with you current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        // Make decision
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats! You qualify for the loan");
            } else {
                System.out.printf("Sorry, you must have worked at your current job %d years", requiredYearsEmployed);
            }
        } else {
            System.out.printf("Sorry you must earn at least $%d to qualify for the loan", requiredSalary);
        }
    }
}
