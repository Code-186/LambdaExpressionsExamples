package com.crimsonlogic.lambdaExpressions;

import com.crimsonlogic.interfaces.areaCal.Circle;

import java.util.Scanner;

public class CircleImp {
    public Circle circle= () ->{


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius=sc.nextDouble();

        double res = 3.142*radius*radius;

        return res;

    };
}
