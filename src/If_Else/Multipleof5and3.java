/* Check whether the given number is a multiple of both 5 and 3.

Input Format
The input consists of a single integer 'n'.

Output Format
Output 'Yes' if the number is a multiple of both 5 and 3, otherwise output 'No'.

Sample Inputs & Outputs
Sample Input 1
15
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

public class Multipleof5and3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 5 == 0 && n % 3 == 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        scanner.close();
    }
}
