/* Check if a given number is the ASCII value of a numeric character or not.

Input Format
The input consists of a single line containing an integer, n.

Output Format
Print 'Yes' if the number is an ASCII value of a numeric character, and 'No' otherwise.

Sample Inputs & Outputs
Sample Input 1
50
Sample Output 1
Yes
Sample Input 2
88
Sample Output 2
No
Constraints
The input integer is in the range. */
package If_Else;

import java.util.Scanner;

public class NumberASCIICheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 48 && n <= 57) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        scanner.close();
    }
}
