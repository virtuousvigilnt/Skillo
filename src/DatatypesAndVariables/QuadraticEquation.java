package DatatypesAndVariables;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        double a, b, c;
        double root1, root2;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input the value of a in quadratic equation: ");
        a = myObj.nextDouble();
        System.out.println("Input the value of b in quadratic equation: ");
        b = myObj.nextDouble();
        System.out.println("Input the value of c in quadratic equation: ");
        c = myObj.nextDouble();

        double d = b * b - 4 * a * c;

        if(d > 0)
        {
            root1 = - b + Math.sqrt(d) / 2 * a;
            root2 = - b - Math.sqrt(d) / 2 * a;
            System.out.println("Roots are real and distinct");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }
        else if(d == 0)
        {
            root1 = -b / 2 * a;
            System.out.println("Both roots are equal and the value is: " + root1);
        }
    }
}
