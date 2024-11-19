/* Write a program to print all the multiples of 2 till N.

Input Format
First line consists of a positive integer n

Output Format
Print the numbers from 2 to n which are multiples of 2.

Sample Inputs & Outputs
Sample Input 1
15
Sample Output 1
2 4 6 8 10 12 14 
Sample Input 2
3
Sample Output 2
2 
Constraints
2 <= n <= 10^3 */
package Loops;

import java.util.Scanner;

public class MultiplesofTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Write your code here
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
