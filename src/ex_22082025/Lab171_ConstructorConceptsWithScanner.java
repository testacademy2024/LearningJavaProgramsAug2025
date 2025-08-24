package ex_22082025;

import java.util.Scanner;

public class Lab171_ConstructorConceptsWithScanner {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the BankName to proceed");
        String bName=sc.next();
        System.out.println("Enter the Amount you wish to deposit which will be the balance Amount");
        float bal=sc.nextFloat();
        System.out.println("Enter the BankCode to proceed");
        String bCode=sc.next();
        BankAccount ba1=new BankAccount(bName,bal,bCode);
        ba1.printDetails();



    }
}
