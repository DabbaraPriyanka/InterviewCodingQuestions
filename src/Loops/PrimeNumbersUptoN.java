/* Print all prime numbers from 2 up to and including 'n'.

Input Format
The input is provided as a single integer 'n'.

Output Format
The function should print the prime numbers on a single line, each number separated by a space.

Sample Inputs & Outputs
Sample Input 1
2
Sample Output 1
2
Sample Input 2
15
Sample Output 2
2 3 5 7 11 13
Constraints
The value of 'n' is at least 2. */
package Loops;

import java.util.Scanner;

public class PrimeNumbersUptoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeNumbers(n);
        sc.close();
    }

    public static void printPrimeNumbers(int n) {
        // Your code to print prime numbers goes here
        for (int j = 1; j <= n; j++) {
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
