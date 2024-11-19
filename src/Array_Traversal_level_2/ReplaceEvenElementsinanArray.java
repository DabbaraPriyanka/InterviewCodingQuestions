/* Write a program to find the even elements in an array and replace all even elements with ‘0’.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print the required output

Sample Inputs & Outputs
Sample Input 1
5
1 2 3 4 5
Sample Output 1
1 0 3 0 5
Sample Input 2
6
6 7 8 9 10 11
Sample Output 2
0 7 0 9 0 11
Constraints
1 <= N <= 10^3
-10^6 <= array elements <= 10^6 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class ReplaceEvenElementsinanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
