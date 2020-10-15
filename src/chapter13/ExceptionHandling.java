package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String []args){

//        createNewFile();
//        numbersExceptionHandling();
//        try {
//            createNewFileRethrow();
//        } catch (IOException e){
//            e.printStackTrace();
//        }

//        calculateSalary(41, 16);

        try {
            int c = 30/0;
        } catch (ArithmeticException e){
            System.out.println("Dividing by zero is not allowed");
        } finally {
            System.out.println("Division is fun");
        }
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (Exception e){
          System.out.println("Directory does not exist.");
          e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);

            while (fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        } finally {
               fileReader.close();
        }
    }

    public static void calculateSalary(double hours, double rate){
        if (hours > 40){
            throw new IllegalArgumentException("We do not allow overtime.");
        }

        System.out.println(hours * rate);
    }
}
