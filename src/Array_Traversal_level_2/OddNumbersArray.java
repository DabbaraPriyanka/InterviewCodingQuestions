/* Write a program to print odd numbers present in an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print space separated odd integer values stored in an array.

Sample Inputs & Outputs
Sample Input 1
5
1 4 6 3 10
Sample Output 1
1 3
Sample Input 2
4
21 31 41 51
Sample Output 2
21 31 41 51
Constraints
1 <= N <= 10^3
-10^6 <= array elements <= 10^6 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class OddNumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
