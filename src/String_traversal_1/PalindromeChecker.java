/* Checks whether a given string is a palindrome or not.

Input Format
The input consists of a single line containing a string.

Output Format
Output 'Yes' if the string is a palindrome, 'No' otherwise.

Sample Inputs & Outputs
Sample Input 1
radar
Sample Output 1
Yes
Sample Input 2
TapAcademy
Sample Output 2
No
Constraints
1 <= String length <= 100 */
package String_traversal_1;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String r = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            r += input.charAt(i);
        }
        if (input.equals(r)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        scanner.close();
    }
}
