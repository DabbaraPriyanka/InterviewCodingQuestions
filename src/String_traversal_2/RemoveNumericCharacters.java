/* Remove all numeric characters from a given string.

Input Format
The input consists of a single line containing a string that may contain numerical characters.

Output Format
Output a single line containing the modified string after removing all numerical characters.

Sample Inputs & Outputs
Sample Input 1
Tap123Academy456
Sample Output 1
TapAcademy
Sample Input 2
P1r2o3g4r5a6m7m8i9n10g!
Sample Output 2
Programming!
Constraints
The input string will consist of printable ASCII characters. */
package String_traversal_2;

import java.util.Scanner;

public class RemoveNumericCharacters {
    static String removeNumeric(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                r += ch;
            }

        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print(removeNumeric(input));
        scanner.close();
    }
}
