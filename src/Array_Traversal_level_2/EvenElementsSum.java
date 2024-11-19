/* Write a program to find the sum of all even elements present in an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print sum of all even elements in an array.

Sample Inputs & Outputs
Sample Input 1
5
1 4 6 3 10
Sample Output 1
20
Sample Input 2
6
1 2 3 4 5 6
Sample Output 2
12
Constraints
1 <= N <= 10^3 -10^6 <= array elements <= 10^6 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class EvenElementsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.print(sum);
        sc.close();
    }
}
