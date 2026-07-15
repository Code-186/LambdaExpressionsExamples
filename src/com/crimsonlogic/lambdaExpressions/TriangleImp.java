package com.crimsonlogic.lambdaExpressions;

import com.crimsonlogic.interfaces.areaCal.Triangle;

import java.util.Scanner;

public class TriangleImp {

public Triangle tri = ()->{
    Scanner sc = new Scanner(System.in);
        System.out.println("length:");
        float base = sc.nextInt();

        System.out.println("breadth:");
        float height = sc.nextInt();

        float res = base*height;

        return res;
};

}
