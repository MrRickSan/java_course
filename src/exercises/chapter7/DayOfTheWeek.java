package exercises.chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String []args){

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int day = getDay();
        System.out.println(weekDays[day-1]);
    }

    public static int getDay(){
        System.out.println("Input a number corresponding to the day of the week:");
        Scanner scanner = new Scanner(System.in);
        int day;
        do {
            day = scanner.nextInt();
            if (day < 1 || day > 7) System.out.println("The number must be between 1 and 7.");
        } while (day < 1 || day > 7);
        scanner.close();

        return day;
    }
}
