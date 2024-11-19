/* Count the number of occurrences of the largest element in an ascending sorted array.

Input Format
The input consists of two lines:

The first line contains a single integer N, representing the size of the array (1 ≤ N ≤ 10^5).

The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

Output Format
Print a single integer, the count of occurrences of the largest element in the array.

Sample Inputs & Outputs
Sample Input 1
8
1 2 3 3 4 4 4 5
Sample Output 1
1
Sample Input 2
6
1 2 3 4 5 6
Sample Output 2
1
Constraints
1 ≤ N ≤ 10^5

-10^9 ≤ A[i] ≤ 10^9 */

package Array_Traversal_level_2;

import java.util.Scanner;

public class CountLargestElementOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = -999;
        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == max) {
                count++;
            }
        }
        System.out.print(count);
        scanner.close();
    }
}