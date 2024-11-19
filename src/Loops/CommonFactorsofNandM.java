/* Print the common factors of two positive integers n and m.

Input Format
Two positive integers n and m separated by a space.

Output Format
Common factors separated by a space.

Sample Inputs & Outputs
Sample Input 1
10 25
Sample Output 1
1 5
Sample Input 2
8 12
Sample Output 2
1 2 4
Constraints
n and m are positive integers. */
package Loops;

import java.util.Scanner;

public class CommonFactorsofNandM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printCommonFactors(n, m);
        scanner.close();
    }

    public static void printCommonFactors(int n, int m) {
        // Your logic here
        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
