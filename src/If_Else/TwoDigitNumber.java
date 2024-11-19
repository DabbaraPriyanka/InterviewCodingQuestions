/* Check whether the given number is a two-digit number or not.

Input Format
The input consists of a single integer 'n'.

Output Format
Output 'Yes' if the number is a two-digit number, otherwise output 'No'.

Sample Inputs & Outputs
Sample Input 1
14
Sample Output 1
Yes
Sample Input 2
30
Sample Output 2
Yes
Constraints
0 <= n <= 10^9 */

package If_Else;

import java.util.Scanner;

public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 10 && n <= 99) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        scanner.close();
    }
}
