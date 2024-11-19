/* Determine whether the given number is a multiple of 10 or not.

Input Format
The input consists of a single integer 'n'.

Output Format
Output 'Yes' if the number is a multiple of 10, otherwise output 'No'.

Sample Inputs & Outputs
Sample Input 1
50
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

public class Multipleof10 {

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
