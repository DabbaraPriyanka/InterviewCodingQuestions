/* Find the smallest subarray in a given array whose sum is equal to a specified value K.

Input Format
The program takes the following inputs:

- First line contain an integer k, represents the number the sum of subarray must be equal to.

- The size of the array (integer)

- The elements of the array (space-separated integers)

Output Format
The program outputs the smallest subarray whose sum is equal to K.

If multiple subarrays with the same minimum length exist, it displays the first one found.

If no subarray with sum K exists, it outputs 'No subarray found.'

Sample Inputs & Outputs
Sample Input 1
5
6
2 3 1 4 2 5
Sample Output 1
5
Sample Input 2
15
5
10 2 4 8 7
Sample Output 2
8 7
Constraints
The size of the array is a positive integer.

The elements of the array are integers.

The desired sum K can be any integer. */
package Subarrays;

import java.util.Scanner;

public class SmallestSubarraywithSumEqualtoK {
    static void subarray(int[] ar, int k) {
        for (int s = 1; s < ar.length; s++) {
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
        System.out.print("No subarray found.");
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
