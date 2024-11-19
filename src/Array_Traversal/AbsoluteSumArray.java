/* Write a program to find the absolute sum of all elements present in an array.

Input Format
First line contains a single integer N.

Second line contains N space separated integer values.

Output Format
Print Absolute sum of all elements in an array.

Sample Inputs & Outputs
Sample Input 1
6
1 -4 -6 3 10 -20
Sample Output 1
44
Sample Input 2
5
5 -10 -15 20 -25
Sample Output 2
75
Constraints
1 <= N <= 10^3 -10^6 <= array elements <= 10^6 */
package Array_Traversal;

import java.util.Scanner;

public class AbsoluteSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int[] ar = new int[N];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0) {
                sum += (ar[i] * -1);
            } else {
                sum += ar[i];
            }
        }
        System.out.print(sum);
        sc.close();
    }
}
