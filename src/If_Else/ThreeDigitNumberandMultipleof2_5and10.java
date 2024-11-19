/* Check if a given number is a three-digit number and also a multiple of 2, 5, and 10.

Input Format
The input consists of a single integer 'n' on a single line.

Output Format
Output 'Yes' if the number is a three-digit number and a multiple of 2, 5, and 10, otherwise output 'No'.

Sample Inputs & Outputs
Sample Input 1
140
Sample Output 1
Yes
Sample Input 2
145
Sample Output 2
No
Constraints
0 <= n <= 10^9 */
package If_Else;

import java.util.Scanner;

public class ThreeDigitNumberandMultipleof2_5and10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0 && n % 5 == 0 && n % 10 == 0 && n >= 100 && n <= 999) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        scanner.close();
    }
}
