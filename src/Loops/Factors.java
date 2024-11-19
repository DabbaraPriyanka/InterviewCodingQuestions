/* Write a program to find factors of a given number.

Input Format
First line consists of a positive integer n

Output Format
Print the space separated integer factors of given number.

Sample Inputs & Outputs
Sample Input 1
20
Sample Output 1
1 2 4 5 10 20 
Sample Input 2
15
Sample Output 2
1 3 5 15 
Constraints
1 <= n <= 10^6 */
package Loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Write your code here
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
