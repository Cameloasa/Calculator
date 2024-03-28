package se.lexicon;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //
       do {
           displayMenu();
           System.out.println("Please,enter your choice :");
           int choice = scanner.nextInt();
           if (choice == 5) {
               System.out.println("Exiting the calculator application.");
               break;
           }
           double result = performOperation(choice);
           System.out.println("result = " + result);

            } while (true);
       }

    public static void displayMenu(){
        System.out.println("Select operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
    }

    public static double performOperation(double number){
        double result = 0.0;
        if (number == 1) {
            result = performAddition();
        } else if (number == 2) {
            result = performSubtraction();
        } else if (number == 3) {
            result = performMultiplication();
        } else if (number == 4) {
            result = performDivision();
        } else {
            System.out.println("Invalid choice. please enter a valid option.");
        }

        return result;}

    public static double performAddition(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number : ");
        double number1 = scanner.nextDouble();
        System.out.println("Please,enter another number :");
        double number2 = scanner.nextDouble();
        return number1 + number2;
    }
    public static double performSubtraction(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number : ");
        double number1 = scanner.nextDouble();
        System.out.println("Please,enter another number :");
        double number2 = scanner.nextDouble();
        return number1 - number2;
    }
    public static double performMultiplication(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number : ");
        double number1 = scanner.nextDouble();
        System.out.println("Please,enter another number :");
        double number2 = scanner.nextDouble();
        return number1 * number2;
    }

    public static double performDivision(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number : ");
        double number1 = scanner.nextDouble();
        System.out.println("Please,enter another number :");
        double number2 = scanner.nextDouble();
        return number1 / number2;
    }



    }





