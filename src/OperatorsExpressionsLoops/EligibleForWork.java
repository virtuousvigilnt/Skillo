package OperatorsExpressionsLoops;

import java.util.Scanner;

public class EligibleForWork {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int userInput = myObj.nextInt();

        if (userInput >= 16)
        {
            System.out.println("You are eligible for work");
        }
        else
        {
            System.out.println("You are not eligible for work");
        }
    }
}
