/* Merge three arrays into a single array.

Input Format
The program takes the following inputs:

- The size of the first array (integer)

- The elements of the first array (space-separated integers)

- The size of the second array (integer)

- The elements of the second array (space-separated integers)

- The size of the third array (integer)

- The elements of the third array (space-separated integers)

Output Format
The program should output a single line containing the merged array elements, separated by spaces.

Sample Inputs & Outputs
Sample Input 1
3
1 2 3
4
4 5 6 7
2
8 9
Sample Output 1
Merged array: 1 2 3 4 5 6 7 8 9
Sample Input 2
2
5 2
3
1 5 2
4
3 2 5 4
Sample Output 2
Merged array: 5 2 1 5 2 3 2 5 4
Constraints
The sizes of all three arrays are positive integers. */
package Multiple_Arrays;

import java.util.Scanner;

public class ArrayMergerThreeArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int ar1[] = new int[n1];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int ar2[] = new int[n2];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = scanner.nextInt();
        }
        int n3 = scanner.nextInt();
        int ar3[] = new int[n3];
        for (int i = 0; i < ar3.length; i++) {
            ar3[i] = scanner.nextInt();
        }
        System.out.print("Merged array: ");
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i] + " ");
        }
        for (int i = 0; i < ar2.length; i++) {
            System.out.print(ar2[i] + " ");
        }
        for (int i = 0; i < ar3.length; i++) {
            System.out.print(ar3[i] + " ");
        }
        scanner.close();
    }
}
