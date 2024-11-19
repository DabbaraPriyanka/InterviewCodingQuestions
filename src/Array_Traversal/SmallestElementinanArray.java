/* Write a program to find the smallest element in a given array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print smallest element in an array

Sample Inputs & Outputs
Sample Input 1
5
1 5 7 3 2
Sample Output 1
1
Sample Input 2
6
0 -1 -2 -3 -4 -5
Sample Output 2
-5
Constraints
1 <= N <= 10^3
-10^6 <= array elements <= 10^6 */
package Array_Traversal;

import java.util.Scanner;

public class SmallestElementinanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int[] ar = new int[N];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int min = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.print(min);
        sc.close();
    }
}
