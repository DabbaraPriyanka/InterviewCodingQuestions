/* Write a program to print even numbers present in an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print space separated even integer values in an array.

Sample Inputs & Outputs
Sample Input 1
5
1 4 6 3 10
Sample Output 1
4 6 10
Sample Input 2
4
20 30 40 50
Sample Output 2
20 30 40 50
Constraints
1 <= N <= 10^3 -10^6 <= array elements <= 10^6 */
package Array_Traversal;

import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int[] ar = new int[N];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                System.out.print(ar[i] + " ");
            }
        }
        sc.close();
    }
}