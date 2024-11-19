/* Check whether the given number is a three-digit number or not.

Input Format
The input consists of a single integer 'n'.

Output Format
Output 'Yes' if the number is a three-digit number, otherwise output 'No'.

Sample Inputs & Outputs
Sample Input 1
145
Sample Output 1
Yes
Sample Input 2
1000
Sample Output 2
No
Constraints
0 <= n <= 10^9 */

package If_Else;

import java.util.Scanner;

public class ThreeDigitNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 100 && n <= 999) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        scanner.close();
    }
}
