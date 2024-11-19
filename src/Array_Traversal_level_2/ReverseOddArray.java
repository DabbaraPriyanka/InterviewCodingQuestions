/* Write a program to print odd numbers present in an array in reverse order.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print space separated odd integer values stored in an array in reverse order.

Sample Inputs & Outputs
Sample Input 1
5
1 4 6 3 10
Sample Output 1
3 1
Sample Input 2
6
2 3 4 5 6 7
Sample Output 2
7 5 3
Constraints
1 <= N <= 10^3
-10^6 <= array elements <= 10^6 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class ReverseOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
