/* Find the longest subarray in a given array whose sum is equal to a specified value K.

Input Format
The program takes the following inputs:

- First line contain an integer k, represents the number the sum of subarray must be equal to.

- The size of the array (integer)

- The elements of the array (space-separated integers)

Output Format
The program outputs the longest subarray whose sum is equal to K.

If multiple subarrays with the same maximum length exist, it displays the first one found.

If no subarray with sum K exists, it outputs "No subarray found."

Sample Inputs & Outputs
Sample Input 1
7
8
3 4 7 2 -3 1 4 2
Sample Output 1
7 2 -3 1
Sample Input 2
10
6
1 2 3 4 5 6
Sample Output 2
1 2 3 4
Constraints
The size of the array is a positive integer.

The elements of the array are integers.

The desired sum K can be any integer. */
package Subarrays;

import java.util.Scanner;

public class LongestSubarraywithSumEqualtoK {
    static void subarray(int[] ar, int k) {
        for (int s = ar.length - 1; s >= 0; s--) {
            for (int i = 0; i <= ar.length - s; i++) {
                int sum = 0;
                for (int j = i; j < i + s; j++) {
                    sum += ar[j];
                }
                if (sum == k) {
                    for (int j = i; j < i + s; j++) {
                        System.out.print(ar[j] + " ");
                    }
                    return;
                }
            }
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
