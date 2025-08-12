package ex_12082025;

import java.util.Scanner;

public class Lab088_ConditionandLoopsTwoScannerInputs {
    public static void main(String[] args) {
        // Max number in two inputs
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int num1=sc.nextInt();

        System.out.println("Enter 2nd Number");
        int num2=sc.nextInt();

        //System.out.println(Math.max(num1,num2));

        if(num1>num2)
        {
            System.out.println(num1);
        } else if (num1<num2) {
            System.out.println(num2);

        }else
        {
            System.out.println("Both are Equal");
        }
    }
}
