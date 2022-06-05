package OperatorsExpressionsLoops;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input number (1-7): ");

        int userInput = myObj.nextInt();
        String[] weekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        switch (userInput) {
            case 1:
                System.out.println("The 1st day of the week is " + weekDay[0]);
                break;
            case 2:
                System.out.println("The 2nd day of the week is " + weekDay[1]);
                break;
            case 3:
                System.out.println("The 3rd day of the week is " + weekDay[2]);
                break;
            case 4:
                System.out.println("The 4th day of the week is " + weekDay[3]);
                break;
            case 5:
                System.out.println("The 5th day of the week is " + weekDay[4]);
                break;
            case 6:
                System.out.println("The 6th day of the week is " + weekDay[5]);
                break;
            case 7:
                System.out.println("The 7th day of the week is " + weekDay[6]);
                break;
            default:
                System.out.println("There is no " + userInput + " day");
        }
    }
}
