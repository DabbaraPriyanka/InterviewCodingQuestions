/* Write a program to print all the numbers which are multiples of either 2, 5 or 7 till N.

Input Format
First line consists of a positive integer n

Output Format
Print the number from 2 to n space separated multiples of 2, 5 and 7 integers.

Sample Inputs & Outputs
Sample Input 1
15
Sample Output 1
2 4 5 6 7 8 10 12 14 15 
Sample Input 2
10
Sample Output 2
2 4 5 6 7 8 10 
Constraints
2 <= n <= 10^3 */
package Loops;

import java.util.Scanner;

public class MultiplesofTwoFiveSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Write your code here
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0 || i % 5 == 0 || i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
