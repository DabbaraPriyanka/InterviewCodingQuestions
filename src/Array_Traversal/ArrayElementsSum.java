/* Write a program to find the sum of all elements present in an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print sum of all elements in an array.

Sample Inputs & Outputs
Sample Input 1
5
1 4 6 3 10
Sample Output 1
24
Sample Input 2
6
1 2 3 4 5 6
Sample Output 2
21
Constraints
1 <= N <= 10^3 

-10^6 <= array elements <= 10^6 */
package Array_Traversal;

import java.util.Scanner;

public class ArrayElementsSum {
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
            sum += ar[i];
        }
        System.out.print(sum);
        sc.close();
    }
}
