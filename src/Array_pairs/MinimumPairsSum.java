/* This program finds the minimum sum among all the pairs of elements in a given array of integers. Sorting is not allowed.

Input Format
The first line contains a single integer, N, representing the size of the array. The second line contains N space-separated integers, representing the elements of the array.

Output Format
Print the minimum sum among all the pairs of elements in the array.

Sample Inputs & Outputs
Sample Input 1
6
5 9 2 8 3 7
Sample Output 1
5
Sample Input 2
7
10 5 8 2 6 1 4
Sample Output 2
3
Constraints
- 2 ≤ N ≤ 10^5 (the size of the array) 

 -10^9 ≤ elements of the array ≤ 10^9 */
package Array_pairs;

import java.util.Scanner;

public class MinimumPairsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                sum = ar[i] + ar[j];
                if (sum < min) {
                    min = sum;
                }
            }
        }
        System.out.println(min);
        scanner.close();
    }
}
