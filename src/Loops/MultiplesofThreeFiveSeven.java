/* Write a program to print the first N multiples of either 3, 5 or 7.

Input Format
First line consists of a positive integer n

Output Format
Print the first N multiples of either 3, 5 or 7, space separated.

Sample Inputs & Outputs
Sample Input 1
10
Sample Output 1
3 5 6 7 9 10 12 14 15 18 
Sample Input 2
5
Sample Output 2
3 5 6 7 9 
Constraints
1 <= n <= 10^3 */
package Loops;

import java.util.Scanner;

public class MultiplesofThreeFiveSeven {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int number = 1; count < n; number++) {
            if (number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
                System.out.print(number + " ");
                count++;
            }
        }
        scanner.close();
    }
}
