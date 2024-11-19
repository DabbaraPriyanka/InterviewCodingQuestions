/* Print all possible subarrays of size K from a given array.

Input Format
The program takes the following inputs:

- TFirst line contain an integer k, represents the number the subarray length must be equal to.

- The size of the array (integer)

- The elements of the array (space-separated integers)

Output Format
The program should output each subarray of size K on a new line.

Each subarray should be displayed as a space-separated sequence of elements.

Sample Inputs & Outputs
Sample Input 1
3
5
1 2 3 4 5
Sample Output 1
1 2 3
2 3 4
3 4 5
Sample Input 2
2
4
10 20 30 40
Sample Output 2
10 20
20 30
30 40
Constraints
The size of the array is a positive integer.

The size K is a positive integer and less than or equal to the size of the array.

The elements of the array are integers. */
package Subarrays;

import java.util.Scanner;

public class AllSubarraysofSizeK {
    static void subarray(int[] ar, int s) {
        for (int i = 0; i <= ar.length - s; i++) {
            for (int j = i; j < i + s; j++) {
                System.out.print(ar[j] + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        subarray(ar, k);
        scanner.close();
    }
}
