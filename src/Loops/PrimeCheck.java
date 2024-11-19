/* Write a program to find whether the given number is a prime number or not.

Input Format
First line consists of a positive integer n

Output Format
Print Yes if the number is prime, else print No

Sample Inputs & Outputs
Sample Input 1
11
Sample Output 1
Yes
Sample Input 2
15
Sample Output 2
No
Constraints
1 <= n <= 10^6 */
package Loops;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Write your code here
        scanner.close();
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("No");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("No");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Yes");
            }
        }
    }
}
