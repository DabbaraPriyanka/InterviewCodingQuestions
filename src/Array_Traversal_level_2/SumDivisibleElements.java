/* Write a program to find the sum of elements which are divisible by 3 and 5 in an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print sum of elements which are divisible by 3 and 5 in an array

Sample Inputs & Outputs
Sample Input 1
5
1 4 6 3 10
Sample Output 1
0
Sample Input 2
5
15 30 35 40 45
Sample Output 2
90
Constraints
1 <= N <= 10^3 -10^6 <= array elements <= 10^6 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class SumDivisibleElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                sum += arr[i];
            }
        }
        System.out.print(sum);
        sc.close();
    }
}
