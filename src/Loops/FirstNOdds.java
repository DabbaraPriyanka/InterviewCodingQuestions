/* Write a program to print the first N odd natural numbers.

Input Format
First line consists of a positive integer n

Output Format
Print the number from 1 to n space separated odd integers.

Sample Inputs & Outputs
Sample Input 1
5
Sample Output 1
1 3 5 7 9 
Sample Input 2
3
Sample Output 2
1 3 5 
Constraints
1 <= n <= 10^3 */
package Loops;

import java.util.Scanner;

public class FirstNOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Write your code here
        for (int i = 1; i <= n; i++) {
            System.out.print(((i * 2) - 1) + " ");
        }
        scanner.close();
    }
}
