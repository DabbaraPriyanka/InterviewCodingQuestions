/* Rearrange the array by moving positive integers to the beginning and negative integers to the end while maintaining their relative order.

Input Format
The input consists of a single line containing space-separated integers, representing the array elements.

The array can have duplicates and may contain a variable number of elements.

Output Format
A line containing space-separated integers representing the rearranged array.

Sample Inputs & Outputs
Sample Input 1
6
-3 5 -1 2 -8 -7
Sample Output 1
5 2 -3 -1 -8 -7
Sample Input 2
7
4 -2 1 -5 0 -3 2
Sample Output 2
4 1 0 2 -2 -5 -3
Constraints
The length of the array is between 1 and 10^5.

The elements of the array are positive integers or negative integers.

The array contains at least one positive integer and one negative integer. */
package Arrays_miscellaneous;

import java.util.Scanner;

public class RearrangeArraywithPositiveIntegersattheBeginningandNegativeIntegersattheEnd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] >= 0) {
                System.out.print(ar[i] + " ");
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0) {
                System.out.print(ar[i] + " ");
            }
        }
        scanner.close();
    }
}
