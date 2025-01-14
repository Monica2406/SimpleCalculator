package com.simpleCalculator;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        // Create an object of Scanner class to take input from user
        Scanner input = new Scanner(System.in);

        // Display the menu with available operations
        System.out.println("Simple Calculator");
        System.out.println("Choose an operator to perform the operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter the operation (Choose +, -, *, or /): ");
        
        // Ask the user to choose an operator
        operator = input.next().charAt(0);

        // Ask the user to enter two numbers
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        // Perform the operation based on the chosen operator
        switch (operator) {

            // Performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // Performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // Performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // Performs division between numbers
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            // Handles invalid operator input
            default:
                System.out.println("Invalid operator! Please choose from +, -, *, or /.");
                break;
        }

        // Close the scanner to prevent resource leak
        input.close();
    }
}
