package DatatypesAndVariables;

import java.util.Scanner;
public class PineTree {

    public static void main(String[] args) {
        Scanner myTree = new Scanner(System.in);
        System.out.println("Input tree height: ");

        int treeHeight = myTree.nextInt();

        System.out.println();
        printTree(treeHeight);
    }

    static void printTree(int treeHeight) {

        for(int i = 1; i <= treeHeight; i++)
        {
            for(int j = treeHeight - i; j > 0; j--)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
