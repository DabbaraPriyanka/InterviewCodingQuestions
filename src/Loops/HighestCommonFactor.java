/* Write a program to find the greatest common factor of given 2 integers.

Input Format
First line contains space separated three integer input n, m.

Output Format
Print greatest common factor of 2 numbers.

Sample Inputs & Outputs
Sample Input 1
10 20
Sample Output 1
10
Sample Input 2
15 30
Sample Output 2
15
Constraints
1 <= n, m <= 10^6 */
package Loops;

import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // implement your logic here
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        System.out.print(n);
        sc.close();
    }
}
