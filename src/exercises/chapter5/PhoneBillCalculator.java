package exercises.chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String []args) {
        // Get unknown values
        double planFee = getPlanFee();
        int overageMinutes = getOverageMinutes();
        scanner.close();

        // Calculate the overage and tax fees
        double overageFee = calculateOverage(overageMinutes);
        double taxFee = calculateTax(planFee,overageFee);

        // Print final total
        total(planFee, overageFee, taxFee);
    }

    public static double getPlanFee(){
        System.out.println("Input the plan fee:");
        return scanner.nextDouble();
    }

    public static int getOverageMinutes(){
        System.out.println("Input the overage minutes:");
        return scanner.nextInt();
    }

    public static double calculateOverage(int minutes){
        final double rate = 0.25;
        return minutes * rate;
    }

    public static double calculateTax(double planFee, double overageFee){
        final double rate = 0.15;
        double subtotal = planFee + overageFee;
        return  subtotal * rate;
    }

    public static void total(double planFee, double overageFee, double taxFee){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + overageFee);
        System.out.printf("Tax: $%.2f\n", taxFee);
        System.out.printf("Total: $%.2f\n", planFee + overageFee + taxFee);
    }
}
