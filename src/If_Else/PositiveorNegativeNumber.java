/* Check if a given number is greater than 0, if yes then print 'Positive'. If the given number is lesser than 0, then print 'Negative'. If the given number is exactly equal to 0, then print 'Zero'.

Input Format
The input consists of a single integer, n.

Output Format
Print 'Positive' if n > 0. Print 'Negative' if n < 0. Print 'Zero' if n = 0.

Sample Inputs & Outputs
Sample Input 1
30
Sample Output 1
Positive
Sample Input 2
-25
Sample Output 2
Negative
Constraints
The input integer is in the range of -10^9 to 10^9. */
package If_Else;

import java.util.Scanner;

public class PositiveorNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.print("Positive");
        } else if (n < 0) {
            System.out.print("Negative");
        } else if (n == 0) {
            System.out.print("Zero");
        }
        scanner.close();
    }
}
