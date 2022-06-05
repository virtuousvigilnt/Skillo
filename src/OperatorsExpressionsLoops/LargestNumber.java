package OperatorsExpressionsLoops;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args)
    {
        int arrayLength, largestNum;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the sequence: ");
        arrayLength = s.nextInt();
        
        int numSequence[] = new int[arrayLength];
        
        System.out.println("Enter the sequence of numbers: ");
        for(int i = 0; i < arrayLength; i++)
        {
            numSequence[i] = s.nextInt();
        }

        largestNum = numSequence[0];
        for(int i = 0; i < arrayLength; i++)
        {
            if(largestNum < numSequence[i])
            {
                largestNum = numSequence[i];
            }
        }
        System.out.println("Largest number is " + largestNum);
    }
}
