/* Converts a given string from uppercase to lowercase.

Input Format
The input consists of a single line containing a string.

Output Format
Output the converted string in lowercase.

Sample Inputs & Outputs
Sample Input 1
HELLO WORLD!
Sample Output 1
hello world!
Sample Input 2
TapACADemy
Sample Output 2
tapacademy
Constraints
1 <= String length <= 100 */
package String_traversal_2;

import java.util.Scanner;

public class UppercasetoLowercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                r += (char) (((int) ch) + 32);
            } else {
                r += ch;
            }
        }
        System.out.print(r);
        scanner.close();
    }
}
