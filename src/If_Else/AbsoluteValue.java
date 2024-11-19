/* Write a program to find the absolute value of a given integer.

Input Format
The input consists of a single integer, n.

Output Format
Print the absolute value of the integer.

Sample Inputs & Outputs
Sample Input 1
-5
Sample Output 1
5
Sample Input 2
12
Sample Output 2
12
Constraints
The input integer is in the range of -10^9 to 10^9. */
package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n * -1) > 0) {
            System.out.print(n * -1);
        } else {
            System.out.print(n);
        }
        scanner.close();
    }
}
