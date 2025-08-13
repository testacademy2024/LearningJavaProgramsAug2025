package ex_12082025;

import java.util.Scanner;

public class Lab094_SwitchStatements {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user if it is a vowel
        // aeiou

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any letter of your choice and i will tell you if it is a vowel or not");
        char user_input=sc.next().charAt(0);
        System.out.println(user_input);

        switch(user_input)
        {
            case 'a':
                System.out.println("Entered letter is a vowel");
                break;
                 case 'e':
                System.out.println("Entered letter is a vowel");
                break;
                 case 'i':
                System.out.println("Entered letter is a vowel");
                break;
                 case 'o':
                System.out.println("Entered letter is a vowel");
                break;
                 case 'u':
                System.out.println("Entered letter is a vowel");
                break;
            default:
                System.out.println("Entered Letter is consonant");

        }
        System.out.println("Outside Switch Statement");

    }
}
