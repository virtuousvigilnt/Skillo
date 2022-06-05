/* Write program to print sum of a given array elements */

package DataStructures;

public class SumOfArray {
    public static void main(String[] args) {
        int[] myArray = {2, 36, 101, 404, 69};
        int sum = 0;

        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        System.out.println(sum);
    }
}
