/*  Write a program to find the lowest common factor of given 2 integers excluding 1 and 2.

Input Format
First line contains space separated two integer input n, m.

Output Format
Print lowest common factor of 2 numbers excluding 1 and 2.

Sample Inputs & Outputs
Sample Input 1
10 20
Sample Output 1
5
Sample Input 2
15 30
Sample Output 2
3
Constraints
1 <= n, m <= 10^6 */
package Loops;

import java.util.Scanner;

public class LCFExcluding1and2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // implement your logic here
        int lcf = findLowestCommonFactor(n, m);
        System.out.print(lcf);
        sc.close();
    }

    public static int findLowestCommonFactor(int a, int b) {
        int min = Math.min(a, b);

        for (int i = 3; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return 1;
    }
}
