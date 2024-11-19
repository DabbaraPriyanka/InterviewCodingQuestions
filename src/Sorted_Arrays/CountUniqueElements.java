/* Count the number of unique elements in an ascending sorted array.

Input Format
The input consists of two lines:

The first line contains a single integer N, representing the size of the array (1 ≤ N ≤ 10^5).

The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

Output Format
Print a single integer, the count of unique elements in the array.

Sample Inputs & Outputs
Sample Input 1
8
1 2 3 3 4 4 4 5
Sample Output 1
3
Sample Input 2
6
1 2 3 4 5 6
Sample Output 2
6
Constraints
1 ≤ N ≤ 10^5

-10^9 ≤ A[i] ≤ 10^9 */
package Sorted_Arrays;

import java.util.Scanner;

public class CountUniqueElements {
    static void minsum(int[] arr) {
        int count = 1;
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    k++;
                }
                count = 1;
            }
        }
        if (count == 1) {
            k++;
        }

        System.out.print(k);
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
