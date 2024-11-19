/* Merge two arrays into a single array.

Input Format
The program takes the following inputs:

- The size of the first array (integer)

- The elements of the first array (space-separated integers)

- The size of the second array (integer)

- The elements of the second array (space-separated integers)

Output Format
The program should output a single line containing the merged array elements, separated by spaces.

Sample Inputs & Outputs
Sample Input 1
3
1 2 3
4
4 5 6 7
Sample Output 1
Merged array: 1 2 3 4 5 6 7
Sample Input 2
4
1 2 3 4
5
3 4 5 6 7
Sample Output 2
Merged array: 1 2 3 4 3 4 5 6 7
Constraints
The sizes of both arrays are positive integers.

The elements of the arrays are integers. */
package Multiple_Arrays;

import java.util.Scanner;

public class ArrayMerger {
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
        System.out.print("Merged array: ");
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i] + " ");
        }
        for (int i = 0; i < ar2.length; i++) {
            System.out.print(ar2[i] + " ");
        }
        scanner.close();
    }
}
