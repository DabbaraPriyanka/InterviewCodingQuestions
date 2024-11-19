/* Write a program to print the first N natural numbers.

Input Format
First line consists of a positive integer n

Output Format
Print the number from 1 to n space separated integer.

Sample Inputs & Outputs
Sample Input 1
10
Sample Output 1
1 2 3 4 5 6 7 8 9 10 
Sample Input 2
3
Sample Output 2
1 2 3 
Constraints
1 <= n <= 10^3 */
package Loops;

import java.util.Scanner;

public class FirstNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Write your code here
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
