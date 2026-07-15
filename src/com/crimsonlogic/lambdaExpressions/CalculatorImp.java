package com.crimsonlogic.lambdaExpressions;

import com.crimsonlogic.interfaces.calculator.Calculator;

import java.util.Scanner;

public class CalculatorImp {
    public  Calculator cl = ()->{
        int choice;
        int result=0;
        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();

        System.out.println("Enter the operation you want to perform (+, -, *, /): ");
        choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                result = a + b;
                System.out.println("The result of addition is: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("The result of subtraction is: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("The result of multiplication is: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
        }


        return result;
    };
}