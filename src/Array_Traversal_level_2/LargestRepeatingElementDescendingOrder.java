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
package Array_Traversal_level_2;

import java.util.Scanner;

public class LargestRepeatingElementDescendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int small = -999;
        int count = 0;
        for (int i = 1; i < N; i++) {
            if (arr[i - 1] == arr[i]) {
                if (arr[i] > small) {
                    small = arr[i];
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.print(-1);
        } else {
            System.out.print(small);
        }
        scanner.close();
    }
}
