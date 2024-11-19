/* Write a program to find the average of all elements present in an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print float value of average of all elements in an array. [it has to print 2 decimal points]

Sample Inputs & Outputs
Sample Input 1
5
1 4 6 3 10
Sample Output 1
4.80
Sample Input 2
5
5 -10 -15 20 -25
Sample Output 2
-5.00
Constraints
1 <= N <= 10^3 -10^6 <= array elements <= 10^6 */
package Array_Traversal;

import java.util.Scanner;

public class AverageofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int[] ar = new int[N];
        float sum = 0;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        float d = sum / N;
        System.out.format("%.2f", d);
        sc.close();
    }
}
