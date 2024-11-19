/* Print all prime numbers between n1 and n2.

Input Format
Two positive integers n1 and n2 separated by a space.

Output Format
Prime numbers separated by a space.

Sample Inputs & Outputs
Sample Input 1
12 40
Sample Output 1
13 17 19 23 29 31 37
Sample Input 2
90 120
Sample Output 2
97 101 103 107 109 113
Constraints
n1 and n2 are at least 2, and n1 ≤ n2. */
package Loops;

import java.util.Scanner;

public class PrimeNumbersbetweenn1andn2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        printPrimeNumbers(n1, n2);
        scanner.close();
    }

    public static void printPrimeNumbers(int n1, int n2) {
        // Your logic here
        for (int j = n1; j <= n2; j++) {
            int i, m = 0, flag = 0;
            m = j / 2;
            if (j == 0 || j == 1) {
                continue;
            } else {
                for (i = 2; i <= m; i++) {
                    if (j % i == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
