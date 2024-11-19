/* Write a Java program to find the smallest number among two given integers.

Input Format
The first line contains the first integer n. The second line contains the second integer m.

Output Format
Print the smallest number among the two input numbers.

Sample Inputs & Outputs
Sample Input 1
10
30
Sample Output 1
10
Sample Input 2
5
5
Sample Output 2
5
Constraints
Both integers are in the range of [-10^9, 10^9]. */
package If_Else;

import java.util.Scanner;

public class SmallestNumberofTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n <= m) {
            System.out.print(n);
        } else {
            System.out.print(m);
        }
        scanner.close();
    }
}
