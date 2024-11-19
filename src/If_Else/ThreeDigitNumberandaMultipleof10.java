/* Check if a given number is a three-digit number and also a multiple of 10.

Input Format
The input consists of a single integer 'n' on a single line.

Output Format
Output 'Yes' if the number is a three-digit number and a multiple of 10, otherwise output 'No'.

Sample Inputs & Outputs
Sample Input 1
145
Sample Output 1
No
Sample Input 2
100
Sample Output 2
Yes
Constraints
0 <= n <= 10^9 */

package If_Else;

import java.util.Scanner;

public class ThreeDigitNumberandaMultipleof10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 10 == 0 && n >= 100 && n <= 999) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        scanner.close();
    }
}
