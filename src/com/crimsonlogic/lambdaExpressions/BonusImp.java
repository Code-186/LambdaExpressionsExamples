package com.crimsonlogic.lambdaExpressions;

import com.crimsonlogic.interfaces.employeeBonus.Bonus;

import java.util.Scanner;

public class BonusImp {

        public Bonus bonus = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter salary");
            double salary = scanner.nextDouble();

            double totalAmt = salary * 0.15;
            System.out.println("Salary = " + salary);
            System.out.println("Bonus = " + totalAmt);
            System.out.println("Total Salary = " + (salary + totalAmt));


        };
}

