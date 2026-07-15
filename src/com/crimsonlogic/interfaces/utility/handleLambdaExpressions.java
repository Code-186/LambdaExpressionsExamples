package com.crimsonlogic.interfaces.utility;

import com.crimsonlogic.interfaces.stringoperation.StringOperations;
import com.crimsonlogic.lambdaExpressions.*;

import java.util.Scanner;

public class handleLambdaExpressions {
    public void AllMethods(){
        int choice;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice");
        System.out.println("1:Calcutor 2:Employee Bonus 3:Area Calcultor 4:String Operations");
        choice = sc.nextInt();

        switch (choice){

            case 1:
                CalculatorImp cli = new CalculatorImp();
                cli.cl.calculate();
                break;

            case 2:
                BonusImp bi = new BonusImp();
                bi.bonus.calculateBonus();
                break;

            case 3:
                int area;
                System.out.println("To find the area of :");
                System.out.println("1:Circle 2:Triangle 3.Rectangle");
                area = sc.nextInt();

                switch (area){
                    case 1:
                        CircleImp cirImp = new CircleImp();
                        cirImp.circle.calculate();
                        break;

                    case 2:
                        TriangleImp triImp = new TriangleImp();
                        triImp.tri.calculate();
                        break;

                    case 3:
                        RectangleImp rect = new RectangleImp();
                        rect.rec.calculate();
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            case 4:
                StringOperationsImp SOperationImp = new StringOperationsImp();
                SOperationImp.SOperation.StringInput();




        }




    }



}
