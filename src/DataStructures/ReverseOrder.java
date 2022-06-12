/* Reverse the order of the elements in a LinkedList using algorithm */
package DataStructures;

import java.util.*;
public class ReverseOrder {
    public static void main(String[] args)
    {
        LinkedList<String> myList = new LinkedList<String>();
        Scanner userInput = new Scanner(System.in);

        do
        {
            System.out.println("Current list is " + myList);
            System.out.println("Add more? (y/n)");
            if (userInput.next().startsWith("y")) {
                System.out.println("Enter : ");
                myList.add(userInput.next());
            } else
            {
                break;
            }
        } while (true);

        userInput.close();

        System.out.println("Elements before reversing: " + myList);
        myList = reverseLinkedList(myList);
        System.out.print("Elements after reversing: " + myList);
    }
    public static LinkedList<String> reverseLinkedList(LinkedList<String> revList)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = revList.size() - 1; i >= 0; i--)
        {
            revLinkedList.add(revList.get(i));
        }
        return revLinkedList;
    }
}