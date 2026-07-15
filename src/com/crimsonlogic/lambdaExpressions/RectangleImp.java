package com.crimsonlogic.lambdaExpressions;

import com.crimsonlogic.interfaces.areaCal.Rectangle;

import java.util.Scanner;

public class RectangleImp {
    public Rectangle rec = ()->{
        Scanner sc = new Scanner(System.in);
        System.out.println("length:");
        int length = sc.nextInt();

        System.out.println("breadth:");
        int breadth = sc.nextInt();

        int res = length*breadth;
        return res;

    };
}
