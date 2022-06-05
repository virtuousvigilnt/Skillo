/* Find biggest element of an array and print it in the console */
package DataStructures;

import java.util.*;


public class BiggestElement {
    public static void main(String[] args) {
        List<Integer> myCart = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println("Current list is " + myCart);
            System.out.println("Add more? (y/n)");
            if (userInput.next().startsWith("y")) {
                System.out.println("Enter : ");
                myCart.add(userInput.nextInt());
            } else {
                break;
            }
        } while (true);
        userInput.close();

        int maxNum = Collections.max(myCart);

        System.out.println("Biggest number is: " + maxNum);
    }
}
