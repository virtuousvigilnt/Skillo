package DatatypesAndVariables;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter side X length: ");
        float sideX = myObj.nextFloat();

        System.out.println("Enter side Y length: ");
        float sideY = myObj.nextFloat();

        System.out.println("Enter side Z length: ");
        float sideZ = myObj.nextFloat();

        System.out.println("Perimeter of the triangle is: " + (sideX + sideY + sideZ));
        System.out.println("Area of the triangle is: " + ((sideX * sideY) / 2));

    }

}
