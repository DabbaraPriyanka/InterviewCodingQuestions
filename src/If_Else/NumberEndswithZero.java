/* Check if a given number ends with zero or not.

Input Format
The input consists of a single integer 'n' on a single line.

Output Format
Output 'Yes' if the number ends with zero, otherwise output 'No'.

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

public class NumberEndswithZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 10 == 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        scanner.close();
    }
}
