/* Write a program to print common multiples of 2 numbers.

Input Format
First line contains a single integer input n. Second line contains space separated 2 integer input a, b.

Output Format
Print first n common multiples of a and b.

Sample Inputs & Outputs
Sample Input 1
9
3 4
Sample Output 1
12 24 36 48 60 72 84 96 108
Sample Input 2
5
5 7
Sample Output 2
35 70 105 140 175
Constraints
1 <= n <= 10^3 1 <= a, b <= 10^3 */
package Loops;

import java.util.Scanner;

public class CommonMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement your logic here
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        commonMultiples(n, a, b);
        scanner.close();
    }

    public static void commonMultiples(int n, int a, int b) {
        int count = 0;
        int lcm = leastCommonMultiple(a, b);
        for (int i = lcm; count < n; i += lcm) {
            System.out.print(i + " ");
            count++;
        }
    }

    public static int leastCommonMultiple(int a, int b) {
        int max = Math.max(a, b);
        int lcm = max;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm += max;
        }

        return lcm;
    }
}
