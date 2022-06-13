/*
1. Write a Java method to find the smallest number among three numbers
2. Write a Java method to compute the average of three numbers.
*/
package Methods;

import java.util.*;

public class AverageSmallestNumber
{
    static ArrayList<Double> myNumbers = new ArrayList<Double>();
    static String myString = new String();

    public static void main(String[] args)
    {
        getNumbers();
        System.out.println(myNumbers);
        System.out.println("Sum: " + totalSum(myNumbers));
        System.out.println("Average: " + averageNum(totalSum(myNumbers)));
        System.out.println("Smallest number: " + smallestNum(myNumbers));
    }

    public static ArrayList<Double> getNumbers()
    {
        Scanner userInput = new Scanner(System.in);

        do
        {
            System.out.println("There are currently " + myNumbers.size() + " numbers");
            System.out.println("Add more? (y/n)");
            if (userInput.next().startsWith("y"))
            {
                System.out.print("Enter: ");
                myNumbers.add(userInput.nextDouble());
            }
            else
            {
                break;
            }
        } while (true);
        userInput.close();
        return myNumbers;
    }

    public static double totalSum (ArrayList<Double> nums)
    {
        double sum = 0;
        for (double i : nums)
        {
            sum += i;
        }
        return sum;
    }

    public static double averageNum (double num)
    {
        return num / (myNumbers.size());
    }

    public static double smallestNum (ArrayList<Double> nums)
    {
        return Collections.min(nums);
    }
}
