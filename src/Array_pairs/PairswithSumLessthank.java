/* Print all pairs of numbers from the input array whose sum is less than the target value k.

Input Format
The first line contains an integer N, representing the size of the array.

The second line contains N space-separated integers, representing the elements of the array.

The third line contains a single integer k, representing the target value.

Output Format
Print each pair of numbers on a new line, separated by a space.

Sample Inputs & Outputs
Sample Input 1
6
2 4 6 3 8 9
10
Sample Output 1
2 4
2 6
2 3
4 3
6 3
Sample Input 2
5
1 2 3 4 5
7
Sample Output 2
1 2
1 3
1 4
1 5
2 3
2 4
Constraints
1 <= N <= 1000

-1000 <= Array elements <= 1000

-10^9 <= k <= 10^9 */
package Array_pairs;

import java.util.Scanner;

public class PairswithSumLessthank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int csum = 0;
            for (int j = i + 1; j < N; j++) {
                csum = arr[i] + arr[j];
                if (csum < k) {
                    System.out.println(arr[i] + " " + arr[j]);
                }

            }
        }
        scanner.close();
    }
}
