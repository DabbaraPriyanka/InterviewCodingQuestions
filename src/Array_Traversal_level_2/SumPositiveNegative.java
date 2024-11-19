/* Write a program to find the sum of positive elements and negative elements separately in an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
First line print sum of positive elements in an array. Second line print sum of negative elements in an array.

Sample Inputs & Outputs
Sample Input 1
6
1 -4 -6 3 10 -20
Sample Output 1
14
-30
Sample Input 2
5
5 -10 -15 20 25
Sample Output 2
50
-25
Constraints
1 <= N <= 10^3 

-10^6 <= array elements <= 10^6 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class SumPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0, nsum = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            } else {
                nsum += arr[i];
            }
        }
        System.out.println(sum);
        System.out.println(nsum);
        sc.close();
    }
}
