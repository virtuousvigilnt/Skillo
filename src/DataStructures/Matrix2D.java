/* Print elements of a given 2-d matrix with 4 rows and 3 columns */

package DataStructures;

public class Matrix2D {
    public static void main(String[] args) {
        int[][] twoD = new int[4][3];

        twoD[0][0] = 1;
        twoD[0][1] = 3;
        twoD[0][2] = 5;
        twoD[1][0] = 2;
        twoD[1][1] = 4;
        twoD[1][2] = 6;
        twoD[2][0] = 12;
        twoD[2][1] = 24;
        twoD[2][2] = 48;
        twoD[3][0] = -1;
        twoD[3][1] = -10;
        twoD[3][2] = -100;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++){
                System.out.println(twoD[i][j]);
            }
        }
    }
}
