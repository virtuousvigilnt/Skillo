/* Print elements of a given 2-d matrix with 4 rows and 3 columns */
package DataStructures;

import java.util.*;
public class Matrix2D {
    public static void main(String[] args) {

        int[][] matrixElements = new int[4][3];
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter element [" + i + "][" + j + "]: ");
                matrixElements[i][j] = userInput.nextInt();
            }
        }
        System.out.println();
        System.out.println("****** Matrix Elements ******");
        System.out.println();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixElements[i][j] + "   " );
            }
        }
        System.out.println();

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixElements[i][j] + "   " );
            }
        }
        System.out.println();

        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixElements[i][j] + "   " );
            }
        }
        System.out.println();
        for (int i = 3; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixElements[i][j] + "   " );
            }
        }

    }
}