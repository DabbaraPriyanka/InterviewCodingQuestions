/* Write a program to find the lowest common factor of given 2 integers.

Input Format
First line contains space separated two integer input n, m.

Output Format
Print lowest common factor of 2 numbers.

Sample Inputs & Outputs
Sample Input 1
10 20
Sample Output 1
1
Sample Input 2
15 30
Sample Output 2
1
Constraints
1 <= n, m <= 10^6 */
package Loops;

import java.util.Scanner;

public class LowestCommonFactor {
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

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return 1;
    }
}
