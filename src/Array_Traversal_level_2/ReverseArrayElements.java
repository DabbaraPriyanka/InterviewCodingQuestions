/* Write a program to print numbers present in each index in an array in reverse order.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print space separated integer values stored in each index in the array in reverse order.

Sample Inputs & Outputs
Sample Input 1
5
1 4 6 3 10
Sample Output 1
10 3 6 4 1
Sample Input 2
4
20 30 40 50
Sample Output 2
50 40 30 20
Constraints
1 <= N <= 10^3
-10^6 <= array elements <= 10^6 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class ReverseArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
