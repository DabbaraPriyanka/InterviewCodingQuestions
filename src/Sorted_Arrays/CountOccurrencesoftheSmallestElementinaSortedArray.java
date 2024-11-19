/* Count the number of times the smallest element occurs in a sorted array.

Input Format
The input consists of two lines:

The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5).

The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

Output Format
Print a single integer, the count of occurrences of the smallest element in the array.

Sample Inputs & Outputs
Sample Input 1
8
1 2 3 3 4 4 4 5
Sample Output 1
1
Sample Input 2
10
1 1 2 2 2 3 3 3 3 4
Sample Output 2
2
Constraints
1 ≤ N ≤ 10^5

-10^9 ≤ A[i] ≤ 10^9 */
package Sorted_Arrays;

import java.util.Scanner;

public class CountOccurrencesoftheSmallestElementinaSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ar[] = new int[N];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        int count = 1;
        for (int i = 1; i < ar.length; i++) {
            if (ar[0] == ar[i]) {
                count++;
            }
        }
        System.out.print(count);
        scanner.close();
    }
}
