/* Given a string, remove all alphanumeric characters and return the modified string.

Input Format
The input consists of a single line containing a string, S.

Output Format
Output a single string after removing all the alphanumeric characters.

Sample Inputs & Outputs
Sample Input 1
tap@123#
Sample Output 1
@#
Sample Input 2
H3ll0 W0rld!
Sample Output 2
 !
Constraints
1 <= |S| <= 1000 S contains alphanumeric characters, spaces, and special characters. */
package String_traversal_2;

import java.util.Scanner;

public class RemoveAlphanumeric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {
                System.out.print(ch);
            }
        }
        scanner.close();
    }
}