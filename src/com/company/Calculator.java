package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        //inatantiating the Scanner object
        Scanner scanner = new Scanner(System.in);
        //creating an option variable which will hold an integer value
        int option;
        //setting up a do-while loop to test option entered br users
        do {
            //the display menu is a function to show different options users can enter
            displayMenu();
            //an input stream which takes an integer value was called
            option = scanner.nextInt();
            System.out.println();

     //a switch case condition is used to test values entered by users which in turn will return
            // operations users can perform based on the number selected
            switch (option) {
                //in addition
            case 1:
                Addition(scanner);
                break;
                //for subtraction
            case 2:
                Subtraction(scanner);
                break;
                //for multiplication
            case 3:
                Multiplication(scanner);
                break;
                //for division
            case 4:
                Division(scanner);
                break;
                //for power operations
            case 5:
                Power(scanner);
                break;
                //for performing square  operations
            case 6:
                Square(scanner);
                break;
                //for finding cube of numbers
            case 7:
                Cube(scanner);
                break;
                // for finding square root of numbers
            case 8:
                SquareRoot(scanner);
                break;
                // for rounding up numbers
            case 9:
                Round(scanner);
                break;
                // for ceiling up numbers
            case 10:
                Ceiling(scanner);
                break;
                // for flooring numbers
            case 11:
                Floor(scanner);
                break;
                // for finding minimum values
            case 12:
                MinValue(scanner);
                break;
                // for finding maximum values
            case 13:
                MaxValue(scanner);
                break;
                // for performing sin operations
            case 14:
                Sin(scanner);
                break;
                // for performing cosine operations
            case 15:
                Cos(scanner);
                break;
                // for performing sin inverse operations
            case 16:
                Asin(scanner);
                break;
                // for performing cos inverse operations
            case 17:
                Acos(scanner);
                break;
                // for performing tan inverse operations
            case 18:
                Atan(scanner);
                break;
                // for performing exponential functions
            case 19:
                Exponential(scanner);
                break;
                // to check for palindrome numbers
            case 20:
                checkPalindrome(scanner);
                break;
                // to check for armstrong numbers
            case 21:
                checkArmstrongNumber(scanner);
                break;
                // to check for prime numbers
            case 22:
                checkPrimeNumber(scanner);
                break;
                // to calculate average of numbers
            case 23:
                calculateAverage(scanner);
                break;
                // to calculate GCD
            case 24:
                calculateGCD(scanner);
                break;
                // to find LCM of numbers
            case 25:
                findLCM(scanner);
                break;
                //  Exiting the program
            case 26:
                System.out.println("Exiting the program. Goodbye!");
                break;
                //Default case
            default:
                System.out.println("Invalid option. Please try again.");
                break;
           }

            System.out.println();
        } while (option != 26);
        scanner.close();
    }
    // implementing the display menu function
    private static void displayMenu() {
        System.out.println("Console Calculator Menu:");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) Power");
        System.out.println("6) Square");
        System.out.println("7) Cube");
        System.out.println("8) Square Root");
        System.out.println("9) Round");
        System.out.println("10) Ceiling");
        System.out.println("11) Floor");
        System.out.println("12) Minimum Value");
        System.out.println("13) Maximum Value");
        System.out.println("14) Sin");
        System.out.println("15) Cos");
        System.out.println("16) Asin");
        System.out.println("17) Acos");
        System.out.println("18) Atan");
        System.out.println("19) Exponential");
        System.out.println("20) Check Palindrome");
        System.out.println("21) Check Armstrong Number");
        System.out.println("22) Check Prime Number");
        System.out.println("23) Calculate Average");
        System.out.println("24) Calculate GCD");
        System.out.println("25) Calculate LCM");
        System.out.println("26) Exit");
        System.out.print("Enter your option: ");
    }
// implementing the addition function
    private static void Addition(Scanner scanner){
        System.out.println("Enter first number");
        // the first scanner collects the first number
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        // the second scanner collects the second number
        double num2 = scanner.nextDouble();
        // the result variable collects the both numbers and sum them up
        double result = num1 + num2;
        // this method prints out the result to the console
        System.out.println("The result is:" + result);
    }
    private static void Subtraction(Scanner scanner){
        System.out.println("Enter first number");
        // the first scanner collects the first number
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        // the first scanner collects the second number
        double num2 = scanner.nextDouble();
        // the result variable collects the both numbers and subtracts them
        double result = num1 - num2;
        // this method prints out the result to the console
        System.out.println("The result is:" + result);
    }
    private static void Multiplication(Scanner scanner){
        System.out.println("Enter first number");
        // the first scanner collects the first number
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        // the first scanner collects the second number
        double num2 = scanner.nextDouble();
        // the result variable collects the both numbers and multiplies them
        double result = num1 * num2;
        // this method prints out the result to the console
        System.out.println("The result is:" + result);
    }
    private static void Division(Scanner scanner){
        System.out.println("Enter first number");
        // the first scanner collects the first number
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        // the first scanner collects the second number
        double num2 = scanner.nextDouble();
        // the result variable collects the both numbers and divides them
        double result = num1 / num2;
        // this method prints out the result to the console
        System.out.println("The result is:" + result);
    }
    private static void Power(Scanner scanner){
        System.out.println("Enter the number");
        // the first scanner collects the number entered by the user
        double num = scanner.nextDouble();
        System.out.println("Enter the power");
        // the first scanner collects the power entered by the user
        int pow = scanner.nextInt();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The result is" + Math.pow(num, pow));
    }
    private static void Square(Scanner scanner){
        System.out.println("Enter the number");
        // the  scanner collects the number entered by the user
        double num = scanner.nextDouble();
        // the result variable collects the number and multiplies it against itself
        double result = num * num;
        // this method prints out the result to the console
        System.out.println("The result is:" + result);
    }
    private static void Cube(Scanner scanner){
        System.out.println("Enter the number");
        // the  scanner collects the number entered by the user
        double num = scanner.nextDouble();
        // this variable collects the number entered into the scanner and multiples it against itself thrice
        double result = num * num * num;
        // this method prints out the result to the console
        System.out.println("The result is: " + result);
    }
    private static void SquareRoot(Scanner scanner){
        System.out.println("Enter the number");
        // the  scanner collects the number entered by the user
        double num = scanner.nextDouble();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The result is: " + Math.sqrt(num));
    }
    private static void Round(Scanner scanner){
        System.out.println("Enter the number");
        // the  scanner collects the number entered by the user
        double num = scanner.nextDouble();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The result is:" + Math.round(num));
    }
    private static void Ceiling(Scanner scanner){
        System.out.println("Enter the number");
        // the  scanner collects the number entered by the user
        double num = scanner.nextDouble();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The result is:" + Math.ceil(num));
    }
    private static void Floor(Scanner scanner){
        System.out.println("Enter the number");
        // the  scanner collects the number entered by the user
        double num = scanner.nextDouble();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The result is:" + Math.ceil(num));
    }
    private static void MinValue(Scanner scanner){
        System.out.println("Enter the first number");
        // the first scanner collects the number entered by the user
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number");
        // the second scanner collects the number entered by the user
        double num2 = scanner.nextDouble();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The minvalue is:" + Math.min(num1, num2));
    }
    private static void MaxValue(Scanner scanner){
        System.out.println("Enter the first number");
        // the first scanner collects the number entered by the user
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number");
        // the second scanner collects the number entered by the user
        double num2 = scanner.nextDouble();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The maxvalue is:" + Math.max(num1, num2));
    }
    private static void Sin(Scanner scanner){
        System.out.println("Enter the number");
        // the scanner collects the number entered by the user
        double num = scanner.nextDouble();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The sin of this number is:" + Math.sin(num));
    }
    private static void Cos(Scanner scanner){
        System.out.println("Enter the number");
        // the scanner collects the number entered by the user
        double num = scanner.nextDouble();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The cos of this number is:" + Math.cos(num));
    }
    private static void Asin(Scanner scanner){
        System.out.println("Enter the number");
        // the scanner collects the number entered by the user
        double num = scanner.nextDouble();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The asin of this number is:" + Math.asin(num));
    }
    private static void Acos(Scanner scanner){
        System.out.println("Enter the number");
        // the scanner collects the number entered by the user
        double num = scanner.nextDouble();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The acos of this number is:" + Math.acos(num));
    }
    private static void Atan(Scanner scanner){
        System.out.println("Enter the number");
        // the scanner collects the number entered by the user
        double num = scanner.nextDouble();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The atan of this number is:" + Math.atan(num));
    }
    private static void Exponential(Scanner scanner){
        // the scanner collects the number entered by the user
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        // this method prints out the result to the console using the math function to calculate the result
        System.out.println("The result is:" + Math.exp(num));
    }
    private static void checkPalindrome(Scanner scanner) {
        System.out.print("Enter a number: ");
        // the scanner collects the number entered by the user
        int number = scanner.nextInt();
        // a variable original number is created and the number variable is assigned to it
        int originalNumber = number;
        // a reversed number variable is created and assigned zero
        int reversedNumber = 0;
        // a remainder variable is created
        int remainder;
        // a while loop is started to test if the number is not equal to zero
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        //if the number original number entered is equal to the same
        // number when the number is reversed it is a palindrome
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
            // else it is not a palindrome
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }

    private static void checkArmstrongNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        // the scanner collects the number entered by the user
        int number = scanner.nextInt();
        // a variable original number is created and the number variable is assigned to it
        int originalNumber = number;
        // a sum variable is created
        int sum = 0;
        // a digit variable is created
        int digit;
        // a while loop is started to test if the number is not equal to zero
        while (number != 0) {
            digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }
       // an if logic is used to test if the original number is equal to the sum of the numbers
        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number.");
            //else it is not an armstrong number
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }

    private static void checkPrimeNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        // the scanner collects the number entered by the user
        int number = scanner.nextInt();
        // boolean variable is prime is created
        boolean isPrime = true;
        // an if logic which tests if the number entered is less than or equal to one
        if (number <= 1) {
            isPrime = false;
        } else {
            // a for loop is used
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
   // printing out the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    private static void calculateAverage(Scanner scanner) {
        System.out.print("Enter the number of entries: ");
        // the scanner collects the number entered by the user
        int numEntries = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= numEntries; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        double average = (double) sum / numEntries;
        // printing out result
        System.out.println("Average: " + average);
    }

    private static void calculateGCD(Scanner scanner) {
        System.out.print("Enter the first number: ");
        // the first scanner collects the number entered by the user
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        // the second scanner collects the number entered by the user
        int num2 = scanner.nextInt();
        // a while loop is created
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        int gcd = num1;
        // prints out result
        System.out.println("GCD: " + gcd);
    }

    private static void findLCM(Scanner scanner) {
        System.out.print("Enter the first number: ");
        // the first scanner collects the number entered by the user
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        // the second scanner collects the number entered by the user
        int num2 = scanner.nextInt();

        int gcd = 1;
       // a for loop is reated
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        int lcm = (num1 * num2) / gcd;
        // printing out the result
        System.out.println("LCM: " + lcm);
    }
}


