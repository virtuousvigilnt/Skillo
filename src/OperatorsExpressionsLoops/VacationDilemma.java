package OperatorsExpressionsLoops;

import java.util.Scanner;

public class VacationDilemma {
    public static void main(String[] args) {

        int userBudget;
        String isBeach = "Beach";
        String isMountain = "Mountain";

        Scanner s = new Scanner(System.in);
        System.out.print("Select vacation type: ");
        String userSelection = s.nextLine();

        if (userSelection.equals(isBeach))
        {
            System.out.print("What is your budget per day: ");
            userBudget = s.nextInt();
            if (userBudget < 50)
            {
                System.out.println("Bulgaria is your destination!");
            }
            else
            {
                System.out.println("Your destination is outside Bulgaria");
            }
        }
        else if (userSelection.equals(isMountain))
        {
            System.out.print("What is your budget per day: ");
            userBudget = s.nextInt();
            if (userBudget < 30)
            {
                System.out.println("Bulgaria is your destination!");
            }
            else
            {
                System.out.println("Your destination is outside Bulgaria");
            }
        }
        else
        {
            System.out.println("No Info");
        }
    }
}
