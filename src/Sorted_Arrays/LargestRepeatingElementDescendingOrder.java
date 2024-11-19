/* Find the largest repeating element in a sorted array in descending order.

Input Format
The input consists of two lines:

The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5).

The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the sorted array (-10^9 ≤ A[i] ≤ 10^9).

Output Format
Print a single integer, the largest repeating element in the array. If there are no repeating elements, print -1.

Sample Inputs & Outputs
Sample Input 1
8
5 4 4 4 3 3 2 1
Sample Output 1
4
Sample Input 2
6
6 5 4 3 2 1
Sample Output 2
-1
Constraints
1 ≤ N ≤ 10^5

-10^9 ≤ A[i] ≤ 10^9

If multiple repeating elements have the same maximum value, print the rightmost one. */
package Sorted_Arrays;

import java.util.Scanner;

public class LargestRepeatingElementDescendingOrder {
    static void minsum(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i]);
                return;
            }
        }

        System.out.print(-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        minsum(arr);
        scanner.close();
    }
}
