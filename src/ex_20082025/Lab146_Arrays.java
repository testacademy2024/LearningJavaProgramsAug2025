package ex_20082025;

import java.util.Scanner;

public class Lab146_Arrays {
    public static void main(String[] args) {
        // Where we take the user input of the 5 subjects - Avg of the subject.
        // Figure inputs - float, scanner class
float[]marks=new float[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< marks.length;i++)
        {
            System.out.println("Enter the marks for subject " + (i+1));
            marks[i]=sc.nextFloat();
        }
        //        // Optionally, you can print out the marks to verify input
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println("Marks of sub " + (i + 1) + ": " + marks[i]);
//        }
//        System.out.println("Enter the marks for subject 1");
//        marks[0]=sc.nextFloat();
//        System.out.println("Enter the marks for subject 2");
//        marks[1]=sc.nextFloat();
//        System.out.println("Enter the marks for subject 3");
//        marks[2]=sc.nextFloat();
//        System.out.println("Enter the marks for subject 4");
//        marks[3]=sc.nextFloat();
//        System.out.println("Enter the marks for subject 5");
//        marks[4]=sc.nextFloat();

       float avg= (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println(avg);
sc.close();
    }
}
