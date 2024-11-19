/* Write a program to count factors of a given number.

Input Format
First line consists of a positive integer n

Output Format
Print the integer count.

Sample Inputs & Outputs
Sample Input 1
20
Sample Output 1
6
Sample Input 2
15
Sample Output 2
4
Constraints
1 <= n <= 10^6 */
package Loops;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Write your code here
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.print(count);
        scanner.close();
    }
}
